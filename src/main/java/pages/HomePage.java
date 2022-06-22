package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "#login")
    private WebElement loginButton;

    public void clickLogin(){
        click(loginButton);
    }
    // stocam o list de carti
    public List<WebElement> getBookElements(){
        return findElements(By.cssSelector(".rt-tr-group"));
    }
    //
    public List<String> getBookListString(){
        ArrayList<String> books = new ArrayList<>();
        for(var bookElement : getBookElements()){
            books.add(bookElement.getText());
            System.out.println(bookElement.getText());
        }
        return books;

    }


    // afisam la consola
    public void printBooks(){
        for(WebElement element:findElements(By.cssSelector(".rt-tr-group"))){
            System.out.println(element.getText() +"\n");
        }
    }
}
