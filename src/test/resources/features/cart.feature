Feature: Validate Order Functionality
  Developer : Hrishi
  Tester : Pinal

  Scenario: Verify user is able to order product from cart page
    Given user open website
    Then verify user enters valid credentials
    Then verify user is on Home page
    When user click on Add to cart button
    And click on cart button
    Then verify user is on cart page
    And verify added product is same
    When user click on checkout button
    Then Verify user on checkout page
