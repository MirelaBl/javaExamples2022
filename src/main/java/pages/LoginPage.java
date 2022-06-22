package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class LoginPage extends BasePage{
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#userName" )
    private WebElement userNameField;

    @FindBy(css = "#password" )
    private WebElement passwordField;

    @FindBy(css = "#login" )
    private WebElement loginField;

    public void fullLogin(){
        setText(userNameField, Constants.USERNAME);
        setText(passwordField, Constants.PASSWORD);
        click(loginField);
    }
}

