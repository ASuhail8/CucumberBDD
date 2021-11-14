
Feature: Application login
  I want to use this template for my feature file
 
  
    @RegTest
    Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action with username "suhail" password "1234"
    And some other action
    And yet another action
    Then I validate the outcomes
    And validation is "successfull"
    
    @Smoke
    Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action with username "sana" password "3241"
    And some other action
    And yet another action
    Then I validate the outcomes
    And validation is "not successfull"
		
		@Smoke
    Scenario: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action of sign up with following details
    | suhail | 1234 | abc@abc.com | india | 819728 |
    And some other action
    And yet another action
    Then I validate the outcomes
    And validation is "successfull"
   