    Feature: Sign up to application
    
    @RegTest
    Scenario Outline: Title of your scenario
    Given I want to write a step with precondition
    And some other precondition
    When I complete action with username <username> and password <password>
    And some other action
    And yet another action
    Then I validate the outcomes
    And validation is "successfull"
    
    Examples:
    | username | password |
    | suhail   | 1234			|
    | sana		 | 2134			|
    | minni	   | 4321	    |