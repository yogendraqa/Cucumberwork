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
Then I enter "admin" and "admin" in the given field
And I click on Sign in button

@P125
Scenario: Broken Images

Given I am on Herokuapp 
When I click on broken images button
And I get navigated to br images page
Then I get to Broken and valid Images

@P126
Scenario: Check boxes

Given I am on Herokuapp
When I click on Checkboxes
Then I get navigated to checkbox page
And I click on checkbox1 and checkbox2 and again on checkbox1

@P127
Scenario: Challenging DOM

Given I am on Herokuapp
When I click on Challenging DOM
Then I get navigated to Challenging dom page
And I click on Blue button and Red button and green button

@P128
Scenario: Context menu

Given I am on Herkuapp
When I click on context menu button 
Then I get navigated to Context menu page
And I right click on the box and Ok on the javascript alert

@P129
Scenario: Digest authentication

Given I am on Herokuapp
When I click in digest auth
Then I get navigated to digest auth page
And I enter "admin" and "admin" in the given fields

@P130
Scenario: Disappearing Elements

Given I am on Herokuapp
When I click on Disappearing elements
Then I get navigated to disappearing elements
And If Gallery button is present then click else print not found.

@P131
Scenario: Drag and Drop

Given I am on Herokuapp
When I click on Drag and Drop button
Then I get navigated to drag and drop page
And I drag A context to context B 

