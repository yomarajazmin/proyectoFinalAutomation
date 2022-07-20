Feature: Update password

  Scenario: As a user I want to update my password so that I can access the application with new credentials

    Given the page "http://todo.ly/" is open
    When I create a new user
    Then I go to Settings
    And I fill the new password: test1234
    And I click on OK button
    And I logout
    And I login with the new credentials
    And I am able to see the logout label