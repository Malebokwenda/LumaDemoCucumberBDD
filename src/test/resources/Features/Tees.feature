Feature: Tees

  Scenario: Verify error message when size and color are not selected
    Given user is on Home page
    When user navigate to "Men" category
    And user select "Tops" subcategory
    And user choose "Tees" subcategory
    And user add a 3 stars product to the cart without selecting size and color
    Then user should see the error message "You need to choose options for your item."


  Scenario: Add Orange Miko Pullover Hoodie to Cart and Complete Order
    Given  user is on Home page
    When user search for "Orange Miko Pullover Hoodie"
    And user select any size from the available options
    And user add the hoodie to my cart
    And user proceed to checkout
    And user provide my details for completing the order
    Then user should see a confirmation message for the successful order