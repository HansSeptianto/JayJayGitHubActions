package com.hans.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {
    WebDriver driver;
    WebDriverWait wait;

    By productTitle = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By menuButton = By.id("react-burger-menu-btn");
    By aboutMenuButton = By.id("about_sidebar_link");
    By logoutButton = By.id("logout_sidebar_link");
    By addToCartButton = By.id("add-to-cart-sauce-labs-backpack");
    By cartButton = By.xpath("//*[@id=\"shopping_cart_container\"]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void validateOnHomePage() {
        WebElement productElement = driver.findElement(productTitle);
        assertTrue(productElement.isDisplayed());
        assertEquals("Sauce Labs Backpack", productElement.getText());
    }

    public void clickMenuButton() {
        driver.findElement(menuButton).click();
    }

    public void clickAboutMenuButton() {
        wait.until(ExpectedConditions.elementToBeClickable(aboutMenuButton));
        driver.findElement(aboutMenuButton).click();
    }

    public void validateOnAboutPage() {
        assertEquals("https://saucelabs.com/", driver.getCurrentUrl());
    }

    public void clickLogoutButton() {
        wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
        driver.findElement(logoutButton).click();
    }

    public void clickTheAddToCartButton() {
        driver.findElement(addToCartButton).click();
    }

    public void clickCartButton() {
        driver.findElement(cartButton).click();
    }

    public void clickOneOfTheItems() {
        driver.findElement(productTitle).click();
    }
}
