package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    //driver
    private WebDriver driver;
    public LoginPage (WebDriver driver){
        this.driver = driver;



    }


    //elements

   private By usernameFiled = By.id("user-name");
   private By passwordFiled = By.id("password");
   private By loginButton = By.id("login-button");
   private By errorButton = By.className("error-button");

   //getter

   public  By getErrorButton (){
       return errorButton;
   }

    //action

    public void login (String userName, String password) {
    driver.findElement(usernameFiled).sendKeys(userName);
    driver.findElement(passwordFiled).sendKeys(password);
    driver.findElement(loginButton).click();
    }
}
