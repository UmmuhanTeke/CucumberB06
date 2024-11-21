package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(  //burada nelerin yazılacağını söylüyorum
        features = {"src/test/java/FeatureFiles/_01_Login.feature"}, //buraya featurefiles path'i geliyor ! (sağ tuş,path,content root)
        glue = {"StepDefinitions"}  //Step Definitions klasörünün adı yazılıyor.
)

public class _01_TestRunner extends AbstractTestNGCucumberTests {
    //Bu class tiplerine Runner Class lar denir.
    //Todo extends AbstractTestNGCucumberTests direkt çalıştırma özelliği kazandırıyor.
}

// features pathlerinin alınması : ilgili feature dosyasının üzerinde
// sağ tuş -> copypath/refenrence seçildikten sonra çıkan seçeneklerden
// "content root" seçeneği ile uygun path alınmış olur.
