package com.krafTech.pages;

import com.krafTech.utilities.BrowserUtils;
import com.krafTech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends BasePage{

    @FindBy(css = ".breadcrumb-item:nth-of-type(2)")
    public WebElement userProfilePageTitle;


    public void navigateUserProfileTabs(String tabName){
        Driver.get().findElement(By.xpath("//button[text()='"+tabName+"'][./parent::li]")).click();
    }

    public String addedLastEducationRecordName(String schoolName){
        return Driver.get().findElement(By.xpath("(//span[text()='"+schoolName+"'])[last()]")).getText();
    }

    public void deleteLastAddedEducationRecord(String schoolName){

        WebElement deleteBtn =
                Driver.get().findElement(By.xpath("(//span[text()='"+schoolName+"'])[last()]/ancestor::tr//a"));

        BrowserUtils.scrollToElement(deleteBtn);
        BrowserUtils.clickWithJS(deleteBtn);

        System.out.println(Driver.get().switchTo().alert().getText());
        Driver.get().switchTo().alert().accept();

    }

    public String addedLastExperienceRecordName(String jobTitle){

        return Driver.get().findElement(By.xpath("(//span[text()='"+jobTitle+"'])[last()]")).getText();

    }

    public void deleteLastAddedExperienceRecord(String jobTitle){

        WebElement deleteBtn =
                Driver.get().findElement(By.xpath("(//span[text()='"+jobTitle+"'])[last()]/ancestor::tr//a"));

        BrowserUtils.scrollToElement(deleteBtn);
        BrowserUtils.clickWithJS(deleteBtn);

        Driver.get().switchTo().alert().accept();
    }

}
