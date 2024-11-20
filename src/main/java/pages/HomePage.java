package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Registration link locator.
    private final By registrationLinkLocator = By.cssSelector("#loginPanel a[href^=\"register\"]");
    // Forgot login info locator.
    private final By forgotLoginInfoLinkLocator = By.cssSelector("#loginPanel a[href^=\"lookup\"]");

    // Click on registration link.
    public CustomerRegistrationPage clickRegisterLink() {
        WebElement registrationLink = driver.findElement(registrationLinkLocator);
        registrationLink.click();
        return new CustomerRegistrationPage(driver);
    }

    // Click on forgot login info link.
    public CustomerLookupPage clickForgotLoginInfoLink() {
        WebElement forgotLoginInfoLink = driver.findElement(forgotLoginInfoLinkLocator);
        forgotLoginInfoLink.click();
        return new CustomerLookupPage(driver);
    }
}
