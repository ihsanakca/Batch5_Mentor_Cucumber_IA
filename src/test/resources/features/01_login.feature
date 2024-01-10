@Regression
Feature: Login Functionality

#  user story = feature
#  test case = scenario
#  test step = Given, When, Then etc.

  @Melih @Login @Smoke
  Scenario: Login as Melih Gezer
    Given The user is on the login page
    When The user enters Melih's credentials
    Then The user should be able to login

  Scenario: Login as mike
    Given The user is on the login page
    When The user enters credentials as "mike@gmail.com" and "mike1234"
    Then The user should be able to login
  @wip
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters credentials as "rosa@test.com" and "Test123456"
    Then The user should be able to login

