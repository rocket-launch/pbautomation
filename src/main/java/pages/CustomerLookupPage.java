package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLookupPage extends FormPage {

    private By lookupButtonLocator = By.cssSelector(".form2 .button");
    private By unsuccessfulLookupInfoLocator = By.cssSelector("#rightPanel .error");

    public CustomerLookupPage(WebDriver driver) {
        super(driver);
    }

    public DashboardPage clickToSuccessfulLookupInfo() {
        driver.findElement(lookupButtonLocator).click();
        return new DashboardPage(driver);
    }

    public void clickToUnsuccessfulLookupInfo() {
        driver.findElement(lookupButtonLocator).click();
    }

    public String verifyUnsuccessfulLookupInfo() {
        WebElement unsuccessfulLookupInfo = driver.findElement(unsuccessfulLookupInfoLocator);
        return unsuccessfulLookupInfo.getText();
    }
}
