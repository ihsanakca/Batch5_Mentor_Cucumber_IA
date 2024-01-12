@Regression
Feature: Login Functionality

#  user story = feature
#  test case = scenario
#  test step = Given, When, Then etc.

  @Melih
  Scenario: Login as Melih Gezer
    Given The user is on the login page
    When The user enters Melih's credentials
    Then The user should be able to login
    And The user should be able to verify success login with "Melih Gezer"

  @Login
  Scenario: Login as mike
    Given The user is on the login page
    When The user enters credentials as "mike@gmail.com" and "mike1234"
    Then The user should be able to login

  @Smoke
  Scenario: Login as Rosa
    Given The user is on the login page
    When The user enters credentials as "rosa@test.com" and "Test123456"
    Then The user should be able to login



  Scenario: Login with map
    Given The user is on the login page
    When The user logins with following credentials
      | email    | rosa@test.com |
      | password | Test123456    |
    Then The user should be able to verify success login with following user name
      | userName | Rosa |


  Scenario Outline:  Login test DDF
    Given The user is on the login page
    When The user enters credentials as "<email>" and "<password>"
    And The user should be able to verify success login with "<userName>"
    Examples:
      | email            | password   | userName    |
      | mike@gmail.com   | mike1234   | mike        |
      | rosa@test.com    | Test123456 | Rosa        |
      | mgezer@gmail.com | Mg12345678 | Melih Gezer |


  Scenario Outline: Login with map with DDF
    Given The user is on the login page
    When The user logins with following credentials
      | email    | <email>    |
      | password | <password> |
    Then The user should be able to verify success login with following user name
      | userName | <userName> |
    Examples:
      | email            | password   | userName    |
      | mike@gmail.com   | mike1234   | mike        |
      | rosa@test.com    | Test123456 | Rosa        |
      | mgezer@gmail.com | Mg12345678 | Melih Gezer |


  Scenario: Login with List
    Given The user is on the login page
    When The user logins and verifies with following credentials list
      | mgezer@gmail.com |
      | Mg12345678       |
      | Melih Gezer      |

  @wip
  Scenario Outline: Login with List with DDF
    Given The user is on the login page
    When The user logins and verifies with following credentials list
      | <email>    |
      | <password> |
      | <userName> |
    Examples:
      | email            | password   | userName    |
      | mike@gmail.com   | mike1234   | mike        |
      | rosa@test.com    | Test123456 | Rosa        |
      | mgezer@gmail.com | Mg12345678 | Melih Gezer |
