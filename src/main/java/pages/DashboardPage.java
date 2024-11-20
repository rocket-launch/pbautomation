package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

    private WebDriver driver;
    private By logOutLocator = By.linkText("Log Out");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage logOut() {
        WebElement logOutLink = driver.findElement(logOutLocator);
        logOutLink.click();
        return new HomePage(driver);
    }
}
