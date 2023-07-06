Feature: Test login functionality
I want to use this template for my feature file

 

Background:
    Given I open chrome browser
    When I visit the qa environment
    Then I should be on the login page


  Scenario: Login using valid credentials
    
    And I enter "batch08@codegator.us.basic" username
    And I enter "Welcome2" password
    When I click the login button
    Then I should see the home page
    #And it should fail 
    
    
  Scenario: Login using invalid credentials
    
    And I enter "wrong.us.basic" username
    And I enter "Welcome233" password
    When I click the login button
    Then I should see the home page