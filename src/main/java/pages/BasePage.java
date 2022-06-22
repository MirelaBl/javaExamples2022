package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    private WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void click(WebElement element){
        element.click();
    }
    public void setText(WebElement element, String text){
        element.sendKeys(text);
    }
    public String getText(WebElement element){
        return element.getText();
    }

    public List<WebElement> findElements(By element){
        return driver.findElements(element);
    }
}
