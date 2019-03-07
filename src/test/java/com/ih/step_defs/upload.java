package com.ih.step_defs;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.ih.pages.upload_pages;
import com.ih.utils.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class upload {
	
	@Given("user is on upload page")
	public void user_is_on_upload_page() {
		Driver.getDriver().get("http://the-internet.herokuapp.com/upload");
		
	    
	}

	@When("user clicks on browse button")
	public void user_clicks_on_browse_button() throws InterruptedException {
	    upload_pages upload = new upload_pages();
	    upload.browse.sendKeys("C:\\Users\\Yuriy Korolchuk\\Desktop\\interview\\the_Internet_Herokuapp\\src\\test\\resources\\test_file.txt");
	   
	    
	}

	@Then("user should be able to upload the file")
	public void user_should_be_able_to_upload_the_file() throws InterruptedException {
		 Driver.getDriver().findElement(By.id("file-submit")).click();
		    
		    Assert.assertTrue(Driver.getDriver().getPageSource().contains("File Uploaded!"));
		    System.out.println("pass");
	}

	

}
