import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;
import pages.*;
import static org.junit.jupiter.api.Assertions.*;

public class CustomerLookupPageTests extends  BaseTests {

    static RegistrationData validRegistrationData = new RegistrationData(
            "Fabian",
            "Ferreira",
            "Mapple Park 1023",
            "Detroit",
            "Michigan",
            "34213",
            "123-3844-1234",
            "000" + UsernameSSNGenerator.generateSSN(),
            "fabian_" + UsernameSSNGenerator.generateUsername(),
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
            "_" + UsernameSSNGenerator.generateSSN(),
            "8492340",
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
        DashboardPage dashboardLookup = lookupPage.clickToSuccessfulLookupInfo();

        assertEquals("Your login information was located successfully. You are now logged in.", dashboardLookup.verifySuccessfulLookupInfo());
    }

    @Test
    public void testCustomerLookupWithInvalidInformation() {
        CustomerRegistrationPage registrationPage = homePage.clickRegisterLink();

        registrationPage.fillInForm(validRegistrationData);
        DashboardPage dashboardPage = registrationPage.clickRegisterButton();
        homePage = dashboardPage.logOut();

        CustomerLookupPage lookupPage = homePage.clickForgotLoginInfoLink();
        lookupPage.fillInForm(nonMatchingLookupData);
        lookupPage.clickToUnsuccessfulLookupInfo();

        assertEquals("The customer information provided could not be found.", lookupPage.verifyUnsuccessfulLookupInfo());
    }
}
