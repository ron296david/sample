@echo off
set BRANCHFINISH=%1
echo Look for: %BRANCHFINISH%
for /f %%i in ('git log -1') do set VAR=%%i
rem git log -1>temp.txt
rem set /p VAR=<temp.txt
echo Git last comment  = %VAR%


rem if %VAR% == %BRANCHFINISH% (
rem 	echo Branch is finished - merging and trying to push to master...
rem 	echo "Merge and push to master"
rem 	git checkout master
rem 	git pull origin master
rem 	git merge masterCopy
rem 	git push origin master

