package ru.bcs.test.demo.dolgov.android;


import com.codeborne.selenide.Configuration;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class AndroidDriversMethods {
    public static AppiumDriver<WebElement> driver;

    public static void androidLounchApp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("browserName", "Nexus 5X API 24");

        desiredCapabilities.setCapability("app",
                "\\home\\anton\\IdeaProjects\\at-library-core-example\\sr\\test\\resources\\ru.bcs.premier_1.11.2.apk"
        ); // Set this to your APK package

        setWebDriver(
                new RemoteWebDriver(
                        URI.create("http://test:test-password@selenoid.t-global.bcs:4444/wd/hub").toURL(),
                        desiredCapabilities));
    }

    public static void closeApp(){
        driver.quit();
    }

}
//{
//        "platformName": "Android",
//        "platformVersion": "7.0",
//        "deviceName": "Nexus 5X",
//        "app": "/Users/ivanivanov/Downloads/ru.bcs.premier_1.11.2.apk"
//        }