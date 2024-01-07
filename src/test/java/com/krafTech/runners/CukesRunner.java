package com.krafTech.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com/krafTech/stepDefs",
        dryRun = false,
        tags = "@Regression"

)
public class CukesRunner {
}
