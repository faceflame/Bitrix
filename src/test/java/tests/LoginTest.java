package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utilities.Driver;

public class LoginTest extends TestBase{

    @Test(description = "Login Test")
    public void test1(){
        extentLogger= report.createTest("Positive Login Test");
        LoginPage loginPage= new LoginPage();
        extentLogger.info("Sending in valid username and password");
        loginPage.login();

        String expectedPagetitle= "Portal";
        String actualPageTitle=Driver.get().getTitle();

        Assert.assertEquals(actualPageTitle, expectedPagetitle);
        extentLogger.info("Confirm actualPageTitle matched expectedPage title, which is " + actualPageTitle + " = " + expectedPagetitle);


    }

}
