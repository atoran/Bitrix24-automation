package com.nextbasecrm.pages;

import com.nextbasecrm.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement usernameBox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement passwordBox;

    @FindBy(css = ".login-btn")
    public WebElement logInButton;

    public void logIn(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        logInButton.click();
    }


}
