Feature: Country Functionality

  Background: #Before Scenario
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully
    And   Navigate to Country

  Scenario: Create a country
    When  Create a country
    Then  Success message should be displayed

  Scenario: Create a country 2
    When  Create a country name as "Ülke1İsm12" code as "Ülke1İsmakaod23"
    Then  Success message should be displayed

