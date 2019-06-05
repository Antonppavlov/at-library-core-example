package ru.bcs.test.demo.dolgov.android;

import org.junit.After;
import org.junit.Test;

import java.net.MalformedURLException;

public class TestAppAndroid {
    @Test
    public void test() throws MalformedURLException {
        System.out.println("------------------------------------");
        System.out.println("Идет загрузка приложения");
        AndroidDriversMethods.androidLounchApp();
        System.out.println("Загрузка завершена");
        System.out.println("------------------------------------");
    }

    @After
    public void tearDown() {
        System.out.println("------------------------------------");
        System.out.println("Идет закрытие приложения");
        AndroidDriversMethods.closeApp();
        System.out.println("Закрытие завершено");
        System.out.println("------------------------------------");
    }
}
