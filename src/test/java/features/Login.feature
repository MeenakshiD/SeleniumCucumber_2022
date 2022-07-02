Feature: Login


  Scenario: : Successful login with valid credentials

    Given user launch Chrome Browser
    When user opens URL "https://admin-demo.nopcommerce.com/login"
    And User enters email as "admin@yourstore.com" and Password as "admin"
    And Click on Login
    When User Clicks on Logout link
    And Close the browser