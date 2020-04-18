package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }


    @FindBy(id = "signin_button")
    public WebElement signButton;

    @FindBy(id = "user_login")
    public WebElement login;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(css = ".alert.alert-error")
    public WebElement message;

    public void Login(String userNameStr, String passwordStr){
        signButton.click();
        login.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submitButton.click();


    }
}
