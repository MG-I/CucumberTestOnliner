@smoke
Feature: CartOnliner.feature
  As an user
  I want added product on cart
  So than I can place an order for this product

  Scenario Outline: Cart contains product selected
    Given the user opens Onliner website
    When the user clicks on the search field
    And the user adds "<product>" on the search field
    And the user clicks on the "<product>" in list
    And the user clicks Cart button
    And the user clicks Cart icon on header page
    Then page Cart is opened
    And  page Cart contains product with "<product>"
    Examples:
      | product |
      | самокат |