# Login fonksiyon Kontrolü
# Önce siteye git (driver get)
# Sonra Login bilgilerini gir (username password sendKeys)
# Sonra giriş yaptığını kontrol et (verify, Assert)

Feature: Login Functionality

  @SmokeTest
  Scenario: Login with valid username and password

    Given Navigate to Campus
    When  Enter username and password and click login button
    Then  User should login successfully