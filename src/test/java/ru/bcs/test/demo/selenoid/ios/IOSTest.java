//package ru.bcs.test.demo.selenoid.ios;
//
//import com.codeborne.selenide.Selenide;
//import com.codeborne.selenide.WebDriverRunner;
//import io.appium.java_client.remote.MobileCapabilityType;
//import org.apache.commons.io.FileUtils;
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.remote.Augmenter;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.remote.RemoteWebDriver;
//
//import java.io.File;
//import java.net.URL;
//
//
//public class IOSTest {
//
//
//    private RemoteWebDriver driver;
//
//    @Before
//    public void openDriver() throws Exception {
//        System.out.println("------------------------------------");
//        System.out.println("Идет загрузка приложения");
//
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
//        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6s");
//        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.2");
//        capabilities.setCapability(MobileCapabilityType.APP, "ru.admitadteam.Cooking-eggs");
//        driver = new RemoteWebDriver(new URL("http://test:test-password@selenoid.t-global.bcs:4444/wd/hub"), capabilities);
//
//        WebDriverRunner.setWebDriver(driver);
//        System.out.println("Загрузка завершена");
//        System.out.println("------------------------------------");
//    }
//
//    @Test
//    public void browserTest() throws Exception {
////        System.out.println("------------------------------------");
////        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[1]");
////        Selenide.$(By.xpath("(//XCUIElementTypeButton[@name=\"egg\"])[1]")).getWrappedElement().click();
////        //  driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[1]").click();
////        System.out.println("Готово");
////        System.out.println("------------------------------------");
////        System.out.println("------------------------------------");
////        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[2]");
////        Selenide.$(By.xpath("(//XCUIElementTypeButton[@name=\"egg\"])[2]")).getWrappedElement().click();
////        //  driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[2]").click();
////        System.out.println("Готово");
////        System.out.println("------------------------------------");
////        System.out.println("------------------------------------");
////        System.out.println("Кликаем на элемент (//XCUIElementTypeButton[@name=\"egg\"])[3]");
////        Selenide.$(By.xpath("(//XCUIElementTypeButton[@name=\"egg\"])[3]")).getWrappedElement().click();
////        //   driver.findElementByXPath("(//XCUIElementTypeButton[@name=\"egg\"])[3]").click();
////        System.out.println("Готово");
////        System.out.println("------------------------------------");
////        System.out.println("------------------------------------");
////        System.out.println("Кликаем на элемент //XCUIElementTypeButton[@name=\"start\"]");
////        Selenide.$(By.xpath("//XCUIElementTypeButton[@name=\"start\"]")).getWrappedElement().click();
////        // driver.findElementByXPath("//XCUIElementTypeButton[@name=\"start\"]").click();
////        System.out.println("Готово");
////        System.out.println("------------------------------------");
//        MobilePage mobilePage = new MobilePage();
//        mobilePage.getEgg1().getWrappedElement().click();
//        mobilePage.getEgg2().getWrappedElement().click();
//        mobilePage.getEgg2().getWrappedElement().click();
//        mobilePage.getButtonStart().getWrappedElement().click();
//    }
//
//    @After
//    public void closeDriver() {
//        if (driver != null) {
//            driver.quit();
//            driver = null;
//        }
//    }
//
//    static void takeScreenshot(RemoteWebDriver driver) throws Exception {
//        byte[] screen = ((TakesScreenshot) new Augmenter().augment(driver)).getScreenshotAs(OutputType.BYTES);
//        FileUtils.writeByteArrayToFile(new File(driver.getSessionId() + ".png"), screen);
//    }
//}
