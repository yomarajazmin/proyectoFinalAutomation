Feature: Create new account

  Scenario: As a user I want to create a new account so that I can access the application

    Given the page "http://todo.ly/" is open
    When I click on Sign Up Free
    Then I fill the name: test
    And I fill the email: random
    And I fill the password: test123
    And I fill the timezone: Atlantic Standard Time
    And I click on the terms&service checkbox
    And I click on Signup
    And I am able to see the work label