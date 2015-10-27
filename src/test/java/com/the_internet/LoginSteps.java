package com.the_internet;

import static org.junit.Assert.assertEquals;
import cucumber.api.PendingException;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;

public class LoginSteps implements En{
    WebDriver driver;

    public LoginSteps() {

    Given("^the Symbiote home page$", () -> {
        driver.get("https://symbiote-app.herokuapp.com");
        assertEquals("Symbiote", driver.getTitle());
    });

    When("^logging in as an admin$", () -> {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    });

    Then("^the home page navigation is available$", () -> {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    });



    }

    @Before
    public void startUp() {
        driver = new FirefoxDriver();
    }
    @After
    public void tearDown() {
        driver.quit();
    }
}