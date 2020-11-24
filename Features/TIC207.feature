
Feature: TIC207

  Scenario: Check if the user is not able to perform a registration with invalid input data
    Given I launch chrome browser2
    When I open loving herman homepage2
    And I click the button sign up2
    Then I check that A pop up form is displayed2
    When I Fill the input field Name with valid data2
    When I Fill the input field Email with invalid data
    When I Fill the input field Password with valid data2
    When I Fill the input field Confirm Password with valid data2
    Then I Click SIGN UP button2
    Then Alert message is displayed under the input field Email
    And I close web driver2
