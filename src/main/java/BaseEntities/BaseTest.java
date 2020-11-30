package BaseEntities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    private static String PATH_TO_DRIVER = "C:\\Drivers2\\chromedriver.exe";
    public WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver",PATH_TO_DRIVER);
        driver = new ChromeDriver();
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}
