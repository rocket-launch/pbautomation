import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CustomerRegistrationPage;
import pages.DashboardPage;
import pages.RegistrationData;
import pages.UsernameSSNGenerator;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerRegistrationPageTests extends BaseTests {

    CustomerRegistrationPage registrationPage;

    RegistrationData validRegistrationData;

    @BeforeEach
    public void setUp() {
        super.setUp();
        registrationPage = homePage.clickRegisterLink();
    }

    @Test
    public void testRegisterWithValidInformation() {
        validRegistrationData = UsernameSSNGenerator.generateNewTestUser();
        registrationPage.fillInForm(validRegistrationData);
        DashboardPage dashboardPage = registrationPage.clickRegisterButton();

        assertEquals("Your account was created successfully. You are now logged in.", dashboardPage.verifySuccessfulRegistration());
    }
}
