Feature: TIC206

  Scenario: Check if the user is able to perform a registration with valid input data
    Given I launch chrome browser
    When I open loving herman homepage
    When I click the button sign up
    Then I check that A pop up form is displayed
    When I Fill the input field Name with valid data
    When I Fill the input field Email with valid data
    When I Fill the input field Password with valid data
    When I Fill the input field Confirm Password with valid data
    When I press the button sign up
    Then I am redirected to home page
    And I close web driver