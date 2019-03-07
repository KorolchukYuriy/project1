package com.ih.runners;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class) 
@CucumberOptions(
		//tags= "@temp",
		features = "src/test/resources/features",
		glue = "com/ih/step_defs",
		dryRun = false,
		plugin = {
				
				"pretty",
				"json:target/cucumber.json",
				"html:target/default-cucumber-reports"
				
		}
		
		)

public class CuckesRunner {

}
