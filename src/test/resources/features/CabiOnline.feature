Feature: Test Cabionline smoke scenario

  @cabi
  Scenario: Test login with valid credentials
    Given Open chrome and start application
    When I click on confirm region
    Then user should be able to Click on Shop BY item link
    Then user click on quick view
    Then user able to select size cloth
    Then user clicks on Add to cart button
    Then check cart
    Then checkout from cart
    Then quit browser