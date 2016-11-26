@echo off
set FINISHBRANCH=%1

for /f %%i in ('git log -1') do set VAR=%%i
rem git log -1>temp.txt
rem set /p VAR=<temp.txt
echo %VAR%

if %VAR% == %FINISHBRANCH% echo pushing to master

rem if "finish" in %VAR% goto FoundIt 
rem echo Did not find finish.
rem exit 1

rem :FoundIt
rem echo Found finish!
rem exit 0

rem --pretty=%B - not working
