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






Configuration Manager


curl -s https://aerokube.com/cm/bash | bash



Selenoid


./cm selenoid start  --vnc  --port 4445 --browsers 'android:6.0;firefox;chrome;opera’ --args "-limit 20"



docker run -d --name selenoid-ui -p 8080:8080 aerokube/selenoid-ui --selenoid-uri=http://172.20.10.10:4445


GGR



mkdir -p /Users/administrator/Documents/grid-router/quota


htpasswd -bc /Users/administrator/Documents/grid-router/users.htpasswd test test-password



nano /Users/administrator/Documents/grid-router/quota/test.xml


<qa:browsers xmlns:qa="urn:config.gridrouter.qatools.ru">

    

    <browser name="internet explorer" defaultVersion="11">

        <version number="11">

            <region name="1">

                <host name="192.168.31.77" port="4444" count="1"/>

            </region>

        </version>

    </browser>


    <browser name="chrome" defaultVersion="73.0">

        <version number="73.0">

            <region name="1">

                <host name="172.20.10.10" port="4445" count="1"/>

            </region>

        </version>

        <version number="72.0">

            <region name="1">

                <host name="172.20.10.10" port="4445" count="1"/>

            </region>

        </version>

    </browser>


    <browser name="firefox" defaultVersion="66.0">

        <version number="66.0">

            <region name="1">

                <host name="172.20.10.10" port="4445" count="1"/>

            </region>

        </version>

        <version number="65.0">

            <region name="1">

                <host name="172.20.10.10" port="4445" count="1"/>

            </region>

        </version>

    </browser>


    <browser name="opera" defaultVersion="58.0">

        <version number="58.0">

            <region name="1">

                <host name="172.20.10.10" port="4445" count="1"/>

            </region>

        </version>

        <version number="57.0">

            <region name="1">

                <host name="172.20.10.10" port="4445" count="1"/>

            </region>

        </version>

    </browser>


    <browser name="android" defaultVersion="6.0">

        <version number="6.0">

            <region name="1">

                <host name="172.20.10.10" port="4445" count="1"/>

            </region>

        </version>

    </browser>


</qa:browsers>




docker run -d -p 4444:4444 --name ggr -v /Users/administrator/Documents/grid-router/:/etc/grid-router:ro aerokube/ggr:latest-release



GGR UI 


docker run -d --name ggr-ui -p 8888:8888 -v /Users/administrator/Documents/grid-router/quota/:/etc/grid-router/quota:ro aerokube/ggr-ui:latest-release




Selenoid UI 


docker run -d --name selenoid-ui-ggr  -p 8080:8080 aerokube/selenoid-ui --selenoid-uri=http://172.20.10.10:4444
