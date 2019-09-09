Feature: DLG Registration test

  Scenario: AS a user I want to check if I my vehicle details is displayed when  I enter a valid registration number
    Given I am on the HomePage
    And I validate my HomePage title
   When I enter my valid registration number
   And I click on the Find vehicle input box
    Then I should see  a result of my registration details
    
    
 Scenario: To test that a user should get an error message when  invalid data is inputed
    Given I am on the HomePage
    And I validate my HomePage title
    And I enter Invalid data in the enter reg input text box
    When I click on the Find vehicle input box
    Then I should see an Error message displayed
   