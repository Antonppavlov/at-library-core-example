# language: ru
@mobile
Функция: Тестирование мобильного приложения

  Сценарий: Проверка общей суммы всех девайсов 1
    Когда страница "Домашняя" загрузилась
    И выполнено нажатие на кнопку "iphone"
    И выполнено нажатие на кнопку "mouse"
    И выполнено нажатие на кнопку "ps4"
    И выполнено нажатие на кнопку "photo"
    И выполнено нажатие на кнопку "keyboard"
    Тогда значение поля "money" равно "117300"

  Сценарий: Проверка общей суммы всех девайсов 2
    Когда страница "Домашняя" загрузилась
    То выбор всех товаров и проверка обшей суммы: "155300"

  Сценарий: Проверка перехода в корзину
    Когда страница "Домашняя" загрузилась
    И выполнено нажатие на кнопку "iphone"
    Тогда значение поля "money" равно "60000"
    И выполнено нажатие на кнопку "В корзину"
    Когда страница "Корзина" загрузилась
    И значение поля "money" равно "60000"

  Сценарий: Проверка покупки
    Когда страница "Домашняя" загрузилась
    И выполнено нажатие на кнопку "mouse"
    Тогда значение поля "money" равно "300"
    И выполнено нажатие на кнопку "Купить"
    Когда страница "Покупки" загрузилась
    И значение поля "money" равно "300"
    И выполнено нажатие на кнопку "Назад"
    Когда страница "Домашняя" загрузилась
    И значение поля "money" равно "0"

  Сценарий: Проверка покупки в корзине
    Когда страница "Домашняя" загрузилась
    И выполнено нажатие на кнопку "mouse"
    И выполнено нажатие на кнопку "В корзину"
    Тогда страница "Корзина" загрузилась
    То значение поля "money" равно "300"
    Тогда выполнено нажатие на кнопку "Купить"
    И страница "Покупки" загрузилась
    То значение поля "money" равно "300"
    Тогда выполнено нажатие на кнопку "Назад"
    И страница "Домашняя" загрузилась
    Тогда значение поля "money" равно "0"