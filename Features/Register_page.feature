
Feature: User register page

@P2
Scenario: User registration page

Given I am on Demoqa registration page 

When I enter "Yogendra" in the "First Name" field
And I enter "Vashishtha" in the "Last Name" field
And I enter "Yogi" in the "UserName" field
And I enter "Basketball@1998" in the "Password" field
Then I click on Register