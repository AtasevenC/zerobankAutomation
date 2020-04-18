Feature:  Pay Bills Page

  Background:
    Given The user is on the login page
    When The user enter the valid credential
    And The user navigate to "Pay Bills" module


  Scenario: The title of Pay Bills Page
    Then Account activity page should have the title "Zero - Pay Bills"


  Scenario Outline:get Success message
    When the user completes a successful Pay operation "<Payee>" "<Account>" "<Amount>" "<Date>" "<Description>"
    Then The user should see the massage "The payment was successfully submitted."
    Examples:
      | Payee           | Account     | Amount | Date       | Description |
      | Apple           | Savings     | 10     | 2020-01-01 | example     |
      | Sprint          | Checking    | 10     | 2020-05-10 | good        |
      | Bank of America | Loan        | 120    | 2020-04-22 | school      |
      | Wells Fargo     | Credit Card | 125    | 2020-07-28 | book        |
      | Apple           | Brokerage   | 1      | 2020-08-30 | asdf        |


  Scenario Outline:get "Please fill out this field message!"
    When the user completes a successful Pay operation "<Payee>" "<Account>" "<Amount>" "<Date>" "<Description>"
    Then "Please fill in this field." should be displayed on that column "<Amount>" "<Date>"
    Examples:
      | Payee           | Account     | Amount | Date       | Description |
      | Apple           | Brokerage   |        | 2020-01-01 | example     |
      | Sprint          | Checking    | 10     |            | good        |
      | Bank of America | Loan        |        |            | school      |
      | Wells Fargo     | Credit Card | 125    |            | book        |
      | Apple           | Brokerage   |        | 2020-08-30 | asdf        |


  Scenario Outline: Pay operation with invalid Amount

    When the user completes a successful Pay operation "<Payee>" "<Account>" "<Amount>" "<Date>" "<Description>"
    Then The user should see the massage "Please enter valid  amount"
    Examples:
      | Payee           | Account     | Amount | Date       | Description |
      | Apple           | Brokerage   | abc    | 2020-01-01 | example     |
      | Sprint          | Checking    | 14yt   | 2020-08-30 | good        |
      | Bank of America | Loan        | .,?    | 2020-08-30 | school      |
      | Wells Fargo     | Credit Card | ad54   | 2020-08-30 | book        |
      | Apple           | Brokerage   | +*$    | 2020-08-30 | asdf        |


  Scenario: Add a new payee
    Given Add New payee tab
    And creates new payee using following information
      | Payee Name    | The Law Offices of Hyde, Price & Scharks |
      | Payee Address | 100 Same st, Anytown, USA10001           |
      | Account       | Checking                                 |
      | Payee details | XYZ account                              |
    Then the massage "The new payee The Law Offices of Hyde, Price & Scharks was successfully created." should be displayed

  @wip
  Scenario: Available currencies
    Given the user enter the Purchase	foreign	currency cash tab
    Then following currencies should be available
      | Select One            |
      | Australia (dollar)    |
      | Canada (dollar)       |
      | Switzerland (franc)   |
      | China (yuan)          |
      | Denmark (krone)       |
      | Eurozone (euro)       |
      | Great Britain (pound) |
      | Hong Kong (dollar)    |
      | Japan (yen)           |
      | Mexico (peso)         |
      | Norway (krone)        |
      | New Zealand (dollar)  |
      | Sweden (krona)        |
      | Singapore (dollar)    |
      | Thailand (baht)       |