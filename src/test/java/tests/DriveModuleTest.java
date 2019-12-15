package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PageBase;
import utilities.BrowserUtils;
import utilities.Driver;

public class DriveModuleTest extends TestBase {

    @Test(description = "verify Drive module is clicked")
    public void test1() {
        extentLogger = report.createTest("Verify Drive module is clicked");
        LoginPage loginPage = new LoginPage();
        extentLogger.info("login w valid credentials");
        loginPage.login();
        extentLogger.info("Click on Tasks menu");
        loginPage.moveToModule("Tasks");
        extentLogger.info("Verify that page subtitle matches 'My tasks'");
        BrowserUtils.waitFor(2);
        Assert.assertEquals(loginPage.getPageTitle(), "My tasks");
      System.out.println(loginPage.getPageTitle());

        extentLogger.info("Click on Module meu");
        loginPage.moveToModule("Mail");
        BrowserUtils.waitFor(2);

        extentLogger.info("Verify that page subtitle is 'Mail Integration'");
        System.out.println(loginPage.getPageTitle());
        Assert.assertEquals(loginPage.getPageTitle(), "Mailbox Integration");


    }
}
