package com.krafTech.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("The user is on the login page");
    }
    @When("The user enters Melih's credentials")
    public void the_user_enters_melih_s_credentials() {
        System.out.println("Enters valid credentials");
    }
    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("The user can login ");
    }
}
