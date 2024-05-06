package com.hans.stepdef;

import com.hans.BaseTest;
import com.hans.page.CartPage;
import com.hans.page.HomePage;
import io.cucumber.java.en.Then;

public class CartStepDef extends BaseTest {
    CartPage cartPage;
    HomePage homePage;

    @Then("the item added to the cart")
    public void theItemAddedToTheCart() {
        homePage = new HomePage(driver);
        cartPage = new CartPage(driver);
        homePage.clickCartButton();
        cartPage.validateOnCartPage();
    }
}
