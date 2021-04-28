package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;


public class HomePage {

    public WebDriver driver;
    public static Logger LOGGER = Logger.getLogger(HomePage.class.getName());


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 60), this);
    }

    @FindBy(how = How.ID, using = "edit-fieldset-category")
    private WebElement selectTopics;

    @FindBy(how = How.ID, using = "edit-submit-news")
    private WebElement applyButton;

    @FindBy(how = How.XPATH, using = "//input[contains(@id,'edit-reset')]")
    private WebElement resetButton;


    public void selectCategory(String topic) {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        selectTopics.click();
        String xpath = "//label[contains(text(),'" + topic + "')]";
        driver.findElement(By.xpath(xpath)).click();
        wait.until(ExpectedConditions.elementToBeClickable(applyButton)).click();
        applyButton.click();
    }

    public void checkOnReset() {
        WebDriverWait wait = new WebDriverWait(driver, 60);
        wait.until(ExpectedConditions.visibilityOf(resetButton));
        LOGGER.info("Reset Button is visible");
        resetButton.click();
    }

    public void getURL(String url)
    {
        driver.get(url);
    }


}
