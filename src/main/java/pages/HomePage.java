package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage {

    private WebDriver driver;
    public HomePage (WebDriver driver){
        this.driver = driver;
    }

    String productName= "Sauce Labs Backpack";


    //elements

    private By productLink = By.xpath("//div[text()=\""+productName+"\"]");
    private static By headerArea = By.className("header_secondary_container");

    //getter
    public By getHeaderArea(){
        return headerArea;
    }


    public void openProduct(){
        driver.findElement(productLink).click();
    }




}

