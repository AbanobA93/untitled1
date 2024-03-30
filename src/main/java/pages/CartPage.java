package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    public CartPage(WebDriver driver){
        this.driver = driver;
    }

    //elements
    private By productName = By.xpath("//div[text()=\"Sauce Labs Backpack\"]");
    private By removeButton = By.id("remove-sauce-labs-backpack");
    private By checkOutButton = By.xpath("//button[@name=\"checkout\"]");

    //getter
    public By getProductName (){
        return productName;
    }
    public By getRemoveButton (){
        return removeButton;
    }
    public By getCheckOutButton(){
        return checkOutButton;
    }
    //////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    public void clickRemoveButton (){
        driver.findElement(removeButton).click();


    }
    public void moveToCheckOut(){
        driver.findElement(checkOutButton).click();

    }

}
