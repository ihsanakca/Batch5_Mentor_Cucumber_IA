package com.krafTech.stepDefs;

import com.krafTech.pages.UserProfilePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

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
}
