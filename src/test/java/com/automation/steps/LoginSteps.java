package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    LoginPage loginPage = new LoginPage();

    @Given("user open website")
    public void userOpenWebsite() {
        loginPage.openWebsite();
    }

    @Then("verify user enters valid credentials")
    public void verifyUserEntersValidCredentials() {
        loginPage.doLogin();
    }

}
