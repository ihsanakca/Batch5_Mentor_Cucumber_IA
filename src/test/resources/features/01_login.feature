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

  @Rosa @Login
  Scenario: Login as Rose
    Given The user is on the login page
    When The user enters Rosa's credentials
    Then The user should be able to login

  @Mike @Login
  Scenario: Login as Mike
    Given The user is on the login page
    When The user enters Mike's credentials
    Then The user should be able to login