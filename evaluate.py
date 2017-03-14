from source.projectEvaluator import *
import sys

projectName = 'Project06'#sys.argv[1]
unzip(projectName)
processSourceFiles(projectName)
runCodes(projectName)
