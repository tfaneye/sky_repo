@sky_search
Feature: This feature will make the search show the results that are determined by editorial, as well as generic searches.

  @wip4
  Scenario: User sees the editorial section in specific searches
    Given I am on the home page
    When I search "sky" in the search bar
    Then I should see an editorial section with below title
    |Title|
    |Sky Shop|
