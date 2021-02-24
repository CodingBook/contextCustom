package org.cb.contextCustom.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue ={"org.cb.contextCustom.stepdef"},
        features = "src/test/resources/features/",
        // Glue path must start after java folder. (after this -> src/test/java)
<<<<<<< HEAD
//        dryRun = false,
//        strict = false,
//        tags = "@Home&Living",
=======
        glue = "org/cb/contextCustom/stepdef",
        dryRun =false,
        strict = false,
        tags = "@Home&Living",
>>>>>>> 568ad2b (runner)
        plugin = {"pretty",
                "html:target/default-cucumber-reports",
                "json:target/cucumber.json"})
public class Runner {

}
