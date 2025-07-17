package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "features",  // ✅ Absolute path to feature files
    glue = {"steps", "Hooks"},     // ✅ Add all glue packages (step defs, hooks, etc.)
    plugin = {
        "pretty",                              // ✅ Neat console output
        "html:target/cucumber-reports.html",   // ✅ HTML report
        "json:target/cucumber.json"            // ✅ JSON report (for CI/CD or Allure)
    },
    monochrome = true,                         // ✅ Clean readable console output
    dryRun = false                             // ✅ Set to true if you want to check for missing step defs
)
public class TestRunner {
}
