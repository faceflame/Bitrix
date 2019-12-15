package tests.SmokeTest;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;
import tests.TestBase;

public class MenuItemsSubtitleTest extends TestBase {

    @DataProvider(name = "MenuData")
    public Object[][] data() {

        return new Object[][]{

                {"Activity Stream", "Activity Stream"},
                {"Tasks", "My tasks"},
                {"Workgroups", "Workgroups and projects"},
                {"Drive", "My Drive"},
                {"Calendar", "Calendar"},
                {"Mail", "Mailbox Integration"},
                {"Contact Center", "Contact Center"},
                {"Time and Reports", "Absence Chart"},
                {"Employees", "Company Structure"},
                {"Services", "Meeting Rooms"},
                {"Company", "Company"}

        };

    }

    @Test(dataProvider = "MenuData")
    public void test1(String moduleName, String pageSubtitle) {
        LoginPage loginPage = new LoginPage();
        extentLogger=report.createTest("Verify Modules Subtitle Test");
        loginPage.login();
        extentLogger.info("Successful login");
        loginPage.moveToModule(moduleName);
        extentLogger.info("Clicked on the module name");

        String actualPageSubtitle = loginPage.getPageTitle();
        String expectedPageSubtitle = pageSubtitle;

        Assert.assertEquals(actualPageSubtitle, expectedPageSubtitle);
        extentLogger.info("ActualPage subtitle is: " + actualPageSubtitle +"ExpectedPage subtitle is " +expectedPageSubtitle);

    }


    @Test(description = "Menu Items Subtitle Test")
    public void test() {
        extentLogger = report.createTest("Menu Items Subtitle Test");
        LoginPage loginPage = new LoginPage();
        loginPage.login();
        loginPage.moveToModule("Activity Stream");

        String actualPageSubtitle = loginPage.getPageTitle();
        String expectedPageSubtitle = "Activity Stream";

        Assert.assertEquals(actualPageSubtitle, expectedPageSubtitle);


    }
}
