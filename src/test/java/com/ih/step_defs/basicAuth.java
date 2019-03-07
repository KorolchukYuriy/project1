package com.ih.step_defs;

import static org.junit.Assert.assertEquals;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import com.ih.pages.Authorization;
import com.ih.utils.ConfigurationReader;
import com.ih.utils.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class basicAuth {
	
	Authorization Authorization = new Authorization();
	
	
	@Given("that user is on main page")
	public void that_user_is_on_main_page() {
	   String url = ConfigurationReader.getProperty("url");
	   Driver.getDriver().get("http://admin:admin@the-internet.herokuapp.com/");
	}

	@When("user clicks on Basik Auth button")
	public void user_clicks_on_Basik_Auth_button() {
		
		Authorization.basicAuth.click();
	}

	@Then("user should should enter {string} and {string} and click ok")
	public void user_should_should_enter_and_and_click_ok(String string, String string2) throws AWTException, InterruptedException {
//			Robot robot = new Robot();
//			robot.keyPress(KeyEvent.VK_A);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_D);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_M);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_I);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_N);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_TAB);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_A);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_D);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_M);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_I);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_N);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_TAB);
//			Thread.sleep(250);
//			robot.keyPress(KeyEvent.VK_ENTER);
//			Thread.sleep(250);
		
		
			
			
	}

	@Then("user should be loged in")
	public void user_should_be_loged_in() throws InterruptedException {
		Thread.sleep(2000);
	   String logedIn = "Congratulations! You must have the proper credentials.";
	   assertEquals(Authorization.Congratulations.getText(),logedIn);
	}


}
