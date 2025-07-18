Feature: Login with Excel data

  Scenario: User logs in using credentials from Excel
    Given user reads credentials from Excel
    When user enters the credentials into the login page
    Then user should be logged in successfully
