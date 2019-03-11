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


selenoid.testspace.bcs.ru

-----BEGIN RSA PRIVATE KEY-----
Proc-Type: 4,ENCRYPTED
DEK-Info: DES-EDE3-CBC,385ABE1D705F5343

U53in7uxNvAXsxaYV1fepctHHAPHb5ptPChA2SGTyxuHbuTBm5AsMsMuZdGEgUmy
5l4C+jNSXK+QR5DNXZeqvNX+M9s9BrA581Q5bXQKN05r03LLbTcuKfcnj/X5VDw+
z3V19MaaaOK/+PLXDP+DWFJGfQmMbo9zdJT9Q1o3Iwg8t16NQGKqq4S+mlx0wiA9
BuoXTx1Bgeygkj/kWf9J7kA4kp2MBU86LYxVHB1bSuVMiNochlh9lutoFAPhCKnn
YEiVaPpkavp8PAmHNJs8b3Orw5JqHb4katZ9irLaB3pcYDQgUx7mA0Fk3v3JlD8+
5zoimfNZoTXTaYIbxFRtMQgQIuJwd4x6H3/iB5aA987Dh+4PbMS+tcxmayd1f5T5
1+zd1HgCvGlfY+0s7/pMUf1NDpXJYMLmc5ifViziB3rewvcxR0aDMupb9A0tU+FK
SvD8OG0eAdqUSyS0OWK9m77KBKPqxkAtVs1Oh0cXCdqrWz+BeinINUxukmAnVb9O
LaYz6AXj2TDg4Yvpd0NB9ah/W0zJOHzpHdaacVToAGOvbz8tMF++yy/6AxtgQX2e
wbvGMO4rSTiEfcL7M6qDWISGkaT71YWSQiOhRG+JyGEPCZuE0s5s0kMukk9SoRSk
GaiV3lKBZTjBxf691srpsEirLgEefJfXCqdldxpOL36E69Gnvin1fu1Dv238PZuX
WqSLQhedsAioEDIYbMiOJRAY6OLvQAfY33eQvOvZpqK5k2g0kx9oRqivbDw2jO3S
TdnbiQma0uCuWK0x0F89vmmsPRj0xXqsLE0ExZJAx8D5gJkPIGPtQDqjNV6apUsy
JaZIe2Oeq0zi5/SCy4EI96zLudIZahu5/bUZO90oNv+peMQ308UjuEymQxnG26AY
mRBBfy+oeYNOqZrjVqjjmT/nQeQfs+ybBHuBpyXGS90ldWhaDWetUwE4WV3DvC6b
lV61VDhdc5JM8vA1XazQc42Cg6+XMMJIotmGizZgSI4DY/FotY9IAeSDZq09xxqz
nYqM5OfUwYuQ8SoX4zhGHtIzKoPkmVXRNycl2mlUXMpy2SDidHAwAAgTLv4Bi+Sn
BjB7coInPPMvCWIsv4WHV/jjfgDub2AIzLOpJEDhcVW0cQ2fjv2yWyEMi1LGTG5r
n2TiHQ+0eu5Xcec18C2zbYJJLpuRdSXJFX+GXmU2Dhr4EnoHFjXPysLi+LnSh6oP
kGP4kzDwpH3Q6aCd/s1H7Rkc2YjdR9pSPN96NHvsNXrwbSimCeSn2JkavfMkpS6P
xASVV7eSGhHT5LEbpCBi4IkMwMdzFz43waZ5RnIJvijWZIRillyfKiiNOmlmA5DN
V55bU1APjmIdj1OgrLay/3BR11h+ux4gW12s0wF2tX+3qTrI03L5peg9UG86iBJK
fDCJQTtBvQYHxsVAOabArnR0iiu24on3WJagSYD0P9l2X8OAsx6M3flbSQurJKx3
2MgokeE8wa6SPlmaD0z0NPUsOU0bIs/I6hRexpphWagpU2fkO8IlC3DzCIOYP//3
HF2DHPLfK/1viXhPJMcQoG/5TxHpu/Iv0QOhhbb6Qi/cUoxXpGVSsvwwcHsPqxdt
-----END RSA PRIVATE KEY-----

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

password:
QAWuGhy2SL




$ cat /etc/grid-router/quota/test.xml
<qa:browsers xmlns:qa="urn:config.gridrouter.qatools.ru">
<browser name="firefox" defaultVersion="45.0">
    <version number="45.0">
        <region name="1">
            <host name="localhost" port="4445" count="1"/>
        </region>
    </version>
</browser>
</qa:browsers>