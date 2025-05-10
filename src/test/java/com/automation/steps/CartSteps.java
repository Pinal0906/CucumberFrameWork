package com.automation.steps;

import com.automation.pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartSteps {
    CartPage cartPage = new CartPage();

    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {
        cartPage.verifyUserIsOnCartPage();
    }

    @And("verify added product is same")
    public void verifyAddedProductIsSame() {
        cartPage.verifyProductDetail();
    }

    @When("user click on checkout button")
    public void userClickOnCheckoutButton() {
        cartPage.verifyUserClicksOnCheckOutBtn();
    }

}
