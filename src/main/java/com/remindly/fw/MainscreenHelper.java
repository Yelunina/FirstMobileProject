package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

import java.util.Collection;

public class MainscreenHelper extends BaseHelper {

    public MainscreenHelper(AppiumDriver driver) {
        super(driver);
    }

    public void confirm() {
        tap(By.id("android:id/button1"));
    }

    public boolean isNoRemindetTextPresent() {
        return isElementPresent(By.id("no_reminder_text"));
    }

    public void tapOnAddReminder() {
        tap(By.id("add_reminder"));
    }

    public String isReminderTitlePresent() {
        return driver.findElement(By.id("recycle_title")).getText();
    }
}
