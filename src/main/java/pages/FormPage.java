package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    public void fillInForm(RegistrationData userRecord) {

        for (FormElements element : FormElements.values()) {
            By selector = By.cssSelector(".form2 [id*=\"" + element.id + "\"]");
            WebElement webElement;
            try {
                webElement = driver.findElement(selector);
            } catch (Exception e) {
                continue;
            }
            switch (element) {
                case FIRSTNAME -> webElement.sendKeys(userRecord.firstName());
                case LASTNAME -> webElement.sendKeys(userRecord.lastName());
                case ADDRESS -> webElement.sendKeys(userRecord.address());
                case CITY -> webElement.sendKeys(userRecord.city());
                case STATE -> webElement.sendKeys(userRecord.state());
                case ZIPCODE -> webElement.sendKeys(userRecord.zipCode());
                case PHONE -> webElement.sendKeys(userRecord.phoneNumber());
                case SSN -> webElement.sendKeys(userRecord.socialSecurityNumber());
                case USERNAME -> webElement.sendKeys(userRecord.username());
                case PASSWORD -> webElement.sendKeys(userRecord.password());
                case PASSWORDCONFIRMATION -> webElement.sendKeys(userRecord.passwordConfirmation());
            }
        }
    }
}
