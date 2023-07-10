package com.epam.tc.jdi;

import static java.lang.String.format;
import static org.assertj.core.api.Assertions.assertThat;

import com.epam.jdi.light.driver.WebDriverUtils;
import com.epam.jdi.light.elements.init.PageFactory;
import com.epam.tc.jdi.entities.User;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class JdiSiteTest {

    public static final int EXPECTED_BENEFITS_COUNT = 4;

    @BeforeSuite(alwaysRun = true)
    public void beforeSuite() {
        PageFactory.initSite(JdiSite.class);
    }

    @AfterSuite(alwaysRun = true)
    public void afterSuite() {
        WebDriverUtils.killAllSeleniumDrivers();
    }

    @Test
    public void jdiHomepageBenefitsTest() {
        /*
         * 1. open home page
         * 2. check benefits count
         */
        JdiSite.open();
        int actualCount = JdiSite.jdiHomePage.getBenefitsCount();
        assertThat(actualCount)
            .as(() -> format("Expected benefits: %s, but actual: %s", EXPECTED_BENEFITS_COUNT, actualCount))
            .isEqualTo(EXPECTED_BENEFITS_COUNT);
    }

    @Test
    public void loginTest() {
        final User user = new User("Roman", "Jdi1234", "Roman Iovlev");
        JdiSite.open();
        JdiSite.login(user);
        final String actualUserName = JdiSite.getUserName();
        assertThat(actualUserName)
            .isEqualToIgnoringCase(user.getFullName());
    }
}
