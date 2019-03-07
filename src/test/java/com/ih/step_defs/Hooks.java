package com.ih.step_defs;

import java.util.concurrent.TimeUnit;

import com.ih.utils.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void setUp() {
		// we put a logic that should apply to every scenario
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown() {
		
	Driver.closeDriver();
	}
	

}
