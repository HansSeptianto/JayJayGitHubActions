@home
Feature: Home

  @valid-menu
  Scenario: Check valid menu on homepage
    Given user logged in
    And user is on homepage
    And user click menu button
    When user click About menu button
    Then user is on about page

  @valid-logout
  Scenario: Verify logout
    Given user logged in
    And user is on homepage
    And user click menu button
    When user click Logout menu button
    Then user is on login page

  @valid-add-item-to-cart
  Scenario: Adding an item to the cart
    Given user logged in
    And user is on homepage
    When user click the Add to cart button
    Then the item added to the cart

  @valid-item-details
  Scenario: Click item to see item details
    Given user logged in
    And user is on homepage
    When user click one of the items
    Then the user is on item details page