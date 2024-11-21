package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", //sadece tag i belirtilen senaryoları çalıştırılır.
        features = {"src/test/java/FeatureFiles"},  //TODO klasördeki bütün feature lar
        glue = {"StepDefinitions"},
        plugin = {"html:target/site/cucumber-pretty.html"}  //basic report
        //html ile target site yolunu verdik
)
public class _06_TestRunnerSmokeWithPlugin extends AbstractTestNGCucumberTests {
}
