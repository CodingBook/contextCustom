package org.cb.contextCustom.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        // Glue path must start after java folder. (after this -> src/test/java)
        glue = "org/cb/contextCustom/stepdef",
        dryRun =false,
        strict = false,
        tags = "@Kids",
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"
        }
)
public class Runner {
}


