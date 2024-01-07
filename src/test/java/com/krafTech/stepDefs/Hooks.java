package com.krafTech.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before (order = 0)
    public void setUp(){
        System.out.println("BEFORE METHOD");
    }

    @After (order = 0)
    public void tearDown(){
        System.out.println("AFTER METHOD");
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
