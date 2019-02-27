# at-library-core-example

# Перед запуском тестов выполнить(для скачивания allure):
mvn allure:report

# Для запуска:
mvn clean test -Dbrowser=chrome allure:serve

# Для запуска с proxy:
mvn clean test -Dbrowser=chrome -Dproxy=ip:port allure:serve




./cm selenoid start --browsers 'firefox:51.0;firefox:55.0;chrome:66.0;android:6.0'


./cm selenoid configure [--browsers 'firefox:>45.0;opera:53.0;android:6.0'] [--last-versions 2] [--tmpfs 128]