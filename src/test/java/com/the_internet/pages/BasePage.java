package com.the_internet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage navigateTo() {
        driver.navigate().to("https://symbiote-app.herokuapp.com");
        assertEquals("Symbiote", driver.getTitle());
        return new LoginPage(driver);
    }

    public WebElement find(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public void type(String inputText, By locator) {
        find(locator).sendKeys(inputText);

    }

    public void click(By locator) {
        find(locator).click();
    }

    public void submit(By locator) {
        find(locator).submit();
    }
}
