Feature: AB Testing

@P123
Scenario: Clicking on A/B Testing

Given I am on Herokuapp
When I click on add/remove element
And I get navigate to add remove element page
Then I click on Add element button 
And I click on Delete button

@P124
Scenario: Normal Authentication

Given I am on Herokuapp
When I click on Basic Auth
And I get navigated to Basic Auth page
Then I enter "YashuSharma" in 1234 in the given field
And I click on Sign in button

@P125
Scenario: Broken Images

Given I am on Herokuapp 
When I click on broken images button
And I get navigated to br images page
Then I get to Broken and valid Images


