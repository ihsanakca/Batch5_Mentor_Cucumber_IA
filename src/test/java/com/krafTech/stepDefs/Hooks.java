package com.krafTech.stepDefs;

import com.krafTech.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;

import java.time.Duration;

public class Hooks {

    @Before (order = 0)
    public void setUp(){
        Driver.get().manage().window().setPosition(new Point(-1000,0));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After (order = 0)
    public void tearDown(Scenario scenario){
        if (scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }
       Driver.closeDriver();
    }

    @Before (value = "@Rosa", order = 1)
    public void setUpRosa(){
        System.out.println("BEFORE ROSA");
    }

    @After (value = "@Rosa" , order = 1)
    public void tearDownRosa(){
        System.out.println("AFTER ROSA");
    }
}
