package testAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest {

    //Data
    String expectedPrice = "$29.99";

    @Test
    public void validateProductPrice() {
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);

        loginPage.login("standard_user","secret_sauce");
        homePage.openProduct();
        String actualValue = driver.findElement(productPage.getProductPrice()).getText();
        Assert.assertEquals(actualValue,expectedPrice);
        }
    @Test
    public void addProductToCart(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        cartPage.getProductName();
        loginPage.login("standard_user","secret_sauce");
        homePage.openProduct();
        productPage.addToCart();
        productPage.moveToCartPage();
        boolean isProductDisplayed = driver.findElement(cartPage.getProductName()).isDisplayed();
        Assert.assertTrue(isProductDisplayed);
        }
    @Test
    public void removeFromCart(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage = new CartPage(driver);
        cartPage.getProductName();
        loginPage.login("standard_user","secret_sauce");
        homePage.openProduct();
        productPage.addToCart();
        productPage.moveToCartPage();
        cartPage.getRemoveButton();
        boolean isRemoveButtonDisplayed = driver.findElement(cartPage.getRemoveButton()).isDisplayed();
    }


}


