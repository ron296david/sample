@echo off

for /f %%i in ('git log -1') do set VAR=%%i
rem git log -1>temp.txt
rem set /p VAR=<temp.txt
echo %VAR%



if "finish" in %VAR% goto FoundIt 
echo Did not find finish.
exit 1

:FoundIt
echo Found finish!
exit 0

rem --pretty=%B - not working
