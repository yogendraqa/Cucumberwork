Feature: A/B testing

@P133
Scenario: Dynamic content

Given I am on Herokuapp
When I click on Dynamic context button
Then I get navigated to Dynamic Content Page
And The new text and images are automated successfully

@P134
Scenario: File Download

Given I am on Herokuapp
When I click on file download
Then I click on a File and the File is downloaded successfully

@P135
Scenario: File Upload

Given I am on Herokuapp
When I click on file upload
Then I get navigated to File upload page
And I click on choose file, select a file from system and click on upload

@P136
Scenario: Dynamic control

Given I am on Herokuapp
When I click on Dynamic Control.
Then I click on Add and check box appears. 
Then I click on Remove.
And I click on enable add Name and click on disable.

@P137
Scenario: Entry ad

Given I am Herokuapp
When I click oon Entry ad
Then I get navigated to entry ad page and close the entry ad if visible

@P138
Scenario: Frames

Given I am on Herokuapp
When I click on Frames
Then I get navigated to Frame page
Then I click on Nested frames
And Nested frames is automated successfully
Then I click on iFrames
And iFrames is automated successfully

@P139
Scenario: Hovers

Given I am on Herokuapp
When I click on Hovers
Then I get Navigated to Hover page
And I hover on User2 and click on view profile

@P199
Scenario: Key press

Given I am on Herokuapp
When I click on Key Presses
Then I get navigated to Key press page
And I input multiple keys and can see what i inputted


 