package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage = new HomePage();

    @Then("verify user is on Home page")
    public void verifyUserIsOnHomePage() {
        homePage.verifyHomePage();
        
    }

    @When("user click on Add to cart button")
    public void userClickOnAddToCartButton() {
       homePage.addToCart();
    }

    @And("click on cart button")
    public void clickOnCartButton() {
        homePage.clickCartIcon();
    }
}
