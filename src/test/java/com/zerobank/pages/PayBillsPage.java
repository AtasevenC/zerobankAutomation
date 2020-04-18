package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class PayBillsPage extends BasePage {

    @FindBy(id = "sp_amount")
    public WebElement amount;

    @FindBy(id = "sp_payee")
    public WebElement payee;

    @FindBy(id = "sp_account")
    public WebElement account;

    @FindBy(id = "sp_date")
    public WebElement date;

    @FindBy(id = "sp_description")
    public WebElement description;

    @FindBy(id = "pay_saved_payees")
    public WebElement pay;

    @FindBy(id = "alert_content")
    public WebElement  successfullyMassage;

    @FindBy(xpath = "//*[text()='Add New Payee']")
    public WebElement AddNewPayee;

    @FindBy(id = "np_new_payee_name")
    public WebElement PayeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement PayeeAddress;

    @FindBy(id = "np_new_payee_account")
    public WebElement PayeeAccount;


    @FindBy(id = "np_new_payee_details")
    public WebElement PayeeDetails;

    @FindBy(id = "add_new_payee")
    public WebElement add;

    @FindBy(id = "alert_content")
    public WebElement alertMessage;

    @FindBy(xpath = "//*[text()='Purchase Foreign Currency']")
    public WebElement PurchaseForeignCurrency;
    @FindBy(id = "pc_currency")
    public List<WebElement>Currency;






    public void addPayee(String name, String Address, String account, String Details)  {
        PayeeName.sendKeys(name);
        PayeeAddress.sendKeys(Address);
        PayeeAccount.sendKeys(account);
        PayeeDetails.sendKeys(Details);
        add.click();

    }





    public void Pay(String Payee, String Account, String Amount, String Date, String Descrp){
        Select select1 =new Select(payee);
        select1.selectByVisibleText(Payee);
        Select select2=new Select(account);
        select2.selectByVisibleText(Account);

        amount.sendKeys(Amount);
        date.sendKeys(Date);
        description.sendKeys(Descrp);

        pay.click();
    }



        }


