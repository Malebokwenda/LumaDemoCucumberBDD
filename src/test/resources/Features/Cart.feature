Feature: AddProductToCart

  Scenario: Capture Product Details, Select Size, and Color
    Given user is on Home page
    When user scrolls down to view the products under Hot Sellers
    And user hovers over the "(product name)" product
    And user capture the product details
    And user selects a size for the product
    And user selects a color for the product
    Then the product details, size, and color should be captured successfully
