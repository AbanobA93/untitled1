package testAutomation;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest{
    @Test
    public void validLogin (){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");
        HomePage homePage = new HomePage(driver);
        boolean isHeaderDisplayed = driver.findElement(homePage.getHeaderArea()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);

    }
   @Test
            public void invalidLogin (){
            LoginPage loginPage = new LoginPage(driver);
            loginPage.login ("he2","he2");
            boolean isErrorButtonDisplayed = driver.findElement(loginPage.getErrorButton()).isDisplayed();
            Assert.assertTrue(isErrorButtonDisplayed);

   }
}
