package ru.bcs.test.demo.dolgov.ios;

import org.junit.After;
import org.junit.Test;

import java.net.MalformedURLException;

public class TestAppIOS {
    IOSDriversMethods iosDriversMethods;

    @Test
    public void test() throws MalformedURLException {
        System.out.println("------------------------------------");
        System.out.println("Идет загрузка приложения");
        iosDriversMethods = new IOSDriversMethods();
        iosDriversMethods.iOSLounchApp();
        System.out.println("Загрузка завершена");
        System.out.println("------------------------------------");


        System.out.println("------------------------------------");
        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[1]");
        iosDriversMethods.driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[1]").click();
        System.out.println("Готово");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[2]");
        iosDriversMethods.driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[2]").click();
        System.out.println("Готово");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[3]");
        iosDriversMethods.driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[3]").click();
        System.out.println("Готово");
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
        System.out.println("Кликаем на элемент //XCUIElementTypeButton[@name=\"start\"]");
        iosDriversMethods.driver.findElementByXPath("//XCUIElementTypeButton[@name=\"start\"]").click();
        System.out.println("Готово");
        System.out.println("------------------------------------");
    }

    @After
    public void tearDown() {
        System.out.println("------------------------------------");
        System.out.println("Идет закрытие приложения");
        iosDriversMethods.closeApp();
        System.out.println("Закрытие завершено");
        System.out.println("------------------------------------");
    }
}
