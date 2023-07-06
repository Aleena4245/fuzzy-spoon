Feature: Enter the account Name
I want to use this template for my feature file

 

Background:
    Given I open chrome browser
    When I visit the qa environment
    Then I should be on the login page


  Scenario: Entering the account name
    
    And I enter "batch08@codegator.us.basic" username
    And I enter "Welcome2" password
    When I click the login button
    Then I should see the home page
    And I click the accounts tab
    Then I click the new button
    And I click on the account name and type "Adam"