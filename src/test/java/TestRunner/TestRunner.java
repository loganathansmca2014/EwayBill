package TestRunner;


import Utillity.ReportGen;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

@CucumberOptions(

        features = "src/test/resources/Features/",
        glue={"StepDefinition", "Utillity"},
        tags = "@TC02",
        plugin = {"json:target/cucumber.json"},
        monochrome=true
)

public class TestRunner extends AbstractTestNGCucumberTests {

    @AfterSuite
    public static void reportbuilderHTML()
    {
       ReportGen.htmlReportBuilder();
    }
}
