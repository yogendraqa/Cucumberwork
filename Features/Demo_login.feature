
Feature: Demoqa login scenarios

@P1
Scenario: Login search button

Given I am on Demoqa login page
When I click on NewUser
Then I get navigate to Registeration Page 

@P2
Scenario: User registration page 

Given I am on Demoqa registration page
When I enter "Yogendra" and "Vashishtha" and "yogi" and "yogi1998" field
Then I click on Register


