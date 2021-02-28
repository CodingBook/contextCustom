package org.cb.contextCustom.stepdef;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.cb.contextCustom.utils.ConfigurationReader;
import org.cb.contextCustom.utils.MyDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class Hooks {
    Logger logger = LoggerFactory.getLogger(Hooks.class);

    @Before
    public void setup() {
        logger.info("##### SETUP STARTED (HOOK) ######");
        MyDriver.get().manage().window().maximize();
        // We can resize our browser with the following codes.
//        MyDriver.get().manage().window().setSize(new Dimension(1350,768));

//        JavascriptExecutor execute_script = (JavascriptExecutor)MyDriver.get();
//        execute_script.executeScript("document.body.style.zoom='0.8'");   //80%

//        JavascriptExecutor executor = (JavascriptExecutor)MyDriver.get();
//        executor.executeScript("document.body.style.zoom = '1.5'");       //150%

        MyDriver.get().get(ConfigurationReader.getProperty("baseUrl"));
        MyDriver.get().manage().deleteAllCookies();
        MyDriver.get().navigate().refresh();

        MyDriver.get().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void after(Scenario scenario){
        if(scenario.isFailed()){
            logger.error("!!!!Test Failed! check the screenshot!!!!");
            byte[] screenshot= ((TakesScreenshot)MyDriver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","Screenshot");
            //scenario.embed(screenshot,"image/png"); versiyon 4.7.4

        }else {
            logger.info("Test Completed");
        }
        logger.info("###### END OF TESTS #####");

        String browserClose = ConfigurationReader.getProperty("browserClose");
        System.out.println("Browser Close" + browserClose);
        if(browserClose.equals("0")) {MyDriver.get().close();}

    }
}

