package com.zerobank.stepDefinition;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class loginStepDef {


    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
      String url = ConfigurationReader.get("url");
      Driver.get().get(url);
    }

    @When("The user enter the valid credential")
    public void the_user_enter_the_valid_credential() {
        LoginPage loginPage=new LoginPage();
        String userName=ConfigurationReader.get("userName");
        String password=ConfigurationReader.get("password");
        loginPage.Login(userName,password);
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
       String actualTitle=Driver.get().getTitle();

       String expectedTitle="Zero - Account Summary";
      Assert.assertEquals("verify that",expectedTitle,actualTitle);
    }

    @When("The user enter the invalid credential")
    public void the_user_enter_the_invalid_credential() {
        LoginPage loginPage=new LoginPage();
        String userName=ConfigurationReader.get("userNameInvalid");
        String password=ConfigurationReader.get("password");
        loginPage.Login(userName,password);
    }



    @Then("The user should see error message{string}")
    public void the_user_should_see_error_message(String string) {
        LoginPage loginPage=new LoginPage();
        String actualMessage=loginPage.message.getText();
        String expectedMessage=string;
        Assert.assertEquals(expectedMessage,actualMessage);

    }

    @When("The user enter the blank username")
    public void the_user_enter_the_blank_username() {
        LoginPage loginPage=new LoginPage();
        String userName=ConfigurationReader.get("userNameBlank");
        String password=ConfigurationReader.get("password");
        loginPage.Login(userName,password);
    }



    @When("The user enter the blank password")
    public void the_user_enter_the_blank_password() {
        LoginPage loginPage=new LoginPage();
        String userName=ConfigurationReader.get("userName");
        String password=ConfigurationReader.get("passwordBlank");
        loginPage.Login(userName,password);
    }



}
