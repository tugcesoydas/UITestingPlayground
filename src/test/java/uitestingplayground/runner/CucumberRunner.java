package uitestingplayground.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {

        "pretty",
        "json:target/cucumber.json","json:target/cucumber-reports/Cucumber.json"
        },

        features = "src/test/resources/features",
        glue = "uitestingplayground/step_definitions",
        dryRun = false,
        publish =false,
        tags = "@AllCases"



        )

public class CucumberRunner {
}
