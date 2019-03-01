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