package com.krafTech.stepDefs;

import com.krafTech.pages.DashboardPage;
import com.krafTech.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DashboardStepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    @And("The user should be able to verify success login with {string}")
    public void theUserShouldBeAbleToVerifySuccessLoginWith(String expectedUserName) {
        dashboardPage.verifyUserName(expectedUserName);
    }

    @When("The user navigates to tab {string} and module {string}")
    public void the_user_navigates_to_tab_and_module(String tab, String module) {
       dashboardPage.navigateTabAndModule(tab, module);
    }
    @Then("The user should be able to verify success login with following user name")
    public void the_user_should_be_able_to_verify_success_login_with_following_user_name(Map<String ,String> userName) {
        dashboardPage.verifyUserName(userName.get("userName"));
    }

    @Then("The user verifies success login with {string} using excel file: {string}, {string} and {int}")
    public void the_user_verifies_success_login_with_using_excel_file_and(String userName, String path, String sheetName, Integer row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelData(path, sheetName);
        dashboardPage.verifyUserName(excelData.get(row).get(userName));
    }
}
