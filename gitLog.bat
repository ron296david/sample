@echo off

for /f %%i in ('git log -1') do set VAR=%%i
rem git log -1>temp.txt
rem set /p VAR=<temp.txt
echo %VAR%


rem --pretty=%B - not working
