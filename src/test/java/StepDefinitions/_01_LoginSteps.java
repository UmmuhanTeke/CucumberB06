package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.*; //* hepsini temsil etti(given,when,then)

public class _01_LoginSteps {
    DialogContent dc=new DialogContent();

    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        System.out.println("Site açıldı");
        GWD.getDriver().get("https://test.mersys.io/");
    }

    @When("Enter username and password and click login button")
    public void enter_username_and_password_and_click_login_button() {
        System.out.println("Username ve şifre gönderildi");

        dc.mySendKeys(dc.username, "turkeyts");
        dc.mySendKeys(dc.password, "TechnoStudy123");
        dc.myClick(dc.loginButton);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        System.out.println("Siteye girildiği doğrulandı");

//        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.textToBePresentInElement(dc.logoControl, "Internship"));
//
//        Assert.assertTrue(dc.logoControl.getText().equals("Internship"));

        dc.LoginContainsText(dc.logoControl, "Internship");
    }
}
