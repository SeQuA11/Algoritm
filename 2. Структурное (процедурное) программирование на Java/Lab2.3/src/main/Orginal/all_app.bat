@echo off
title Java Program Runner

echo Start MyHello...
java -jar MyHello.jar 
echo.

echo Start MySum...
set /p num="Input: "
for /f "tokens=*" %%i in ('java -jar MySum.jar %num%') do set "sum_result=%%i"
echo Result MySum: %sum_result%
echo.

echo Start EvenOdd with the result MySum...
java -jar EvenOdd.jar %sum_result%
echo.

pause