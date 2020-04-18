package com.zerobank.stepDefinition;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public  class AccountActivtyStepDef {

    @When("The user navigate to {string} module")
    public void the_user_navigate_to_module(String pageName) throws InterruptedException {
        AccountSummaryPage accountSummaryPage=new AccountSummaryPage();
        accountSummaryPage.navigate(pageName);

    }


    @Then("Account activity page should have the title {string}")
    public void account_activity_page_should_have_the_title(String string) {
       String actualTile= Driver.get().getTitle();
        Assert.assertEquals("verify that",string,actualTile);
    }

    @Then("In the Account drop down default option should be {string}")
    public void in_the_Account_drop_down_default_option_should_be(String string) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        Select selectList =new Select(accountActivityPage.dropDown);
        String defultOptions=selectList.getFirstSelectedOption().getText();
        System.out.println("----------------");
        Assert.assertEquals("verify that",string,defultOptions);
    }

    @Then("Account drop down should have the options:{string}")
    public void account_drop_down_should_have_the_options(String string) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        Select selectList =new Select(accountActivityPage.dropDown);
        //all options in options list
        List<WebElement> options=selectList.getOptions();
        // from WebElement list to String list
        List<String> elemTexts = new ArrayList<>();

        for (WebElement option : options) {
            elemTexts.add(option.getText());
        }
        List<String> expectedList= new ArrayList<>();
        expectedList.add(string);

    }

    @Then("Account drop down should have the options:{string}, {string}, {string}, {string}, {string}")
    public void account_drop_down_should_have_the_options(String string, String string2, String string3, String string4, String string5) {
        AccountActivityPage accountActivityPage=new AccountActivityPage();
        Select selectList =new Select(accountActivityPage.dropDown);
        //all options in options list
        List<WebElement> options=selectList.getOptions();
        // from WebElement list to String list
        List<String> elemTexts = new ArrayList<>();
        System.out.println("--------------------------------------");
        for (WebElement option : options) {
            elemTexts.add(option.getText());
            System.out.println(option.getText());
        }
        List<String> expectedList= new ArrayList<>();
        expectedList.add(string);
        expectedList.add(string2);
        expectedList.add("Savings");
        expectedList.add(string3);
        expectedList.add(string4);
        expectedList.add(string5);


        System.out.println("---------------------------------------------");
        for (String expected : expectedList) {

            System.out.println(expected);
        }
        Assert.assertEquals("verify that",expectedList,elemTexts);
    }


    @Then("The table should have column names: {string}, {string}, {string}, {string}")
    public void the_table_should_have_column_names(String string, String string2, String string3, String string4) {
        List<WebElement> TransactionTable = Driver.get().findElements(By.xpath("//*[@id='all_transactions_for_account']//tr/th"));
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : TransactionTable) {
            elemTexts.add(el.getText());
        }
        List<String> expectedList= new ArrayList<>();
        expectedList.add(string);
        expectedList.add(string2);
        expectedList.add(string3);
        expectedList.add(string4);
        Assert.assertTrue("verify that ",expectedList.equals(elemTexts));
    }


    @Then("The table should have column names: {string}")
    public void the_table_should_have_column_names(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }

}
