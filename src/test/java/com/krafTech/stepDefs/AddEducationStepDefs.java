package com.krafTech.stepDefs;

import com.krafTech.pages.AddEducationPage;
import com.krafTech.utilities.BrowserUtils;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import java.util.List;
import java.util.Objects;

public class AddEducationStepDefs {
    AddEducationPage addEducationPage=new AddEducationPage();
    @Then("The user verifies that add education form is displayed")
    public void the_user_verifies_that_add_education_form_is_displayed() {
        BrowserUtils.waitForVisibility(addEducationPage.formLabels.get(0),10);
        Assert.assertTrue(addEducationPage.addEducationBtn.isDisplayed());
    }
    @Then("The user verifies that the form labels as follows")
    public void the_user_verifies_that_the_form_labels_as_follows(List<String> expectedLabels) {
        List<String> actualLabels = BrowserUtils.getElementsText(addEducationPage.formLabels);
        Assert.assertEquals(expectedLabels,actualLabels);
    }

    @And("The user verifies that the form labels as follows with empty label")
    public void theUserVerifiesThatTheFormLabelsAsFollowsWithEmptyLabel(List<String> expectedLabels) {
        List<String> actualLabels = BrowserUtils.getElementsText(addEducationPage.formLabelsWithEmptyLabel);
        Assert.assertEquals(expectedLabels,actualLabels);
    }
    @DataTableType
    public String nullToString(String cell) {
        return Objects.isNull(cell) ? StringUtils.EMPTY : cell;
    }
}
