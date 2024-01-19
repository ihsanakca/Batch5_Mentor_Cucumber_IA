@Regression
Feature: Login Test with Excel File

  @wip
  Scenario Outline: Login Test with Excel
    Given The user is on the login page
    When The user logins with "Your Email" and "Password" using excel file: "<path>", "<sheetName>" and <rowNumber>
    Then The user verifies success login with "Your Name" using excel file: "<path>", "<sheetName>" and <rowNumber>
    Examples:
      | path                                | sheetName | rowNumber |
      | src/test/resources/LoginList.xlsx   | QaTeam1   | 1         |
      | src/test/resources/LoginList.xlsx   | QaTeam2   | 3         |
      | src/test/resources/LoginList.xlsx   | QaTeam3   | 5         |
      | src/test/resources/LoginList.xlsx   | QaTeam1   | 0         |
      | src/test/resources/LoginList.xlsx   | QaTeam1   | 4         |
      | src/test/resources/LoginList_2.xlsx | QaTeam2   | 7         |
      | src/test/resources/LoginList_2.xlsx | QaTeam3   | 2         |


    #Class Task
  # Excel dosyasındaki QATeam3 sheetindeki bilgileri kullanarak Add Education testi yapalım