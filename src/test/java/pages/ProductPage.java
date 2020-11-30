package pages;

import BaseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    private static String ENDPOINT ="/inventory.html";

    private static By PRODUCT_SELECTOR = By.xpath("//div[text()=\"Sauce Labs Backpack\"]");
    private static By BUTTON_Add_to_Cart = By.className("btn_primary btn_inventory");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void OpenPage(){
        driver.get(BASE_URL+ENDPOINT);
    }

    public boolean isOpenPage (){
        return driver.findElement(BUTTON_Add_to_Cart).isDisplayed();
    }

    private WebElement getNameProduct(){
        return driver.findElement(PRODUCT_SELECTOR);
    }

    public void clickNameProduct(){
        getNameProduct().click();
    }




}
