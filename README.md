# at-library-core-example

При загрузке страницы будут учитываться элементы, описанные в блоке


После подключения всех плагинов и зависимостей вы можете запускать проект автотестов командами:
=========================


- Запуск удаленно на Selenoid
```mvn
clean test -DplatformName=iOS -DdeviceName="iPhone 6s" -DplatformVersion=12.4 -Dapp=ru.admitadteam.SimpleScoreSwift -Dselenide.remote=http://test:test-password@selenoid.t-global.bcs:4444/wd/hub/ -Dproxy=http://172.18.62.68:8080 allure:serve
```
- Запуск тестов по тегам (И)
```mvn
clean test -DplatformName=iOS -DdeviceName="iPhone 6s" -DplatformVersion=12.4 -Dapp=ru.admitadteam.SimpleScoreSwift -Dselenide.remote=http://test:test-password@selenoid.t-global.bcs:4444/wd/hub/ -Dproxy=http://172.18.62.68:8080 -Dcucumber.options="--tags @api --tags @web --plugin io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm --plugin com.epam.reportportal.cucumber.ScenarioReporter"
```
- Запуск тестов по тегам (ИЛИ)
```mvn
clean test -DplatformName=iOS -DdeviceName="iPhone 6s"  -Dapp=ru.admitadteam.SimpleScoreSwift -Dselenide.remote=http://test:test-password@selenoid.t-global.bcs:4444/wd/hub/ -Dproxy=http://172.18.62.68:8080 -Dcucumber.options="--tags @api,@web --plugin io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm --plugin com.epam.reportportal.cucumber.ScenarioReporter"
```

Пояснение к командам:
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

```mvn
-DplatformName=iOS - передается платформа на которой будут запущены тесты
```

```mvn
-DdeviceName="iPhone 6s" - передается имя девайса на котором будут запущены тесты
```

```mvn
-DplatformVersion=12.4 - передается версия платформы на которой будут запущены тесты
```

```mvn
-Dapp=ru.admitadteam.SimpleScoreSwift - передается название проекта который будет запущен для прогона тестов
```

```mvn
-Dselenide.remote=http://test:test-password@selenoid.t-global.bcs:4444/wd/hub/ -Dproxy=http://172.18.62.68:8080 - для запуска тестов на selenoid
```
