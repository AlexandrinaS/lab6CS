Feature: TIC205

  Scenario: Check if the user is able to perform a contact form with valid input data
    Given I launch chrome browser4
    When I open loving herman homepage4
    When I Click Contact button2
    When I Fill the input field Name with valid data4
    When I Fill the input field Email with invalid data4
    When I Fill the input field Subject with valid data4
    When I Fill the input field Message with valid data4
    Then I Click Send button4
  Then Alert message is displayed under the input field Email2
    Then I am redirected to home page4
    And I close web driver4
