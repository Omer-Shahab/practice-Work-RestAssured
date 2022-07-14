package Runner;

import TestBase.TestBase;
import org.junit.*;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


import static TestBase.TestBase.*;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/Users/smomer/IdeaProjects/STA_BDD_PAGE_FACTORY_Demoqa/src/test/java/Features/Login/login.feature",
        glue = {"StepDefinations"},

        plugin = { "pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm"},

//        plugin = {"pretty", "html:test-outout", "json:json_output/cucumber.json", "io."},
        monochrome = true,
        strict = false,
        dryRun = false
//        tags = {"@RegressionTest"}

)

public class TestRunner {


    @BeforeClass
    public static void Open_Browser() {
        openChrome();

        String URL = prop.getProperty("url") + "/login";
        driver.get(URL);
    }

    @AfterClass
    public static void Close_Browser() throws Throwable{
        driver.quit();
    }

}
