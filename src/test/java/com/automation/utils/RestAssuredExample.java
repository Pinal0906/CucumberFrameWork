package com.automation.utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.openqa.selenium.devtools.v85.fetch.model.AuthChallengeResponse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RestAssuredExample {
    public static void main(String[] args) throws FileNotFoundException {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RequestSpecification requestSpecification = RestAssured.given();

/*    -- get method of POSTMAN

     Response response = requestSpecification.log().all().get("/ping");
        response.then().log().all(); // this will give you a response log of all, so we can see wat is happening in console
        System.out.println(response.getStatusCode());
        */

        // post method, we create one "Data" directory under resuorces for body of Post method

        // Given

        requestSpecification.header("Content-Type","application/json"); // header of postman

        String body = new Scanner(new FileInputStream("src/test/resources/Data/create_booking.json")).
                useDelimiter("\\Z").next();
        requestSpecification.body(body); // body of postman

        //When
        Response response = requestSpecification.when().log().all().get("/booking");
        response.then().log().all();
        System.out.println(response.getStatusCode());
    }
}
