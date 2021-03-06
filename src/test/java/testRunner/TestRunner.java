package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features",
                glue = "src/test/java/StepDefinations",
                //dryRun = true,
                plugin = {"pretty","html:test-output"}
        )
class TestRunner {


}