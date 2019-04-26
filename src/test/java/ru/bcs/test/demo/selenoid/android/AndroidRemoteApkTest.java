//package ru.bcs.test.demo.selenoid.android;
//
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
//public class AndroidRemoteApkTest {
//
//    private RemoteWebDriver driver;
//
//    @Before
//    public void openDriver() throws Exception {
//        final DesiredCapabilities device = new DesiredCapabilities();
//        device.setCapability("browserName", "Nexus 5X API 24");
////        device.setCapability("version", "7.0");
//        device.setCapability("app", "http://ci.example.com/game2048.apk"); //APK from https://www.apkmirror.com/apk/androbaby/2048/
//        device.setCapability("appPackage", "com.androbaby.game2048");
//        device.setCapability("appActivity", "com.androbaby.game2048.MainActivity");
//        device.setCapability("enableVNC", true);
////        device.setCapability("enableVideo", true); // Uncomment this to record video
//
//        driver = new RemoteWebDriver(new URL(
//                "http://test:test-password@selenoid.t-global.bcs:4444/wd/hub" //Replace with correct host and port
//        ), device);
//    }
//
//    @Test
//    public void browserTest() throws Exception {
//        try {
//            driver.findElement(By.xpath("//*[@text=\"Start Game\"]")).click();
//        } finally {
//            takeScreenshot(driver);
//        }
//    }
//
//    @After
//    public void closeDriver(){
//        if (driver != null){
//            driver.quit();
//            driver = null;
//        }
//    }
//    static void takeScreenshot(RemoteWebDriver driver) throws Exception {
//        byte[] screen = ((TakesScreenshot) new Augmenter().augment(driver)).getScreenshotAs(OutputType.BYTES);
//        FileUtils.writeByteArrayToFile(new File(driver.getSessionId() + ".png"), screen);
//    }
//}
