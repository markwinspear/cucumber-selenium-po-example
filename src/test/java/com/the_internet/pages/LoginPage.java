package com.the_internet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    By open = By.id("open");
    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("login-button");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage loginAsAdmin() {
        click(open);
        type("admin", usernameField);
        type("admin", passwordField);
        submit(loginButton);

        return new LoginPage(driver);
    }
}