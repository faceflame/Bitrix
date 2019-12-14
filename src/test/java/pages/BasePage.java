package pages;

import org.jsoup.Connection;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BasePage {
    public BasePage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(className = "menu-item-link-text'")
    List<WebElement>modules;
}
