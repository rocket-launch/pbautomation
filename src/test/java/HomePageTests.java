import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CustomerLookupPage;
import pages.CustomerRegistrationPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.*;


public class HomePageTests extends BaseTests {

    @BeforeEach
    public void setUp() {
        super.setUp();
    }

    @Test
    public void testHomePageLoadedSuccessfully() {
        assertEquals("https://parabank.parasoft.com/parabank/index.htm", driver.getCurrentUrl());
    }

    @Test
    public void testClickRegistrationLink() {
        CustomerRegistrationPage registrationPage = homePage.clickRegisterLink();
        assertEquals(
                "If you have an account with us you can sign-up for free instant online access. You will have to provide some personal information.",
                registrationPage.getSignUpTextMessage()
        );
    }

    @Test
    public void testClickForgotLoginInfoLink() {
        CustomerLookupPage lookupPage = homePage.clickForgotLoginInfoLink();
        assertEquals("Please fill out the following information in order to validate your account.", lookupPage.getCustomerLookupMessage());
    }
}
