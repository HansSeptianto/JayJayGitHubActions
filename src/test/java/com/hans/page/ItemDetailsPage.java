package com.hans.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ItemDetailsPage {
    WebDriver driver;

    By itemTitle = By.xpath("//*[@id=\"inventory_item_container\"]/div/div/div[2]/div[1]");

    public ItemDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void validateOnItemDetailsPage() {
        WebElement itemDetailsTitle = driver.findElement(itemTitle);
        assertTrue(itemDetailsTitle.isDisplayed());
        assertEquals("Sauce Labs Backpack", itemDetailsTitle.getText());
    }
}
