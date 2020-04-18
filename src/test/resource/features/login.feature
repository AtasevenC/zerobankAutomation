
Feature: User should be able to login to the application

Background:
  Given The user is on the login page

  Scenario:login with valid credential

    When The user enter the valid credential
    Then The user should be able to login

    Scenario: login with invalid credential
      When  The user enter the invalid credential
      Then The user should see error message"Login and/or password are wrong."


    Scenario: login with blank user name
      When  The user enter the blank username
      Then The user should see error message"Login and/or password are wrong."

    Scenario: login with blank password
      When The user enter the blank password
      Then The user should see error message"Login and/or password are wrong."
