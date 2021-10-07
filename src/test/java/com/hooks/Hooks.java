package com.hooks;

import com.ny.basepage.SupperClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends SupperClass{
	
	@Before
	public static void setUP() {
		initialization();
	}
	
	
	@After
	public static void tearDown() {
		driver.quit();
	}

}
