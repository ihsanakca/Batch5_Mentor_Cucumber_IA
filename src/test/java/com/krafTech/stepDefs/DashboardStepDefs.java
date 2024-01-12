package com.krafTech.stepDefs;

import com.krafTech.pages.DashboardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

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
}
