Feature: Validate Login Functionality
  Developer : Hrishi
  Tester : Pinal

  Scenario: Verify user can login with valid credentials
    Given user open website
    Then verify user enters valid credentials
    Then verify user is on Home page

      #here we are writing scenario outline and it should have Example added, it is use to remove duplication of steps, meaning if we have set of wrong pwd list then we can mention it as mentioned below
