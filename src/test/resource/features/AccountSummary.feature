Feature: Account Summary page

  Background:
    Given The user is on the login page
    When The user enter the valid credential

  Scenario: The title of Account Summary Page
    Then Account summary page should have the title"Zero - Account Summary"

  Scenario: Cash Accounts
    Then Account summary page should have Cash Account

  Scenario: Investment Accounts
    Then Account summary page should have Investment Account

  Scenario: Credit Accounts
    Then Account summary page should have Credit Account

  Scenario: Loan Accounts
    Then Account summary page should have Loan Account

  Scenario: Credit Accounts table
    Then The table must have columns "Account", "Credit Card" and "Balance"


  Scenario Outline: Savings account redirect
    When the user click on "<Dropdown>" link on the Account summary page
    Then The "Account Activity" page should be displayed
    And  Account drop down should have "<Dropdown>" selected
    Examples:
      | Dropdown    |
      | Savings     |
      | Checking    |
      | Loan        |
      | Credit Card |
      | Brokerage   |