package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static WebDriver driver;


    public WebDriver getDriver() {
        String os = System.getProperty("os.name").toLowerCase();

        if(os.contains("mac")) {
            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        }
        else{
            System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        }
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        return driver;
    }

}
