# at-library-core-example

# Перед запуском тестов выполнить(для скачивания allure):
mvn allure:report

# Для запуска:
mvn clean test -Dbrowser=chrome allure:serve

# Для запуска с proxy:
mvn clean test -Dbrowser=chrome -Dproxy=ip:port allure:serve


curl -s https://aerokube.com/cm/bash | bash



./cm selenoid start --browsers 'firefox:51.0;firefox:55.0;chrome:66.0;android:6.0'


./cm selenoid configure [--browsers 'firefox:>45.0;opera:53.0;android:6.0'] [--last-versions 2] [--tmpfs 128]



# Selenoid:

./cm selenoid start --vnc --browsers 'android:6.0;chrome:72.0;firefox:65.0;opera:58.0' --args  "-limit 15"

./cm selenoid cleanup

./cm selenoid start --vnc --browsers 'android:6.0;chrome:72.0;firefox:65.0;opera:58.0' --args  "-limit 15 -session-attempt-timeout 2m -service-startup-timeout 2m"


# SSL:

openssl req -new -key private.key -out domain-name.csr

Следующие атрибуты менять можно ТОЛЬКО после согласования с ДАТИ:

O=BrokerCreditService Ltd.

OU=IT

L=Novosibirsk

S = Novosibirskaya obl.

C=RU

CM=selenoid.testspace.bcs.ru




 domain-name.csr
 
 -----BEGIN CERTIFICATE REQUEST-----
MIIC/zCCAecCAQAwgbkxCzAJBgNVBAYTAlJVMRwwGgYDVQQIDBNOb3Zvc2liaXJz
a2F5YSBvYmwuMRQwEgYDVQQHDAtOb3Zvc2liaXJzazEhMB8GA1UECgwYQnJva2Vy
Q3JlZGl0U2VydmljZSBMdGQuMQswCQYDVQQLDAJJVDEiMCAGA1UEAwwZc2VsZW5v
aWQudGVzdHNwYWNlLmJjcy5ydTEiMCAGCSqGSIb3DQEJARYTcGF2bG92YXBAbXNr
LmJjcy5ydTCCASIwDQYJKoZIhvcNAQEBBQADggEPADCCAQoCggEBAOFs3Llo8ovj
DP5u/RGKiZYREc6FWKirBnqVzyq1IZAmGvANmwELAsAKcunP7OAZ6w2AXvv3PKAO
PZ5XS6T/2QoRIP73XvktpLAitFSCjWrxFHmKsdFLEqNEMEHej8HzDN0ZlENxIxq9
aUlLpgT1Q28ZFaDjSVb2fMvIkbMX/Jw93RyQykFPAC6HqcxfnLgUnGhmtA0q0ne3
6BbfedsU7OQfLtp2hID10xp2ln36FgDC2lZ7UA53QPHLUm66kA2vwoH/3qLYu7Ol
G37LUWgRih6Kv9xUIiwQJjO0/iOohRsJMEIfhIQQOq9FAn51hgURRWNp0ui4PVQV
M94dqCTiBIsCAwEAAaAAMA0GCSqGSIb3DQEBCwUAA4IBAQB2920NbVEyGeZXsjjZ
RCSHvcwuNVX5guwREIf9MXRtyZp7xzrxccn/bsH0RvgNEJjQhs6wXAjJADKbMEyb
6CKOwROzLwAOVE4BAZGt7ZIPOWJUNuPKt0glwytfpVYjB+q3MHiMEut+OkCExnQ/
eWmSchlSgvT7f1p7Dfkbcz/7DBTlY8O9u5C/iSdcDvAZWThj8hcF10dUHt9dqglQ
zzTzO+FCJmAArJg/yGMn4hup20nJ8LpcT5Rk34ZGHOsrAKHjXPu5GLdGcPjD9A04
Yv2vQfFlH3LA7d+eCuBOz8jac1vhK374xkH4EIeLAdnLYrXQQ487JhAOXqAGPkHn
kNI/
-----END CERTIFICATE REQUEST-----