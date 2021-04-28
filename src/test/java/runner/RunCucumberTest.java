package runner;


import helper.BasePage;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.net.MalformedURLException;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"steps","src/test/java"},
        plugin = {
                "pretty:STDOUT",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/json-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun-reports/rerun.txt"
        }
)
public class RunCucumberTest {



}
