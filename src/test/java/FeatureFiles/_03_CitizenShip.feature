#Senaryo
#Citizenships sayfasına gidiniz.
#1 adet Citizenships kaydı yapılabildiğini doğrulayınız.

Feature: CitizenShips Functionality

  Scenario: Create a CitizenShips

    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully
    And   Navigate to CitizenShips
    When  Create a CitizenShips
    Then  Success message should be displayed