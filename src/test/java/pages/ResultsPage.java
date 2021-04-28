package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

public class ResultsPage {
    public WebDriver driver;
    public static Logger LOGGER = Logger.getLogger(HomePage.class.getName());


    public ResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    @FindBy(how = How.CSS, using = ".nsw-card__tag")
    private List<WebElement> resultTitles;

    public void verifyResults(String topic) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (WebElement title : resultTitles) {
            Assert.assertTrue("The results dont match the filter ", title.getText().contains(topic));
        }
        LOGGER.info("The results match the category" + topic + " selected");

    }

    public void verifyReset() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ArrayList<String> results = new ArrayList<String>();
        for (WebElement title : resultTitles) {
            results.add(title.getText());
        }
        Set<String> uniqueResults = new HashSet<String>(results);
        Assert.assertTrue("The filters has not been removed", uniqueResults.size() > 3);
        LOGGER.info("The filters have been successfully removed");
    }

}
