package pages;

import BaseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private static String ENDPOINT ="/";
    private static By USERNAME_SELECTOR = By.id("user-name");
    private static By PASSWORD_SELECTOR = By.id("password");
    private static By BUTTON_SELECTOR = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void openPage(){
        driver.get(BASE_URL+ENDPOINT);
    }

    public boolean isOpenedPages(){
        return driver.findElement(BUTTON_SELECTOR).isDisplayed();
    }

    private WebElement getUserName(){
        return driver.findElement(USERNAME_SELECTOR);
    }

    public void setUserName (String username){
        getUserName().sendKeys(username);
    }

    public String getUserNameValue(){
       return getUserName().getText();
    }


     private WebElement getPassword(){
        return driver.findElement(PASSWORD_SELECTOR);
    }

    public void setPassword (String password){
        getPassword().sendKeys(password);
    }

    private WebElement getButton (){
        return driver.findElement(BUTTON_SELECTOR);
    }

    public void clickButton(){
        getButton().click();
    }



}
