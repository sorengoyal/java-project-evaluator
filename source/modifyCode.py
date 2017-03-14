def modifyCode(code):
    newcode = renameClass(code, 'Project')
    newcode = replaceRandom(newcode, '0')
    newcode = removePackageLine(newcode)
    return newcode
    
def renameClass(code, newName):
    newcode = []
    for line in code:
        if (line.rfind('class') != -1) : 
            if(line.rfind('{')):
                newcode.append('public class ' + newName +' {')
            else:
                newcode.append('public class ' + newName)
        else:
            newcode.append(line)
    return newcode
    
def replaceRandom(code, text):
    newcode = []
    for line in code:
        newcode.append(line.replace('Math.random()', text))
    return newcode
    
def removePackageLine(code):
    newcode = []
    for line in code:
        if(line.rfind('package') != -1):
            continue
        newcode.append(line)
    return newcode 