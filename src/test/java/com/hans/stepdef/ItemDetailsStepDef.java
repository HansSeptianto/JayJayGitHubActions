package com.hans.stepdef;

import com.hans.BaseTest;
import com.hans.page.ItemDetailsPage;
import io.cucumber.java.en.Then;

public class ItemDetailsStepDef extends BaseTest {
    ItemDetailsPage itemDetailsPage;

    @Then("the user is on item details page")
    public void theUserIsOnItemDetailsPage() {
        itemDetailsPage = new ItemDetailsPage(driver);
        itemDetailsPage.validateOnItemDetailsPage();
    }
}
