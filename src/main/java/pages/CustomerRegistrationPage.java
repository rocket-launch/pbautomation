package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CustomerRegistrationPage extends FormPage {

    private By registrationButtonLocator = By.cssSelector(".form2 .button");
    private By signUpTextMessageLocator = By.cssSelector("#rightPanel p");

    public CustomerRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public DashboardPage clickRegisterButton() {
        driver.findElement(registrationButtonLocator).click();
        return new DashboardPage(driver);
    }

    public String getSignUpTextMessage() {
        return driver.findElement(signUpTextMessageLocator).getText();
    }
}
