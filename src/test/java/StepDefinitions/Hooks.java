package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks { //Kanca

    //Cucumbera ait her senaryodan sonra çalışan
    //Annotation
    @After
    public void after(Scenario scenario) { //Cucumberın otomatik senaro ile ilgili bilgiler değişkeni

        if (scenario.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            scenario.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        GWD.quitDriver();
    }
}
