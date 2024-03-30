package testAutomation;

import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class CartTest extends BaseTest{

    public void checkOutButton() {
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
        cartPage.getCheckOutButton();

    }
}
