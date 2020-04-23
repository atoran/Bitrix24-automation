package com.nextbasecrm.pages;

import com.nextbasecrm.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage {

    @FindBy(xpath = "//*[@id='feed-add-post-form-tab-message']/span")
    public WebElement message;

    @FindBy(id = "bx-b-uploadfile-blogPostForm")
    public WebElement uploadIcon;

    @FindBy(xpath = "//div[@class='diskuf-uploader']")
    public WebElement UploadFilesAndImages;


}
