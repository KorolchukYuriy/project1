package com.ih.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ih.utils.Driver;

public class download_pages {
	
	public download_pages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id="file-upload")
	public WebElement browse;
	
	

	
	
	
}
