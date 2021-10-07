package com.myrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		plugin= {"pretty","json:target/cucumber.json" },		
		//plugin= {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
		//format ="",		
		features = {".//Fetatures/"}, 
        glue = {"com.stepdefinations"}, 	
		dryRun = false, 
		monochrome = true, 
		strict = false,
		tags = {"@Smoke"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

}