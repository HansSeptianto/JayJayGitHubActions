package com.hans.stepdef;

import com.hans.page.ApiPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ApiStepDef {
    ApiPage apiPage;

    @Given("prepare valid url for {string}")
    public void prepareValidUrlFor(String url) {
        apiPage = new ApiPage();
        apiPage.prepareURL(url);
    }

    @And("hit api get list users")
    public void hitApiGetListUsers() {
        apiPage.hitApiGetListUsers();
    }

    @Then("validation status code is equal to {int}")
    public void validationStatusCodeIsEqualTo(int status) {
        apiPage.validationStatusCodeIsEqualTo(status);
    }

    @Then("validation response body get list users")
    public void validationResponseBodyGetListUsers() {
        apiPage.validationResponseBodyGetListUsers();
    }

    @Then("validation response json with JSONSchema {string}")
    public void validationResponseJsonWithJSONSchema(String filename) {
        apiPage.validationResponseJsonWithJSONSchema(filename);
    }

    @And("hit api post create new user")
    public void hitApiPostCreateNewUser() {
        apiPage.hitApiPostCreateUsers();
    }

    @Then("validation response body post create new user")
    public void validationResponseBodyPostCreateNewUser() {
        apiPage.validationResponseBodyPostCreateUser();
    }

    @And("hit api delete user")
    public void hitApiDeleteUser() {
        apiPage.hitApiDeleteUser();
    }

    @And("hit api update user data")
    public void hitApiUpdateUserData() {
        apiPage.hitApiUpdateUser();
    }

    @Then("validation response body update user data")
    public void validationResponseBodyUpdateUserData() {
        apiPage.validationResponseBodyUpdateUser();
    }
}
