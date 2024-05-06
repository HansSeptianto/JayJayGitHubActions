package com.hans.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CartPage {
    WebDriver driver;

    By pageSecondHeader = By.xpath("//*[@id=\"header_container\"]/div[2]/span");

    By cartItem = By.xpath("//*[@id=\"cart_contents_container\"]/div/div[1]/div[3]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnCartPage() {
        WebElement pageElement = driver.findElement(pageSecondHeader);
        assertTrue(pageElement.isDisplayed());
        assertEquals("Your Cart", pageElement.getText());

        WebElement cartElement = driver.findElement(cartItem);
        assertTrue(cartElement.isDisplayed());
    }
}
