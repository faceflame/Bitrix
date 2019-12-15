package tests.SmokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.TestBase;
import utilities.Driver;

public class VerifyLogin extends TestBase {

    @Test(description = "verify login through page title")
    public void test(){

        extentLogger = report.createTest("verify login through page title");

        LoginPage loginPage= new LoginPage();
        extentLogger.info("Login w valid credentials");
        loginPage.login();

        String actualPageTitle= Driver.get().getTitle();
        String expectedPageTitle="Portal";
        extentLogger.info("Confirm actual Page Title matches 'Portal'");
        Assert.assertEquals(actualPageTitle, expectedPageTitle, "Actual page title is not 'Portal'");


    }
}
