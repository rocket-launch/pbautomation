package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    private WebDriver driver;
    private By logOutLocator = By.linkText("Log Out");
    private By successfulLookupInfoLocator = By.cssSelector("#rightPanel p");
    private By successfulRegistrationMessageLocator = By.cssSelector("#rightPanel p");

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage logOut() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        //WebElement logOutLink = wait.until(ExpectedConditions.visibilityOfElementLocated(logOutLocator));
        WebElement logOutLink = driver.findElement(logOutLocator);
        logOutLink.click();
        return new HomePage(driver);
    }

    public String verifySuccessfulLookupInfo() {
        WebElement successfulLookupInfo = driver.findElement(successfulLookupInfoLocator);
        return successfulLookupInfo.getText();
    }

    public String verifySuccessfulRegistration() {
        WebElement successfulRegistrationMessage = driver.findElement(successfulRegistrationMessageLocator);
        return successfulRegistrationMessage.getText();
    }

}
