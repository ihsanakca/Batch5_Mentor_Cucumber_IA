package com.krafTech.pages;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class DashboardPage extends BasePage{

    @FindBy(tagName = "h2")
    public WebElement userName;

    public void verifyUserName(String expectedUserName){
        Assert.assertEquals(expectedUserName,userName.getText());
    }
}
