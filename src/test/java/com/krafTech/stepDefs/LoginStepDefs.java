package com.krafTech.stepDefs;

import com.krafTech.pages.LoginPage;
import com.krafTech.utilities.ConfigurationReader;
import com.krafTech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {

    LoginPage loginPage =new LoginPage();

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

}
