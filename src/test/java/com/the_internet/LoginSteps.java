package com.the_internet;

import com.saucelabs.saucerest.SauceREST;
import com.the_internet.pages.LoginPage;
import com.the_internet.pages.NavigationPage;
import cucumber.api.java8.En;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class LoginSteps extends Base implements En{
    WebDriver driver;
    LoginPage login;
    NavigationPage nav;
  //  DesiredCapabilities capabilities;
  //  String sauceUrl;
  //  private String sessionId;
  //  private SauceREST sauceClient;

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

   /* @Before("local")
    public void startUpLocal() throws Throwable {
        driver = new FirefoxDriver();

    }


    @Before("sauce")
    public void startUpSauce() throws Throwable {
        capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", browser);
        capabilities.setCapability("version", browserVersion);
        capabilities.setCapability("platform", platform);
        capabilities.setCapability("name", testName);           //sets test name in saucelabs to the test name
        capabilities.setCapability("recordVideo", recordVideo);
        capabilities.setCapability("recordScreenshots", recordScreenshots);
        //can add tags and build as capabilitiies also I believe - see sauce labs api documentation
        sauceUrl = String.format("http://%s:%s@ondemand.saucelabs.com:80/wd/hub", sauceUser, sauceKey);
        driver = new RemoteWebDriver(new URL(sauceUrl), capabilities);
        sessionId = ((RemoteWebDriver) driver).getSessionId().toString();
        sauceClient = new SauceREST(sauceUser, sauceKey);
    }
    */

    @After
    public void tearDown() {
        driver.quit();
    }
}