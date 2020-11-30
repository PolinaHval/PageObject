package tests;

import BaseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProductPage;

public class MainTest extends BaseTest {

    @Test
    public void test (){
        LoginPage loginpage = new LoginPage (driver);
        loginpage.openPage();
        loginpage.setUserName("standard_user");
        loginpage.setPassword("secret_sauce");
        loginpage.clickButton();

        ProductPage productPage = new ProductPage(driver);
        productPage.OpenPage();
        productPage.clickNameProduct();

       Assert.assertTrue(true);
    }

}
