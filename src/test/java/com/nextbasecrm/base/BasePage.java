package com.nextbasecrm.base;

import com.nextbasecrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[contains(text(),'Activity Stream')][@class='menu-item-link-text']")
    public WebElement ActivityStream;
}
