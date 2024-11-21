package StepDefinitions;

import Pages.DialogContent;
import Utilities.DBUtility;
import _JDBC.JDBCParent;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class _17_JDBCSteps extends JDBCParent {

    DialogContent dc = new DialogContent();

    @Then("Send the Query the Database {string} and control match")
    public void sendTheQueryTheDatabaseAndControlMatch(String sorgu){
        //DB den datayı oku
        List<List<String>> dbList = DBUtility.getListData(sorgu);

        //kontrol ediyorum db den okuyabildim mi
        for (int i = 0; i < dbList.size(); i++) {
            System.out.println(dbList.get(i).get(0));
        }

        //Webden(UI) dan ekrandaki isimleri oku
        List<WebElement> UIList = dc.nameList; //findElements

        //kontrol
        for (int i = 0; i < UIList.size(); i++) {
            System.out.println(UIList.get(i).getText());
        }

        //birebir Assert yap
        for (int i = 0; i < dbList.size(); i++) {
            Assert.assertEquals(dbList.get(i).get(0), UIList.get(i).getText().trim(),"Eşleştirme yapılamadı");
        }
    }
}