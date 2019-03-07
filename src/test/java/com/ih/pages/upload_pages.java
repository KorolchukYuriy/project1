package com.ih.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ih.utils.Driver;

public class upload_pages {
	
	public upload_pages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="file-upload")
	public WebElement browse;
	

}
