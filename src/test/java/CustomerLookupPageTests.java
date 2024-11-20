import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;

public class CustomerLookupPageTests extends  BaseTests {

    RegistrationData validRegistrationData = new RegistrationData(
            "Fabian",
            "Ferreira",
            "Mapple Park 1023",
            "Detroit",
            "Michigan",
            "34213",
            "(123) 3844-1234",
            "9982304219",
            "fabian_username",
            "SU391!sT0",
            "SU391!sT0");

    RegistrationData nonMatchingLookupData = new RegistrationData(
            "Fabian",
            "Ferreira",
            "Mapple Park 1023",
            "Detroit",
            "Michigan",
            "34213",
            "(123) 3844-1234",
            "093591235",
            "fabian_user",
            "SU391!sT0",
            "SU391!sT0");

    @BeforeEach
    public void setUp() {
        super.setUp();

    }

    @Test
    public void testCustomerLookupWithValidInformation() {
        CustomerRegistrationPage registrationPage = homePage.clickRegisterLink();

        registrationPage.fillInForm(validRegistrationData);
        DashboardPage dashboardPage = registrationPage.clickRegisterButton();
        homePage = dashboardPage.logOut();

        CustomerLookupPage lookupPage = homePage.clickForgotLoginInfoLink();
        lookupPage.fillInForm(validRegistrationData);
        lookupPage.clickLookUpInfo();

        //TODO: assert user is successfully logged in again.
    }

    @Test
    public void testCustomerLookupWithInvalidInformation() {
        CustomerRegistrationPage registrationPage = homePage.clickRegisterLink();

        registrationPage.fillInForm(validRegistrationData);
        DashboardPage dashboardPage = registrationPage.clickRegisterButton();
        homePage = dashboardPage.logOut();

        CustomerLookupPage lookupPage = homePage.clickForgotLoginInfoLink();
        lookupPage.fillInForm(nonMatchingLookupData);
        lookupPage.clickLookUpInfo();

        //TODO: assert user lookout fails.
    }
}
