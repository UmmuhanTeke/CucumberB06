package StepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class _04_DataTableOrnek {
    @When("Write username {string}")
    public void writeUsername(String username) {
        System.out.println(username);
    }

    @When("Write username and password {string} and {string}")
    public void writeUsernameAndPasswordAnd(String username, String password) {
        System.out.println(username+" "+password);
    }

    @And("Write username as Datatable")
    public void writeUsernameAsDatatable(DataTable dtUsers) { //TODO hepsini alıyor, paket gibi içine atıyor !(List sıra ile atardı)
        List<String> listUsers=dtUsers.asList();  //asList içine String.class da yazılabilirdi. Stringin tipini istiyor.

        for (String user: listUsers)
            System.out.println(user);
    }

    @And("Write username and password as Datatable")
    public void writeUsernameAndPasswordAsDatatable(DataTable dtUserPass) { //TODO İki boyutlu alıyor.
        List<List<String>> listUserPass=dtUserPass.asLists();

        for (int i = 0; i < listUserPass.size(); i++) {
            System.out.println(listUserPass.get(i).get(0)+" "+listUserPass.get(i).get(1));
        }
    }
}