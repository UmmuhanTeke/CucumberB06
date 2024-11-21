package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.RandomStringUtils;

public class _03_CitizenShipSteps {
    LeftNav ln = new LeftNav();
    DialogContent dc = new DialogContent();

    @And("Navigate to CitizenShips")
    public void navigateToCitizenShips() {
        ln.myClick(ln.setUp);
        ln.myClick(ln.parameters);
        ln.myClick(ln.citizenShips);
    }

    @When("Create a CitizenShips")
    public void createACitizenShips() {
        String citizenshipName = RandomStringUtils.randomAlphanumeric(8);
        String citizenshipShortName = RandomStringUtils.randomNumeric(4);

        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, citizenshipName);
        dc.mySendKeys(dc.shortName, citizenshipShortName);
        dc.myClick(dc.saveButton);
    }

    @When("Create a CitizenShips name as {string} short name as {string}")
    public void createACitizenShipsNameAsShortNameAs(String name, String shortName) {
        dc.myClick(dc.addButton);
        dc.mySendKeys(dc.nameInput, name);
        dc.mySendKeys(dc.shortName, shortName);
        dc.myClick(dc.saveButton);
    }

    @Then("Already exists message should be displayed")
    public void alreadyExistsMessageShouldBeDisplayed() {
        dc.verifyMessageContainsText("already exists");
    }

    @When("user delete name as {string}")
    public void userDeleteNameAs(String deleteName) {
        dc.deleteItem(deleteName);
    }
}
