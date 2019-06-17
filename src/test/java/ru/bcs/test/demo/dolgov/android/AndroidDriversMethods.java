package ru.bcs.test.demo.dolgov.android;


import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class AndroidDriversMethods {

    public static void androidLounchApp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "8.1.0");
        desiredCapabilities.setCapability("deviceName", "Nokia 6");
        desiredCapabilities.setCapability("app", "/Users/ivanivanov/Downloads/ru.bcs.premier_1.11.2.apk");
        setWebDriver(
                new RemoteWebDriver(
                        URI.create("http://test:test-password@selenoid.t-global.bcs:4444/wd/hub").toURL(),
                        desiredCapabilities));


    }

    public static void closeApp() {
    }

}
//
//<browser name="Nokia 6" defaultVersion="8.1.0">
//<version number="8.1.0">