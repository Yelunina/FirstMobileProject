package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class ApplicationManager {
    static AppiumDriver driver;
    DesiredCapabilities capabilities;

    MainscreenHelper mainscreen;
    ReminderHelper reminder;

    public MainscreenHelper getMainscreen() {
        return mainscreen;
    }

    public ReminderHelper getReminder() {
        return reminder;
    }

    public void init() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("deviceName", "mob");
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("appPackage", "com.blanyal.remindly");
        capabilities.setCapability("appActivity", "com.blanyal.remindme.MainActivity");
        capabilities.setCapability("app", "D:/wiki/remindly.apk");

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        mainscreen = new MainscreenHelper(driver);
        reminder = new ReminderHelper(driver);


    }
}
