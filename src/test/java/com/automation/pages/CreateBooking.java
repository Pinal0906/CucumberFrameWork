package com.automation.pages;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateBooking {
    @Given("user wants to call {string} api call")
    public void userWantsToCallApiCall(String arg0) {
        
    }

    @And("user set Header {string} to {string}")
    public void userSetHeaderTo(String arg0, String arg1) {
    }

    @And("user set body from the file {string}")
    public void userSetBodyFromTheFile(String arg0) {
    }

    @When("user persorms post request")
    public void userPersormsPostRequest() {
    }

    @Then("Verify Status Code is {int}")
    public void verifyStatusCodeIs(int arg0) {
    }
}
