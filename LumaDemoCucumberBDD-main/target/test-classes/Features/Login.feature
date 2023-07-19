Feature: Login Functionality
  As a user
  I want to be able to log in to the system
  So that I can access my account

  Scenario: Successful Login
    Given user am on the login page
    When user enter a correct username and a correct password
    And clicks the login button
    Then user should be logged in to my account