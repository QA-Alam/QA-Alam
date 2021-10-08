package com.hooks;

import com.ny.basepage.SupperClass;
import com.utility.CommonUtil;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends SupperClass{
	
	public Scenario scenario;

	@Before
	public void suiteSetup(Scenario scenario) {
		this.scenario = scenario;
		initialization();
		logger.info("");
		logger.info("...........START AUTOMATION.............");
		logger.info("");
	}

	@After
	public void afterClosed(Scenario scenario) {
		if (scenario.isFailed()) {
			CommonUtil.getScreenshot(driver, scenario);
		}
		driver.close();
		driver.quit();
		logger.info("");
		logger.info("...........END AUTOMATION.............");
		logger.info("");
	}

}
