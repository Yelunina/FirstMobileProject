package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainScreenTests extends TestBase {

    //confirm OK
    @BeforeMethod
    public void precondition() {
        app.getMainscreen().confirm();
    }
    //verify text is displayed

    @Test
    public void appLaunchTest() {
        Assert.assertTrue(app.getMainscreen().isNoRemindetTextPresent());
    }
}
