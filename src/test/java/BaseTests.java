import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.time.Duration;

public class BaseTests {
    WebDriver driver;
    HomePage homePage;

    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        homePage = new HomePage(driver);
    }

    @AfterEach
    public void tearDown() {
       driver.quit();
    }
}
