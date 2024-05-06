@login
Feature: Login

  @valid-login
  Scenario: Login using valid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "secret_sauce"
    When user click login button
    Then user is on homepage

  @invalid-login
  Scenario: Login using invalid email and password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with "invalid_password"
    When user click login button
    Then user able to see error message "Epic sadface: Username and password do not match any user in this service"

  @invalid-login
  Scenario: Login using empty email and valid password
    Given user is on login page
    And user input username with ""
    And user input password with "secret_sauce"
    When user click login button
    Then user able to see error message "Epic sadface: Username is required"

  @invalid-login
  Scenario: Login using valid email and empty password
    Given user is on login page
    And user input username with "standard_user"
    And user input password with ""
    When user click login button
    Then user able to see error message "Epic sadface: Password is required"

  @invalid-login
  Scenario: Login using empty email and empty password
    Given user is on login page
    And user input username with ""
    And user input password with ""
    When user click login button
    Then user able to see error message "Epic sadface: Username is required"