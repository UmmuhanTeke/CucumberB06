package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _02_CountrySteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Navigate to Country")
    public void navigateToCountry() {
        ln.myClick(ln.setUp);
        ln.myClick(ln.parameters);
        ln.myClick(ln.countries);
    }

    @When("Create a country")
    public void createACountry() {
        String countryName= RandomStringUtils.randomAlphanumeric(8); //TODO 8 tane karışık harf
        String countryCode=RandomStringUtils.randomNumeric(4); //TODO 4 haneli karışık rakam

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, countryName);
        dc.mySendKeys(dc.codeInput, countryCode);
        dc.myClick(dc.saveButton);
    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("success");
    }

    @When("Create a country name as {string} code as {string}")
    public void createACountryNameAsCodeAs(String countryName, String countryCode) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, countryName);
        dc.mySendKeys(dc.codeInput, countryCode);
        dc.myClick(dc.saveButton);
    }
}
