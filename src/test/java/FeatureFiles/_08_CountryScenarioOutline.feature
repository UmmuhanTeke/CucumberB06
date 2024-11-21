#TODO : Country menusu create,update,delete olarak, Senaryo outline şeklinde 5 kez çalıştırınız

Feature: Country Senaryo Outline

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to Country

    Scenario Outline: Country with Parameter
      When Create a country name as "<name>" code as "<code>"
      Then Success message should be displayed
      When Create a country name as "<name>" code as "<code>"
      Then Already exists message should be displayed
      When user delete name as "<name>"
      Then Success message should be displayed


      Examples:
      | name      | code  |
      | ummu23456 | uc12m |
      | ummu24456 | uc13m |
      | ummu25456 | uc14m |
      | ummu26456 | uc15m |
      | ummu27456 | uc16m |



