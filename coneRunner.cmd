@echo off
echo make sure you have the cloned file in your "USER" directory (assuming you are a windows users)
pause
cd c:\users\%username%\3DBodyCalculator\src\main
:autoRun
set /P c=Do You Want To Run The coneVolume Program?[Y/N]?
if /I "%c%" EQU "Y" javac coneVolume.java && java coneVolume.java
if /I "%c%" EQU "N" exit
goto :autoRun