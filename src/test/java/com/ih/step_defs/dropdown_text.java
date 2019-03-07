package com.ih.step_defs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.ih.pages.download_pages;
import com.ih.pages.dropdown_pages;
import com.ih.utils.ConfigurationReader;
import com.ih.utils.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dropdown_text {
	dropdown_pages Dropdown = new dropdown_pages();
	
	@Given("user is on dropdown page")
	public void user_is_on_dropdown_page() {
		 String url1 = ConfigurationReader.getProperty("url1");
		   Driver.getDriver().get("http://the-internet.herokuapp.com/dropdown");
		   String actual = "The Internet";
		   Assert.assertEquals(actual,Driver.getDriver().getTitle());
		   System.out.println("Pass");
	}

	@When("user clicks dropdown box")
	public void user_clicks_dropdown_box() {
	    Dropdown.dropdown.click();
	    
	}

	@Then("user should select both options one by one and print text to console")
	public void user_should_select_first_option() {
		Select select = new Select(Dropdown.dropdown);
		List<WebElement> options =select.getOptions();
		for (int i = 0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
		
		
	    
	}



}
