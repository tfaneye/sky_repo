@sky_shop
Feature: This feature will make sure that the shop page is navigable and usable.

  @wip1
  Scenario: User navigates to shop page
    Given I am on the home page
    When I navigate to Deals page
    Then the user should be on the deal page
    |DealPage|
    |https://www.sky.com/deals|

    @wip2
  Scenario: User sees tiles on the shop page
    Given I am on the home page
    When I try to sign in with invalid credentials "name@sky.com", "password"
    Then I should see a text saying the error message
    |Message|
    |Sorry, we did not recognise either your username or password|


      @wip3
  Scenario: User sees a list of deals on the deals page
    Given I am on the home page
    When I navigate to Deals page
    Then I see a list of deals with a price to it
    |DealOnePrice|DealTwoPrice|DealThreePrice|
    |£25         |£41         |£36           |


