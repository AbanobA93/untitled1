package testAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver driver;



    //elements
    By usernameFiled = By.id("user-name");
    By passwordFiled = By.id("password");
    By loginButton = By.id("login-button");


    @BeforeMethod
    public void setup() {
        driver = new EdgeDriver();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @AfterMethod

    public void tearDown () {
        driver.quit();
    }
}
