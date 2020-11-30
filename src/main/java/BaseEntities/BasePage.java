package BaseEntities;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public static String BASE_URL = "https://www.saucedemo.com";
    public WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;

    }

    public void openPage(String URL){

    }

    public boolean isOpenedPages(){
        return true;
    }
}
