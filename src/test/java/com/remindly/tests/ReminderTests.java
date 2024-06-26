package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReminderTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        app.getMainscreen().confirm();
    }

    @Test
    public void addReminderTitlePositiveTest() {
        app.getMainscreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainscreen().isReminderTitlePresent().contains("Holiday"));
    }

    @Test
    public void addReminderWithDatePositiveTest() {
        app.getMainscreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapeOnDateField();
        app.getReminder().swipeToMonth("future", 1, "MAY");
        app.getReminder().selectDate(0);
        app.getReminder().tapOnYear();
        app.getReminder().swipeToYear("future", "2025");
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainscreen().isReminderDatePresent().contains("1/5/2025"));

    }

    @Test
    public void addReminderWithTimePositiveTest() {
        app.getMainscreen().tapOnAddReminder();
        app.getReminder().enterReminderTitle("Holiday");
        app.getReminder().tapOnTimeField();
        app.getReminder().selectTime("am", 266, 926, 543, 1188);
        app.getReminder().tapOnOk();
        app.getReminder().saveReminder();
        Assert.assertTrue(app.getMainscreen().isReminderDatePresent().contains("9:30"));

    }

    // check Repeat(verify Repeat off)
    //check Repetition Interval(verify "2")
    //check Type of repetition(verify "Week")

}
