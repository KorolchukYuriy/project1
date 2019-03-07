package com.ih.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ih.utils.Driver;

public class dropdown_pages {

	
public dropdown_pages() {
		
		PageFactory.initElements(Driver.getDriver(), this);
		}
	@FindBy(id = "dropdown")
	public WebElement dropdown;
}
