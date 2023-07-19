Feature: AddProductToCart

  Scenario: Capture Product Details, Select Size, and Color
    Given user is on Home page
    When user scrolls down to view products under Hot Sellers
    And user hovers over the product name,selects a size and color for the product
    Then product is added to cart
