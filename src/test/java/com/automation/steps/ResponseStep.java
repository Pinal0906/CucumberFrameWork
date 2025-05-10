package com.automation.steps;

import com.automation.utils.RestAssuredUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ResponseStep {
    @Then("Verify Status Code is {int}")
    public void verifyStatusCodeIs(int expectedStatusCode) {
        Assert.assertEquals((long)expectedStatusCode, (long)RestAssuredUtils.getStatusCode());

    }

    @And("verify response body field {string} is not empty")
    public void verifyResponseBodyFieldIsNotEmpty(String fieldName) {
        String fieldValue = RestAssuredUtils.getResponseField(fieldName);
        Assert.assertFalse(fieldValue.isEmpty());
    }
}
