package com.krafTech.stepDefs;

import com.krafTech.pages.AddEducationPage;
import com.krafTech.utilities.BrowserUtils;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;

import java.util.List;
import java.util.Map;
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

    @When("The user fills add education form with {string} and {string} and {string} and {string} and {string} and {string} using excel file: {string}, {string} and {int}")
    public void the_user_fills_add_education_form_with_and_and_and_and_and_using_excel_file_and(String school, String degree, String study, String fromDate, String toDate, String description, String path, String sheetName, Integer row) {
        List<Map<String, String>> excelData = BrowserUtils.getExcelData(path, sheetName);
        String School = excelData.get(row).get(school);
        String Degree = excelData.get(row).get(degree);
        String Study = excelData.get(row).get(study);
        String FromDate = excelData.get(row).get(fromDate);
        String ToDate = excelData.get(row).get(toDate);
        String Description = excelData.get(row).get(description);

        addEducationPage.fillingAddEducationForm(School,Study,Degree,FromDate,ToDate,Description);

    }
}
