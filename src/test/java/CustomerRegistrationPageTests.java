import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CustomerRegistrationPage;
import pages.DashboardPage;
import pages.RegistrationData;
import pages.UsernameSSNGenerator;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerRegistrationPageTests extends BaseTests {

    CustomerRegistrationPage registrationPage;

    RegistrationData validRegistrationData = new RegistrationData(
            "Fabian",
            "Ferreira",
            "Mapple Park 1023",
            "Detroit",
            "Michigan",
            "34213",
            "(123) 3844-1234",
            "000" + UsernameSSNGenerator.generateSSN(),
            "_" + UsernameSSNGenerator.generateUsername(),
            "SU391!sT0",
            "SU391!sT0");

    @BeforeEach
    public void setUp() {
        super.setUp();
        registrationPage = homePage.clickRegisterLink();
    }

    @Test
    public void testRegisterWithValidInformation() {
        registrationPage.fillInForm(validRegistrationData);
        DashboardPage dashboardPage = registrationPage.clickRegisterButton();

        assertEquals("Your account was created successfully. You are now logged in.", dashboardPage.verifySuccessfulRegistration());
    }
}
