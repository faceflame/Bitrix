package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;

import javax.security.auth.login.Configuration;

public class LoginPage {

    public LoginPage (){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(name = "USER_LOGIN")
    private WebElement username;

    @FindBy(name = "USER_PASSWORD")
    private WebElement password;

    @FindBy(id = "USER_REMEMBER")
    private WebElement rememberButton;

    @FindBy(className = "login-btn")
    private WebElement submitButton;

    @FindBy(className = "login-link-forgot-pass")
    private WebElement forgetPasswordButton;


public void login (){
    username.clear();
    username.clear();

    username.sendKeys(ConfigurationReader.get("username"));
    password.sendKeys(ConfigurationReader.get("password"));

    submitButton.click();
}

}
