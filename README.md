# at-library-core-example

# Перед запуском тестов выполнить(для скачивания allure):
mvn allure:report

# Для запуска:
mvn clean test allure:serve

# Для запуска с proxy:
mvn clean test -Dproxy=ip:port allure:serve

Объяснение:
=========================

```mvn
clean - очистка проекта
```

```mvn
test - запуск тестов
```

```mvn
allure:serve - запуск allure отчетов
```

Чтобы установить базовый url(для api и ui тестов) его можно указать в application.properties по ключу baseURI=https://url.you.need.v1
или передать параметром (если передан параметр и присутсивует в application.properties то будет использован тот что передан параметром)

```mvn
-DbaseURI=https://url.you.need.v2
```




2019/03/15 10:10:45 websocketproxy: couldn't upgrade websocket: the client is not using the websocket protocol: 'upgrade' token not found in 'Connection' header
