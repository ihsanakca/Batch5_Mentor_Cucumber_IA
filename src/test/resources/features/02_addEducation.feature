Feature: Add Education Tests

  Background:
    Given The user is on the login page
    When The user enters credentials as "mgezer@gmail.com" and "Mg12345678"
    And The user should be able to verify success login with "Melih Gezer"


  Scenario: Check Add Education Form Labels
    When The user navigates to tab "Melih Gezer" and module "My Profile"
    Then The user verifies that the page "User Profile" displayed
    When The user navigates User Profile tabs with "Add Education"
    Then The user verifies that add education form is displayed
    And The user verifies that the form labels as follows
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      | To Date                 |
      | Program Description     |

  @wip
  Scenario: Check Add Education Form Labels_2
    When The user navigates to tab "Melih Gezer" and module "My Profile"
    Then The user verifies that the page "User Profile" displayed
    When The user navigates User Profile tabs with "Add Education"
    Then The user verifies that add education form is displayed
    And The user verifies that the form labels as follows with empty label
      | School or Bootcamp *    |
      | Degree or Certificate * |
      | Study                   |
      | From Date               |
      |                         |
      | To Date                 |
      | Program Description     |
