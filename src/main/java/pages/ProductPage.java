package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    WebDriver driver;

    public ProductPage (WebDriver driver) {
        this.driver = driver;
    }

    //elements

    private By productPrice = By.className("inventory_details_price");
    String productName;
    private By productLink = By.xpath("//div[text()=\"" + productName + "\"]");
    private By addToCartButton =  By.id("add-to-cart");
    private By cartIcon = By.id("shopping_cart_container");



    //getter
    public By getProductPrice() {
        return productPrice;
    }



    ////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public void addToCart(){
        driver.findElement(addToCartButton).click();
    }

    public void moveToCartPage(){
        driver.findElement(cartIcon).click();
    }







}
