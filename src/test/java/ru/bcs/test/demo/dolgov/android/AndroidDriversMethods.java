//package ru.bcs.test.demo.dolgov.android;
//
//
//import com.codeborne.selenide.Configuration;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import org.junit.Assert;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import java.net.MalformedURLException;
//import java.net.URI;
//import java.net.URL;
//
//import static com.codeborne.selenide.WebDriverRunner.setWebDriver;
//
//public class AndroidDriversMethods {
//    public static AppiumDriver<WebElement> driver;
//    public static void androidLounchApp() throws MalformedURLException {
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("deviceName", "POCOPHONE F1");
//        desiredCapabilities.setCapability("platformVersion", "9");
//        desiredCapabilities.setCapability("app", "/Users/ivanivanov/Downloads/ru.bcs.premier_2019-03-23.apk");
//        setWebDriver(
//                new RemoteWebDriver(
//                        URI.create("http://test:test-password@selenoid.t-global.bcs:4444/wd/hub").toURL(),
//                        desiredCapabilities));
//    }
//
//    public static void closeApp(){
//        driver.quit();
//    }
//
//}
