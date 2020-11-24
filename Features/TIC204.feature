Feature: TIC204

  Scenario: Check if the user is able to perform a contact form with invalid input data
    Given I launch chrome browser3
    When I open loving herman homepage3
    When I Click Contact button
    When I Fill the input field Name with valid data3
    When I Fill the input field Email with valid data3
    When I Fill the input field Subject with valid data3
    When I Fill the input field Message with valid data3
    Then I Click Send button3
    Then I am redirected to home page3
    And I close web driver3
