Feature: Verify Create Booking API Call

  @api
  Scenario: Verify User Can Create New Booking
    Given user wants to call "/booking" api call
    And user set Header "Content-Type" to "application/json"
    And user set body from the file "create_booking.json"
    When user performs post request
    Then Verify Status Code is 200

@api
    Scenario: Verify user can fetch the list of booking
      Given user wants to call "/booking" api call
      And user set Header "Accept" to "application/json"
      When user performs get request
      Then Verify Status Code is 200

  @api
      Scenario: Verify user can create token
        Given user wants to call "/auth" api call
        And user set Header "Content-Type" to "application/json"
        And user set body from the file "Create_Token.json"
        When user performs post request
        Then Verify Status Code is 200
        And verify response body field "token" is not empty

  @api
  Scenario: Verify user can fetch the exact booking id //from > https://restful-booker.herokuapp.com/booking/:id
    Given user wants to call "/booking" api call
    And user set Header "Accept" to "application/json"
    When user performs get request
    Then Verify Status Code is 200

