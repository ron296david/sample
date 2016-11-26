@echo off
set BRANCHFINISH=%1
echo Look for: %BRANCHFINISH%
for /f %%i in ('git log -1') do set VAR=%%i
rem git log -1>temp.txt
rem set /p VAR=<temp.txt
echo Git last comment  = %VAR%


if %VAR% == %BRANCHFINISH% (
	echo Branch is finished - merging and trying to push to master...
	echo "Merge and push to master"
	git checkout master
	git pull origin master
	git merge masterCopy
	git push origin master
)