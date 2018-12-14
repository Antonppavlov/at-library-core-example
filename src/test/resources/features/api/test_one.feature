# language: ru
@api
@bcs
Функция: Создание GET запроса и проверка

  Сценарий: Создание GET запроса и проверка
    И выполнен GET запрос на URL "calculation" с headers и parameters из таблицы. Полученный ответ сохранен в переменную "Ответ от серверва"
      | PARAMETER | gender   | true |
      | PARAMETER | age      | 28   |
      | PARAMETER | height   | 188  |
      | PARAMETER | weight   | 70   |
      | PARAMETER | activity | 1    |
      | PARAMETER | target   | 1    |


    И в json строке "Ответ от серверва" значения, найденные по jsonpath, равны значениям из таблицы
      | calories      | 2447 |
      | proteins      | 162  |
      | fats          | 61   |
      | carbohydrates | 300  |


