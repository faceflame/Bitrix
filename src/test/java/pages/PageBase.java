package pages;

import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BrowserUtils;
import utilities.Driver;

import java.security.PublicKey;
import java.util.List;

public class PageBase {


    public PageBase(){
        PageFactory.initElements(Driver.get(), this);
    }

    public void moveToModule(String menuItem){
        WebElement moduleName= Driver.get().findElement(By.xpath("//a[@title='" + menuItem + "']"));
        BrowserUtils.waitForVisibility(moduleName, 5);
        BrowserUtils.waitForVisibility(moduleName, 5);
        moduleName.click();

    }

    public String getPageTitle(){
        WebElement pageSubtitle= Driver.get().findElement(By.id("pagetitle"));
  //      BrowserUtils.waitForStaleElement(pageSubtitle);
        String subtitleText=pageSubtitle.getText();
        return subtitleText;

    }
}
