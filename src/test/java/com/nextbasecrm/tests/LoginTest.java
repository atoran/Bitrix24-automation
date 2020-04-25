package com.nextbasecrm.tests;

import com.nextbasecrm.base.TestBase;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends TestBase {

    @Test
    public void UploadingAndDownLoading(){
        test = report.createTest("Login test");

        test.info("Login with Username: " +usernameHelpDesk +" Password: "+password);
        loginPage.logIn(usernameHelpDesk, password);

        test.info("Going to the activity stream page");
        basePage.ActivityStream.click();

        test.info("Clicking on message tab");
        activityStreamPage.message.click();

        test.info("Clicking on upload icon");
        activityStreamPage.uploadIcon.click();

        test.info("Clicking on Upload Files and Images");
        activityStreamPage.uploadFilesAndImages.click();

        test.info("Clicking on SelectDocFromBitrix24");
        activityStreamPage.SelectDocFromBitrix24.click();

    }

}
