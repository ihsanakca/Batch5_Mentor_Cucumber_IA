@Regression
Feature: Add Education Tests

#  Background:
#    Given The user is on the login page
#    When The user enters credentials as "mgezer@gmail.com" and "Mg12345678"
#    And The user should be able to verify success login with "Melih Gezer"

@rerun
  Scenario: Check Add Education Form Labels
  Given The user is on the login page
  When The user enters credentials as "mgezer@gmail.com" and "Mg12345678"
  And The user should be able to verify success login with "Melih Gezer"
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

@rerun @check
  Scenario: Check Add Education Form Labels_2
  Given The user is on the login page
  When The user enters credentials as "mgezer@gmail.com" and "Mg12345678"
  And The user should be able to verify success login with "Melih Gezer"
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

  @zip
  Scenario Outline: Add Education Test With Excel File
    Given The user is on the login page
    When The user logins with "Your Email" and "Password" using excel file: "<path>", "<sheetName>" and <rowNumber>
    Then The user verifies success login with "Your Name" using excel file: "<path>", "<sheetName>" and <rowNumber>
    When The user navigates to tab "Your Name" and module "My Profile" using excel file: "<path>", "<sheetName>" and <rowNumber>
    Then The user verifies that the page "User Profile" displayed
    When The user navigates User Profile tabs with "Add Education"
    Then The user verifies that add education form is displayed
    When The user fills add education form with "school" and "degree" and "study" and "fromdate" and "ToDate" and "Program Desc" using excel file: "<path>", "<sheetName>" and <rowNumber>
    Then The user verifies that last added school with "school" using excel file: "<path>", "<sheetName>" and <rowNumber>
    Then The user deletes last added school record with "school" using excel file: "<path>", "<sheetName>" and <rowNumber>
    Examples:
      | path                                | sheetName | rowNumber |
      | src/test/resources/LoginList.xlsx   | QaTeam3   | 1         |
      | src/test/resources/LoginList.xlsx   | QaTeam3   | 3         |
      | src/test/resources/LoginList.xlsx   | QaTeam3   | 5         |
      | src/test/resources/LoginList.xlsx   | QaTeam3   | 0         |
      | src/test/resources/LoginList.xlsx   | QaTeam3   | 4         |
      | src/test/resources/LoginList_2.xlsx | QaTeam3   | 7         |
      | src/test/resources/LoginList_2.xlsx | QaTeam3   | 2         |
      | src/test/resources/LoginList_2.xlsx | QaTeam3   | 8         |