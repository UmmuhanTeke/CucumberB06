#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile 2 farklı senaryo ile kayıt yapınız.

Feature:  CitizenShips Functionality

  Background: #Before Scenario
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully
    And   Navigate to CitizenShips

  Scenario: Create a CitizenShips
    When  Create a CitizenShips name as "ummuhan34" short name as "teke"
    Then  Success message should be displayed

  Scenario: Create a CitizenShips 2
    When  Create a CitizenShips name as "ummuhan" short name as "ummus"
    Then  Success message should be displayed