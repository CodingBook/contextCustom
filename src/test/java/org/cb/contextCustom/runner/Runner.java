package org.cb.contextCustom.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(glue ={"org.cb.contextCustom.stepdef"},
        // Glue path must start after java folder. (after this -> src/test/java)
        features = "src/test/resources/features/",
//        dryRun = false,
//        strict = false,
//        tags = "@Home&Living",
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"})
public class Runner {

}


