package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomerLookupPage extends FormPage {

    public CustomerLookupPage(WebDriver driver) {
        super(driver);
    }

    public void clickLookUpInfo() {
        driver.findElement(By.cssSelector(".form2 .button")).click();
    }
}
