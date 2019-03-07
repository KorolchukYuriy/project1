package com.ih.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ih.utils.Driver;

public class Authorization {
	
		public Authorization() {
			PageFactory.initElements(Driver.getDriver(),this);
		}
		
		@FindBy(xpath = "//a[text()='Basic Auth']")
		public WebElement basicAuth;
		
		@FindBy(xpath = "//div[@class = 'example']/p")
		public WebElement Congratulations;

}
