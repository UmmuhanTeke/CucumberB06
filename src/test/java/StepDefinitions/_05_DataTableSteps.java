package StepDefinitions;

import Pages.DialogContent;
import Pages.LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _05_DataTableSteps {
    LeftNav ln=new LeftNav();
    DialogContent dc=new DialogContent();

    @And("Click on the Element in LeftNav")
    public String clickOnTheElementInLeftNav(DataTable dtLinks) {
        List<String> links=dtLinks.asList();
        String firstName="Faker"; 

        for (int i = 0; i < links.size(); i++) {
            ln.myClick(ln.getWebElement(links.get(i)));  //Sevgili ln ben sana String adını göndereyim sen bana Webelement getir.
        }
        //LeftNav classdan Webelement çağırdık. Stringe click yaptıramazdım.
        return firstName;
    }

    @And("Click on the Element in Dialog")
    public void clickOnTheElementInDialog(DataTable dtButtons) {
        List<String> buttons=dtButtons.asList();

        for (int i = 0; i < buttons.size(); i++) {
            ln.myClick(dc.getWebElement(buttons.get(i)));
        }
    }

    @And("User sending the keys in Dialog")
    public void userSendingTheKeysInDialog(DataTable dtBoxAndTexts) {
        List<List<String> > boxAndTexts=dtBoxAndTexts.asLists();

        for (int i = 0; i < boxAndTexts.size(); i++) {
            WebElement box=dc.getWebElement(boxAndTexts.get(i).get(0));
            dc.mySendKeys(box, boxAndTexts.get(i).get(1));
        }
    }

    @And("User delete the element from dialog")
    public void userDeleteTheElementFromDialog(DataTable dtSilinecekler) {
        List<String> silinecekler=dtSilinecekler.asList();

        for (int i = 0; i < silinecekler.size(); i++) {
            dc.deleteItem(silinecekler.get(i));
        }
    }
}
