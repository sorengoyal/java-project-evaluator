#%%
import os.path
import zipfile
import sys

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
def unzip(folder):
    originalDir = os.getcwd()
    [root, projectName] = folder.split('/')
    #Go the folder
    os.chdir(folder)
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
            bashCall('cp ' + file + ' ' + studentName + '/' + projectName+'.java')
            invalids.append(studentName)
        elif(ext == 'zip'):
            os.mkdir(studentName)
            with zipfile.ZipFile(file) as zf:
                zf.extractall(studentName + '/')
            valids.append(studentName)
        os.remove(file)
    print(str(len(valids))  + ' valid submissions extracted')
    print(str(len(invalids))  + ' invalid submissions extracted:')
    [print(name) for name in invalids]
    os.chdir(originalDir + '/' + root + '/' + projectName)
    #Create a file with the list of names
    nameList = valids + invalids
    nameList.sort()
   
    with open('namelist.txt', 'w') as f:
        [f.write("%s\n" % item) for item in nameList]
