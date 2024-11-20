package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

public class CustomerRegistrationPage extends FormPage {

    public CustomerRegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void clickRegisterButton() {
        driver.findElement(By.cssSelector(".form2 .button")).click();
    }
}
