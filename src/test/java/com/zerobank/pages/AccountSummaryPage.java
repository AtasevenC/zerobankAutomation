package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import javax.xml.xpath.XPath;
import java.util.List;

public class AccountSummaryPage  extends BasePage{


    @FindBy(xpath = "//*[text()='Cash Accounts']")
    public WebElement CashAccount;

    @FindBy(xpath = "//*[text()='Investment Accounts']")
    public WebElement investmentAccount;

    @FindBy(xpath = "//*[text()='Credit Accounts']")
    public WebElement creditAccount;

    @FindBy(xpath = "//*[text()='Loan Accounts']")
    public WebElement LoanAccount;

   @FindBy(xpath = "(//*[@class='table'])[3]//tr//th")
   public List<WebElement> CreditAccountTable;

   public WebElement DropDown(String str){
     WebElement option=Driver.get().findElement(By.linkText(str));
     return option;
   }


    @FindBy(linkText = "Savings")
    public WebElement Savings;

    @FindBy(linkText = "Brokerage")
    public WebElement Brokerage;

    @FindBy(linkText = "Checking")
    public WebElement Checking;

    @FindBy(linkText = "Credit Card")
    public WebElement CreditCard;

    @FindBy(linkText = "Loan")
    public WebElement Loan;

}
