# at-library-core-example

# Перед запуском тестов выполнить(для скачивания allure):
mvn allure:report

# Для запуска:
mvn clean test -Dbrowser=chrome allure:serve

# Для запуска с proxy:
mvn clean test -Dbrowser=chrome -Dproxy=ip:port allure:serve




./cm selenoid start --browsers 'firefox:51.0;firefox:55.0;chrome:66.0'