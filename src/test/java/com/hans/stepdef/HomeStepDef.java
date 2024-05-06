package com.hans.stepdef;

import com.hans.BaseTest;
import com.hans.page.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef extends BaseTest {
    HomePage homePage;

    @Then("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

    @And("user click menu button")
    public void userClickMenuButton() {
        homePage.clickMenuButton();
    }

    @When("user click About menu button")
    public void userClickAboutMenuButton() {
        homePage.clickAboutMenuButton();
    }

    @Then("user is on about page")
    public void userIsOnAboutPage() {
        homePage.validateOnAboutPage();
    }

    @When("user click Logout menu button")
    public void userClickLogoutMenuButton() {
        homePage.clickLogoutButton();
    }

    @When("user click the Add to cart button")
    public void userClickTheAddToCartButton() {
        homePage.clickTheAddToCartButton();
    }

    @When("user click one of the items")
    public void userClickOneOfTheItems() {
        homePage.clickOneOfTheItems();
    }

}
