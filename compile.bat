@echo off


if "%~1"=="" (
    echo Please provide an argument.
    exit /b
)

set MainClass=%~1
set arg=%~2

javac -d compiled *.java

java -cp ./compiled %MainClass% %arg%

