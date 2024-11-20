import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.CustomerLookupPage;
import pages.CustomerRegistrationPage;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.*;


public class HomePageTests extends BaseTests {
    HomePage homePage;

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
        //TODO: Verify registration page.
    }

    @Test
    public void testClickForgotLoginInfoLink() {
        CustomerLookupPage lookupPage = homePage.clickForgotLoginInfoLink();
        //TODO: Verify forgot login info page.
    }
}
