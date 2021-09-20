Feature: Search for book

  @P3
  Scenario: Book search Page
    Given I am on Registration Page
    When I click on Book Store
    Then I get navigate to book search page

  @p4
  Scenario: Search for any book
    Given I am at Book search page
    When I enter "Yogendra" in the search field
    Then I get the results
