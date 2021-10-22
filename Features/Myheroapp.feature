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


 