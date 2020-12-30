package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;
@Test
@CucumberOptions(
        plugin = {"pretty",
                "html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"
        },
        tags = "@UATTesting",
        features = {"src/test/resources/features/"},
        glue = {"stepDefs"}
)

public class TestRunner extends AbstractTestNGCucumberTests {
}
