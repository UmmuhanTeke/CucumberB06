#CUCUMBER DATA-PROVİDER

Feature: Citizenship Functionality

  Background: #Before Senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login successfully
    And Navigate to CitizenShips

  Scenario Outline: Create a Citizenship with parameter

    When Create a CitizenShips name as "<name>" short name as "<shortName>"
    Then Success message should be displayed
    When Create a CitizenShips name as "<name>" short name as "<shortName>"
    Then  Already exists message should be displayed
    When user delete name as "<name>"
    Then Success message should be displayed

    Examples:
      | name       | shortName      |
      | is71m22CS1 | is71mCS1shor1t |
      | is71m22CS2 | is71mCS2shor1t |
      | is71m22CS3 | is71mCS3shor1t |
      | is71m22CS4 | is71mCS4shor1t |
      | is71m22CS5 | is71mCS5shor1t |

     #  dataProvider (TestNG için), Senaryo Outline (cucumber)
     #  görevi verilen her değer için, tüm senayo çalışır

  # TODO : States menusu create,update,delete olarak, Senaryo outline şeklinde 5 kez çalıştırınız