Feature: Search and place the order
  I want search for a particular product and place the order

    @SeleniumTest
    Scenario: Search for items and validate results
    Given User is on GreenKart landing page
    When User searches for vegetable "Cucumber"
    Then "Cucumber" results are displayed
    
    @SmokeTest
    Scenario Outline: Search for items and go to checkoutpage
    Given User is on GreenKart landing page
    When User searches for vegetables <vegetable>
    And Added "3" items to cart
    And User clicks on proceed to checkout page for purchase
    Then Verify selected products <vegetable> item is displayed in checkout page
    
    Examples:
    | vegetable  |
    | Beetroot   | 
    | Carrot		 | 
    
