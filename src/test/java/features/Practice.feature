#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Practice Page
  I want to perform few operation present in the feature file like clicking on radio button, handling dynamic dropdowns, Static dropdowns, Checkboxes, 
  Handling windows, Alerts, tables and etc

	@Regression
  Scenario: Handling Radion buttons
    Given User is on Practice Landing Page
    When I click on "radio2"
    Then i validate that "radio2" is clicked and selected
    
    @Smoke
    Scenario Outline: Handling Dynamic dropdowns
    Given User is on Practice Landing Page
    When User enters <country> in the select countries text box
    Then User should be able to select <country>
    
    Examples:
    |country|
    |India|
    |Pakistan|
    |Saudi Arabia|
    |Oman|
    
    @Regression
    Scenario: Handling static dropdowns
    Given User is on Practice Landing Page
    When User selects "Option2" option

