package com.automation.steps;

import com.automation.pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOutSteps {
    CheckOutPage checkoutPage = new CheckOutPage();

    @Then("Verify user on checkout page")
    public void verifyUserOnCheckoutPage() {
    checkoutPage.UserIsOnCheckOutPage();
    }

    @When("user enters firstname")
    public void userEntersFirstname() {
        checkoutPage.UserAddDetails();
    }

}
