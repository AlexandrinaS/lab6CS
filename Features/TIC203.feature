Feature: TI203

  Scenario: Check if social buttons are working

    Given I launch chrome browser7
    When I open loving herman homepage7
    When I click the facebook social button
    When I am redirected to link page
    Then I close web driver7