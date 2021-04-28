package steps;

import helper.BasePage;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.MalformedURLException;
import java.util.logging.Logger;

public class Hooks extends BasePage {

    private static final Logger LOGGER = Logger.getLogger(Hooks.class.getName());
    BasePage basePage = new BasePage();

    @Before()
    public void testInitialize(Scenario scenario) throws MalformedURLException {
        System.out.println(scenario.getName());
        LOGGER.info("Opening Browser");
        driver = basePage.getDriver();
    }



    @After()
    public void afterScenario(Scenario scenario) {
        System.out.println(scenario.getStatus());
        driver.quit();

    }
}