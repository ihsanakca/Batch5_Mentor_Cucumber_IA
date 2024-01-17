package com.krafTech.stepDefs;

import com.krafTech.pages.UserProfilePage;
import com.krafTech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class UserProfileStepDefs {

    UserProfilePage userProfilePage=new UserProfilePage();
    @Then("The user verifies that the page {string} displayed")
    public void the_user_verifies_that_the_page_displayed(String expectedPageTitle) {
        String actualTitle = userProfilePage.userProfilePageTitle.getText();
        Assert.assertEquals(expectedPageTitle,actualTitle);
    }
    @When("The user navigates User Profile tabs with {string}")
    public void the_user_navigates_user_profile_tabs_with(String tabName) {
        userProfilePage.navigateUserProfileTabs(tabName);
    }

    @Then("The user verifies that last added school with {string} using excel file: {string}, {string} and {int}")
    public void the_user_verifies_that_last_added_school_with_using_excel_file_and(String schoolName, String path, String sheetName, Integer row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelData(path, sheetName);
        String expectedSchool = excelData.get(row).get(schoolName);
        String actualSchool = userProfilePage.addedLastEducationRecordName(expectedSchool);
        Assert.assertEquals(expectedSchool,actualSchool);
    }
    @Then("The user deletes last added school record with {string} using excel file: {string}, {string} and {int}")
    public void the_user_deletes_last_added_school_record_with_using_excel_file_and(String schoolName, String path, String sheetName, Integer row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelData(path, sheetName);
        String school = excelData.get(row).get(schoolName);
        userProfilePage.deleteLastAddedEducationRecord(school);
    }
}
