package com.zerobank.stepDefinition;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryStepDef {

    @Then("Account summary page should have the title{string}")
    public void account_summary_page_should_have_the_title(String string) {
       String actualTitle= Driver.get().getTitle();
       String expectedTitle=string;
        Assert.assertEquals("verify that",expectedTitle,actualTitle);
    }

    @Then("Account summary page should have Cash Account")
    public void account_summary_page_should_have_Cash_Account() {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        String actual=accountSummaryPage.CashAccount.getText();
        Assert.assertEquals("verify that","Cash Accounts",actual);
    }

    @Then("Account summary page should have Investment Account")
    public void account_summary_page_should_have_Investment_Account() {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        String actual =accountSummaryPage.investmentAccount.getText();
        Assert.assertEquals("verify that","Investment Accounts",actual);

    }

    @Then("Account summary page should have Credit Account")
    public void account_summary_page_should_have_Credit_Account() {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        String actual =accountSummaryPage.creditAccount.getText();
        Assert.assertEquals("verify that","Credit Accounts",actual);
    }

    @Then("Account summary page should have Loan Account")
    public void account_summary_page_should_have_Loan_Account() {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        String actual =accountSummaryPage.LoanAccount.getText();
        Assert.assertEquals("verify that","Loan Accounts",actual);
    }

    @Then("The table must have columns {string}, {string} and {string}")
    public void the_table_must_have_columns_and(String string, String string2, String string3) {
        //account summary page obje crating
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        //From List of web element to list of string
        List<String> elemTexts = BrowserUtils.getElementsText(accountSummaryPage.CreditAccountTable);

         // we create expected list of string
        List<String> expectedList= new ArrayList<>();
        expectedList.add(string);
        expectedList.add(string2);
        expectedList.add(string3);
        // compare list of string of actal data and list of string of expected data
       Assert.assertTrue("verify that ",expectedList.equals(elemTexts));

        }

    @When("the user click on {string} link on the Account summary page")
    public void the_user_click_on_link_on_the_Account_summary_page(String string) {
       AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
       accountSummaryPage.DropDown(string).click();
    }

    @Then("The {string} page should be displayed")
    public void the_page_should_be_displayed(String string) {
      String actualTitle= Driver.get().getTitle();
      String expectedTitle= "Zero - "+ string;
      Assert.assertEquals("verify that",expectedTitle,actualTitle);
    }

    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        Select selectOpt= new Select(accountActivityPage.dropDown);
        String actualOption= selectOpt.getFirstSelectedOption().getText();
        String expectedOption= string;
        Assert.assertEquals("verif that",expectedOption,actualOption);
    }

}







