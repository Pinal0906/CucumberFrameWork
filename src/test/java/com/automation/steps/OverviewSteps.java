package com.automation.steps;

import com.automation.pages.OverviewPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OverviewSteps {
    OverviewPage overview = new OverviewPage();

    @Then("verify user is on Overview page")
    public void verifyUserIsOnOverviewPage() {
        overview.UserIsOnOverViewPage();
    }

    @When("user click on Finish button")
    public void userClickOnFinishButton() {
        overview.UserClicksOnFinishBtn();
    }

    @Then("verify user is on complete page with success message")
    public void verifyUserIsOnCompletePageWithSuccessMessage() {
        overview.UserGetsSuccessMessage();
    }
}
