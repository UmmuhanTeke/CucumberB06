package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(css = "[formcontrolname='username']")
    public WebElement username;

    @FindBy(css = "[formcontrolname='password']")
    public WebElement password;

    @FindBy(css = "[aria-label='LOGIN']")
    public WebElement loginButton;

    @FindBy(css = "span[class='mat-mdc-tooltip-trigger logo-text']")
    public WebElement logoControl;

    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button") //containsli öğrendik !
    public WebElement addButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;

    @FindBy(xpath = "//ms-save-button[@class='ng-star-inserted']//button")
    public WebElement saveButton;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='shortName' ]//input")
    public WebElement shortName;

    @FindBy(tagName = "mat-panel-description")
    public WebElement messageBox;

    @FindBy(xpath = "//ms-text-field/input[@placeholder='Name']")
    public WebElement searchInput;

    @FindBy(xpath = "//ms-search-button/div/button")
    public WebElement searchButton;

    @FindBy(xpath = "//ms-delete-button//button")
    public WebElement deleteImageBtn;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;

    @FindBy(xpath = "//ms-text-field[@formcontrolname='budgetAccountIntegrationCode']//input")
    public WebElement integrationCode;

    @FindBy(xpath = "//ms-integer-field[@formcontrolname='priority']//input")
    public WebElement priorityCode;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button")
    public WebElement toggleBar;

    @FindBy(xpath = "(//ms-save-button[@class='ng-star-inserted']//button)[2]")
    public WebElement saveClose;

    @FindBy(xpath = "//mat-form-field[@formgroupname='country']/div")
    public WebElement countrySelect;

    @FindBy(xpath = "//div[@role='listbox']/mat-option")
    public WebElement countryOption;

    @FindBy(xpath = "//tbody//td[2]")
    public List<WebElement> nameList;

    public void verifyMessageContainsText(String value) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//hot-toast-container/div/div/div//*"), 0));
        Assert.assertTrue(this.messageBox.getAttribute("innerHTML").toLowerCase().contains(value.toLowerCase()));

        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
    }

    public void deleteItem(String deleteName) {
        mySendKeys(searchInput, deleteName);
        myClick(searchButton);
        wait.until(ExpectedConditions.elementToBeClickable(this.searchButton)); //stale element hatası için
        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
    }

    public WebElement getWebElement(String strElementName) {

        switch (strElementName.trim()) {
            case "addButton": return this.addButton;
            case "nameInput": return this.nameInput;
            case "codeInput": return this.codeInput;
            case "saveButton": return this.saveButton;
            case "shortName": return this.shortName;
            case "integrationCode" : return this.integrationCode;
            case "priorityCode" : return this.priorityCode;
            case "toggleBar": return this.toggleBar;
            case "saveClose" : return this.saveClose;
            case "countrySelect": return this.countrySelect;
            case "countryOption": return countryOption;
        }
        return null;
    }
}
//ms-add-button[@tooltip='COUNTRY.TITLE.ADD']//button
//ms-add-button[@tooltip='STATE.TITLE.ADD']//button

//ms-add-button[contains(@tooltip,'TITLE.ADD')]//button