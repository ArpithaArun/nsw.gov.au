package steps;

import helper.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.ResultsPage;


public class StepDefinitions extends BasePage {



    @Given("^I am on the NSW news page")
    public void visitNewsPage()
    {
        HomePage homePage = new HomePage(driver);
        homePage.getURL("https://www.nsw.gov.au/news");
    }

    @When("Select {string} and apply")
    public void selectTopic(String topic) {
        HomePage homePage = new HomePage(driver);
        homePage.selectCategory(topic);
    }

    @Then("News articles of the {string} will be displayed")
    public void newsArticlesDisplayed(String topic) {
        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.verifyResults(topic);
    }

    @Then("Verify if Reset button is visible")
    public void verifyIfResetButtonIsVisible() {
        HomePage homePage = new HomePage(driver);
        homePage.checkOnReset();
    }

    @And("Verify Reset removes the filters on the results")
    public void verifyResetRemovesTheFiltersOnTheResults() {
        ResultsPage resultsPage = new ResultsPage(driver);
        resultsPage.verifyReset();
    }
}
