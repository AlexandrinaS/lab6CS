Feature: TI178

  Scenario: Check if quick-viewing corresponds to selected product

    Given I launch chrome browser5
    When I open loving herman homepage5
    When I save the title of the selected product
    When I hover the image of the selected product from section New Arrival
    When I click the button Quick View
    When I am redirected to another page that presents selected product
    When I check the title of the selected product
    Then I close the browser5