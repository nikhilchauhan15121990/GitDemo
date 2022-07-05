package cucumber.Options;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
        dryRun = false,
        monochrome = true,
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:test-output.html", "json:target/cucumber.json", "junit:target/cukes.xml"})
public class TestRunner {

}
