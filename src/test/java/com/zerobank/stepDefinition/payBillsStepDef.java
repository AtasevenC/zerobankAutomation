package com.zerobank.stepDefinition;

import com.zerobank.pages.PayBillsPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class payBillsStepDef {
    @When("The user navigate to Pay Bills module")
    public void the_user_navigate_to_Pay_Bills_module() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Then("Pay Bills page should have the title {string}")
    public void pay_Bills_page_should_have_the_title(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("the user completes a successful Pay operation {string} {string} {string} {string} {string}")
    public void the_user_completes_a_successful_Pay_operation(String string, String string2, String string3, String string4, String string5) {
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.Pay(string,string2,string3,string4,string5);




    }

    @When("user completes a successful Pay operation")
    public void user_completes_a_successful_Pay_operation() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }


    @Then("The user should see the massage {string}")
    public void the_user_should_see_the_massage(String string) {
     PayBillsPage payBillsPage =new PayBillsPage();
     String actualMassage= payBillsPage.successfullyMassage.getText();
        Assert.assertEquals("verify that",string,actualMassage);
    }




    @Then("{string} should be displayed on that column {string} {string}")
    public void should_be_displayed_on_that_column(String message, String Amount, String Date) {
        PayBillsPage payBillsPage=new PayBillsPage();
        if(Amount.isEmpty()){
            String messageActual= payBillsPage.amount.getAttribute("validationMessage");
            Assert.assertEquals("verify that",message,messageActual);
        }else if (Date.isEmpty()){
            String messageActual2= payBillsPage.date.getAttribute("validationMessage");
            Assert.assertEquals("verify that",message,messageActual2);
        }

    }

    @When("user tries to make a payment without entering amount")
    public void user_tries_to_make_a_payment_without_entering_amount() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user tries to make a payment without entering date")
    public void user_tries_to_make_a_payment_without_entering_date() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @When("user tries to make a payment with invalid Amount")
    public void user_tries_to_make_a_payment_with_invalid_Amount() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

    @Given("Add New payee tab")
    public void add_New_payee_tab() {
        PayBillsPage payBillsPage=new PayBillsPage();
        payBillsPage.AddNewPayee.click();
    }

    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> newPayee) throws InterruptedException {
       PayBillsPage payBillsPage=new PayBillsPage();
       payBillsPage.addPayee(newPayee.get("Payee Name"),newPayee.get("Payee Address")
       ,newPayee.get("Account"),newPayee.get("Payee details"));
    }

    @Then("the massage {string} should be displayed")
    public void the_massage_should_be_displayed(String string) {
       PayBillsPage payBillsPage=new PayBillsPage();
       String actualMessage= payBillsPage.alertMessage.getText();
       Assert.assertEquals("verify that",string,actualMessage);
    }

    @Given("the user enter the Purchase	foreign	currency cash tab")
    public void the_user_enter_the_Purchase_foreign_currency_cash_tab() {
       PayBillsPage payBillsPage=new PayBillsPage();
       payBillsPage.PurchaseForeignCurrency.click();
    }

    @Then("following currencies should be available")
    public void following_currencies_should_be_available(List<String> expectedList ){
        PayBillsPage payBillsPage=new PayBillsPage();



        List<WebElement> webElements= payBillsPage.Currency;
        List<String> actualList= BrowserUtils.getElementsText(webElements);

        System.out.println(actualList);
        System.out.println(expectedList);

        Assert.assertEquals("verify that ",expectedList,actualList);
    }





}
