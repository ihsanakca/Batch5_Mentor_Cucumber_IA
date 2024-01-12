package com.krafTech.stepDefs;

import com.krafTech.pages.DashboardPage;
import com.krafTech.pages.LoginPage;
import com.krafTech.utilities.BrowserUtils;
import com.krafTech.utilities.ConfigurationReader;
import com.krafTech.utilities.Driver;
import com.krafTech.utilities.ExcelUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class LoginStepDefs {

    LoginPage loginPage =new LoginPage();
    DashboardPage dashboardPage=new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        //System.out.println("The user is on the login page");
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @When("The user enters Melih's credentials")
    public void the_user_enters_melih_s_credentials() {
     //   System.out.println("Enters Melih credentials");
        loginPage.login();
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
       // System.out.println("The user can login ");
        String actualUrl = Driver.get().getCurrentUrl();
        String expectedUrl= "https://www.krafttechexlab.com/index";
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @When("The user enters credentials as {string} and {string}")
    public void the_user_enters_credentials_as_and(String email, String password) {
        loginPage.login(email, password);
    }

    @When("The user logins with following credentials")
    public void the_user_logins_with_following_credentials(Map<String ,String> credentials) {
        loginPage.login(credentials.get("email"), credentials.get("password"));
    }


    @When("The user logins and verifies with following credentials list")
    public void theUserLoginsAndVerifiesWithFollowingCredentialsList(List<String > credentials) {
        loginPage.login(credentials.get(0),credentials.get(1));
        dashboardPage.verifyUserName(credentials.get(2));
    }

    @When("The user logins with {string} and {string} using excel file: {string}, {string} and {int}")
    public void the_user_logins_with_and_using_excel_file_and(String email, String password, String path, String sheetName, int row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelData(path, sheetName);
        loginPage.login(excelData.get(row).get(email),excelData.get(row).get(password));
    }

}
