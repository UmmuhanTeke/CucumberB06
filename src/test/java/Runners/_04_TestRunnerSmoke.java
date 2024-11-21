package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest", //sadece tag i belirtilen senaryoları çalıştırılır.
        features = {"src/test/java/FeatureFiles"},  //TODO klasördeki bütün feature lar
        glue = {"StepDefinitions"}
)

public class _04_TestRunnerSmoke extends AbstractTestNGCucumberTests {
}
