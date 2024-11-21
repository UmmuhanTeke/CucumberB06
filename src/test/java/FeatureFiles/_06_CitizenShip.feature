#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile yapınız. (Senaryo 1)
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test) (Senaryo 2)
#Ayrı senaryoda girilen bilgiyi silme işlemini doğrulayınız (Senaryo 3)

Feature:  CitizenShips Functionality

  Background: #Before Scenario
    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully
    And   Navigate to CitizenShips

    @RegressionTest @SmokeTest
  Scenario: Create a CitizenShips
    When  Create a CitizenShips name as "emila" short name as "mila"
    Then  Success message should be displayed

      @RegressionTest
  Scenario: Create a CitizenShips 2
    When  Create a CitizenShips name as "emila" short name as "mila"
    Then  Already exists message should be displayed

        @RegressionTest
  Scenario: Delete  CitizenShips
    When user delete name as "emila"
    Then  Success message should be displayed