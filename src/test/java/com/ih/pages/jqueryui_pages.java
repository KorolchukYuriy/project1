package com.ih.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ih.utils.Driver;

public class jqueryui_pages {

	public jqueryui_pages() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//div[@class=\"example\"]/h3")
	public WebElement jq;
	
	
	
}
