Feature: Register
  As an end user
  I want to Regsiter
  so that i can log in to the site

  Scenario: In Valid Register
    Given i am on homepage
    When i navigate to "Create Account/Sign In"
    And I enter user email address
    And i fill the user detail
      | Title | First name | Last name | Password |
      | Mr    | aries      | black     |          |
    Then i should see a empty field message "The password field cannot be empty"