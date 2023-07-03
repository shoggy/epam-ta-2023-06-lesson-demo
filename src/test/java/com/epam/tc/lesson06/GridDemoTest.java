package com.epam.tc.lesson06;

import static org.assertj.core.api.Assertions.assertThat;

import org.testng.annotations.Test;

public class GridDemoTest extends WebDriverInitializer {
    @Test
    public void testPageTitle() {
        final String actualTitle = driver.getTitle();
        final String expectedTitle = "Home Page";
        assertThat(actualTitle)
            .as("Incorrect page title")
            .isEqualTo(expectedTitle);
    }
}
