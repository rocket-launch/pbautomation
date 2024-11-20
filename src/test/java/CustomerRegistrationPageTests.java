import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CustomerRegistrationPage;
import pages.RegistrationData;

public class CustomerRegistrationPageTests extends  BaseTests {

    CustomerRegistrationPage registrationPage;
    RegistrationData validRegistrationData = new RegistrationData(
            "Fabián",
            "Ferreira",
            "Mapple Park 1023",
            "Detroit",
            "Michigan",
            "34213",
            "(123) 3844-1234",
            "998230421",
            "fabian_user",
            "SU391!sT0",
            "SU391!sT0");

    @BeforeEach
    public void setUp() {
        super.setUp();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        registrationPage = new CustomerRegistrationPage(driver);
    }

    @Test
    public void testRegisterWithValidInformation() {
        registrationPage.fillInForm(validRegistrationData);
        registrationPage.clickRegisterButton();
    }
}
