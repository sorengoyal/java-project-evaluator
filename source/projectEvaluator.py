#%%
import os.path
import zipfile
import sys
from source.modifyCode import modifyCode
def bashCall(cmd, func = sys.exit):
    err = os.system(cmd)
    if(err != 0 ):
        print('ERROR: Failed to execute\n' + '"' + cmd + '"')
        func()
        return True
    return False
def prompt(msg, defaultOpt, otherOpt):
    ch = input(msg)
    while(ch != '' and ch != defaultOpt and ch != otherOpt and otherOpt != '*'):
        print('Invalid choice')
        ch = input(msg)
    if(ch == ''):
        return defaultOpt
    return ch
#%%
#Extract each file into its own folder
def unzip(projectName):
    root = os.getcwd()
    submissions = 'submissions'
    #Go the folder
    os.chdir(submissions + '/' + projectName)
    #Check if a zip file with the name 'submissions' exists or not
    exists = False
    for f in os.listdir():
        if(f == 'submissions.zip'):
            exists = True
            break
    if(exists == False):
        print('Submissions.zip not found')
        return 0
    #Extract all directories
    bashCall('mkdir ' + projectName)
    with zipfile.ZipFile('submissions.zip') as zf:
        zf.extractall(projectName + '/',)
    #Rename the extracted files correctly
    valids = []
    invalids = [] #Some students do not submit archive, correct their submissions accordingly
    os.chdir(projectName)
    fileList = os.listdir()
    for file in fileList:
        tokens = file.split('.')
        studentName = tokens[0].split('_')[0]
        ext = tokens[1]
        if(ext == 'java'):
            os.mkdir(studentName)
            bashCall('cp ' + file + ' ' + studentName + '/' +'Project.java')
            invalids.append(studentName)
        elif(ext == 'zip'):
            os.mkdir(studentName)
            with zipfile.ZipFile(file) as zf:
                zf.extractall(studentName + '/')
            valids.append(studentName)
        os.remove(file)
        print('Successfully extracted file for ' + studentName)
    print(str(len(valids))  + ' valid submissions extracted')
    print(str(len(invalids))  + ' invalid submissions extracted:')
    [print(name) for name in invalids]
    os.chdir(root + '/' + submissions + '/' + projectName)
    #Create a file with the list of names
    nameList = valids + invalids
    nameList.sort()
    with open('namelist.txt', 'w') as f:
        [f.write("%s\n" % item) for item in nameList]
    os.chdir(root)
#%%        
def find(name, path):
    for root, dirs, files in os.walk(path):
        for file in files:
            if(file.rfind(name) != -1):
                return os.path.join(root, file)
    return ''
#%%
def makePdf(filename, newFileName):
    with open(filename) as original:
        code = original.readlines()
    with open('temp' + '/' + newFileName + '.java', 'x') as newFile:
        newFile.writelines(code)
    newFile = 'temp' + '/' + newFileName
    bashCall('enscript ' +  newFile + '.java -o - | ps2pdf - ' + newFile + '.pdf')
#%%
def processSourceFiles(projectName):
    root = os.getcwd()
    submissions = 'submissions'
    os.chdir(submissions + '/' + projectName)
    os.mkdir('submissions')
    with open('namelist.txt') as f:
        lines = f.readlines()
    namelist = [line.strip() for line in lines]
    errorList = []
    newNameList = []
    for name in namelist:
        filename = find('java', projectName +'/' + name)
        if(len(filename) == 0): #If the source file for this student was not found
            errorList.append(name + ' Could not find a .java file')
            print(name + ' Could not find a .java file')
            continue
        else:
            os.mkdir('submissions/' + name)
            try: #To catch when the source file was not submitted in the correct encoding
                with open(filename) as f:
                    originalCode = f.readlines()
            except Exception:
                print('An Error occurred while reading source code of ' + name )
                print('Code read:')
                for line in originalCode:
                    print(line)
                sys.exit()
            newCode = modifyCode(originalCode)
            with open('submissions/' + name + '/' + 'Project.java', 'w') as f:
                f.writelines(newCode)
            print('Successfully processed file for ' + name)
            newNameList.append(name + '\n')
    with open('scores.txt', 'a') as f:
        f.writelines(errorList)
    #namelist = [line + '\n' for line in lines]
    with open('namelist.txt', 'w') as f:
        f.writelines(newNameList)
    os.chdir(root)
#%%
def runCodes(projectName):
    root = os.getcwd()
    submissions = 'submissions'
    os.chdir(submissions + '/' + projectName)
      
    with open('scores.txt', 'a') as scores:
        with open('namelist.txt') as f:
            names = f.readlines()
        names = [line.strip() for line in names]
        for name in names:
            os.chdir(root + '/' + submissions + '/' + projectName + '/' + submissions)
            val = bashCall('javac ' + name + '/' + 'Project.java', lambda:())
            if(val != 0):
                scores.write(name + ' 0 Could not Compile\n')
                print(name + ' 0 Could not Compile')
                continue
            val = bashCall('cp ' + name + '/' + 'Project.class ../../../junit-tests/'+ projectName + '/', lambda:())
            if(val != 0):
                scores.write(name + ' 0 Could not copy\n')
                print(name + ' 0 Could not copy')
                continue
            os.chdir(root + '/junit-tests/' + projectName)
            cmd = './script.sh'
            val = bashCall(cmd, lambda:())
            if(val != 0):
                scores.write(name + ' 0 Could not Execute\n')
                print(name + ' 0 Could not Execute')
                continue
            with open('score.txt') as result:
                score = result.read()
                scores.write(name + ' ' + score + '\n')
                print(name + ' ' + score)
    os.chdir(root)