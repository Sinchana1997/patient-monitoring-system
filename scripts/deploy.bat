@echo off

echo 🔴 Stopping existing backend...
for /f "tokens=2 delims=," %%a in ('tasklist /FI "IMAGENAME eq java.exe" /FO CSV /NH') do taskkill /PID %%a

echo 🟢 Starting backend...
start java -jar patient-monitoring-backend\target\*.jar

echo 🌐 Deploying frontend...
xcopy /E /Y patient-monitoring-frontend\dist\* C:\inetpub\wwwroot\
