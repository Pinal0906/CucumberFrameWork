Feature: Validate Login Functionality
  Developer : Hrishi
  Tester : Pinal

  Scenario: Verify user is able to check out from cart page
    Given user open website
    Then verify user enters valid credentials
    Then verify user is on Home page
    When user click on Add to cart button
    And click on cart button
    Then verify user is on cart page
    When user click on checkout button
    Then Verify user on checkout page
    When user enters firstname
#    And user click on continue button
    Then verify user is on Overview page
    When user click on Finish button
    Then verify user is on complete page with success message