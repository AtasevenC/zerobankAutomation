
Feature: Account Activity page
  Background:
    Given The user is on the login page
    When The user enter the valid credential
    And The user navigate to "Account Activity" module

  Scenario: The title of Account Activity Page
    Then Account activity page should have the title "Zero - Account Activity"

  Scenario: Account drop down
    Then In the Account drop down default option should be "Savings"
    And Account drop down should have the options:"Savings", "Checking", "Loan", "Credit Card", "Brokerage"

  Scenario: Transaction Table
    Then The table should have column names: "Date", "Description", "Deposit", "Withdrawal"