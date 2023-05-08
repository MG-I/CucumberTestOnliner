package com.cucumber.testng.hooks;

import com.cucumber.testng.driver.DriverManager;
import org.testng.annotations.BeforeMethod;

public class DriverHooks {

    @BeforeMethod
    public void init() {
       DriverManager.initDriver();
    }
}
