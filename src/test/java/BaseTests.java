import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    WebDriver driver;

    public void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {

    }
}
