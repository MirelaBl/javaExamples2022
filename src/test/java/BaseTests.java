import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class giBaseTests {

    protected  WebDriver driver;
    protected HomePage homePage;
    protected LoginPage loginPage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.edge.driver","src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/books");

         homePage = new HomePage(driver);
         loginPage = new LoginPage(driver);
    }

    @Test
    public void printBooksTest(){
        homePage.printBooks();
    }

    @Test
    public void checkIfBookIsVisibleTest(){
        String expectedBook = "Speaking JavaScript\n" +
                "Axel Rauschmayer\n" +
                "O'Reilly Media";
        Assert.assertTrue(homePage.getBookListString().contains(expectedBook), "The specified book is not available" );
    }



}
