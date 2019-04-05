# at-library-core-example

Для запуска автотестов соберите проект командами:
=========================
Запуск локально на ubuntu
```mvn
clean test -Dbrowser=chrome  -Djava.net.useSystemProxies=true allure:serve
```

Запуск локально на windows
```mvn
clean test -Dbrowser=chrome -Dwebdriver.chrome.driver="path of chrome.exe" allure:serve
```

Запуск удаленно
```mvn
clean test -Dbrowser=chrome -Dremote=http://selenoid.t-global.bcs:4444/wd/hub/ -Dproxy=http://172.18.62.68:8080 allure:serve
```
Просмотр в Selenoid:
=========================
```url
http://selenoid.t-global.bcs/#/
```

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

```mvn
-Dbrowser=chrome - использовать браузер chrome для прогона тестов
```

```mvn
-Djava.net.useSystemProxies=true - установив для этого свойства значение true, использовать настройки прокси-сервера системы
```
```mvn
-Dremote=http://selenoid.t-global.bcs:4444/wd/hub/ -Dproxy=http://172.18.62.68:8080 - для запуска тестов на selenoid
```
Чтобы установить базовый url(для api и ui тестов) его можно указать в application.properties по ключу baseURI=https://ef.tusvc.bcs.ru
или передать параметром (если передан параметр и присутсивует в application.properties то будет использован тот что передан параметром)

```mvn
-DbaseURI=https://url.you.need
```
