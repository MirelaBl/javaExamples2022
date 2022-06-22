import org.testng.annotations.Test;

public class HomeTests extends BaseTests {
    @Test
    public void loginTest() {
        homePage.clickLogin();
        loginPage.fullLogin();
    }


}
