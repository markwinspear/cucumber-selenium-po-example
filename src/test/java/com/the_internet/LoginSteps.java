package com.the_internet;

import com.the_internet.pages.LoginPage;
import com.the_internet.pages.NavigationPage;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;

public class LoginSteps implements En{
    WebDriver driver;
    LoginPage login;
    NavigationPage nav;

    public LoginSteps() {

    Given("^the Symbiote home page$", () -> {
        login = new LoginPage(driver);
        login.navigateTo();
    });

    When("^logging in as an admin$", () -> {
        login.loginAsAdmin();
    });

    Then("^the home page navigation is available$", () -> {
        nav = new NavigationPage(driver);
        nav.checkForNavigationList();
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