package com.ih.step_defs;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ih.pages.jqueryui_pages;
import com.ih.utils.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class jquery {
	
	@Given("user is on jquery page")
	public void user_is_on_jquery_page() {
		Driver.getDriver().get("http://the-internet.herokuapp.com/jqueryui");
		jqueryui_pages jp = new jqueryui_pages();
		String expected = "JQuery UI";
		String actual = jp.jq.getText();
		
		//Assert.assertEquals(actual,expected);
		//System.out.println("Pass");
		
		
	}

	@Then("user clicks on all files one by one and downloads them")
	public void user_clicks_on_all_files_one_by_one() throws InterruptedException {
		Driver.getDriver().findElement(By.linkText("Menu")).click();
		Thread.sleep(1000);
		WebElement elem = Driver.getDriver().findElement(By.id("ui-id-2"));
		WebElement elem2 = Driver.getDriver().findElement(By.id("ui-id-4"));
		
		//Thread.sleep(1000);
		Actions action = new Actions(Driver.getDriver());
		action.moveToElement(elem).build().perform();
		
		Thread.sleep(1000);
		action.moveToElement(elem2).build().perform();
		List<WebElement> list = Driver.getDriver()
				.findElements(By.xpath("(//ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all'])[4]/li"));
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);

		JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

		int count = 5;

		for (int i = 0; i < list.size(); i++) {
			count++;
			wait.until(ExpectedConditions.elementToBeClickable(list.get(i)));

			js.executeScript("document.getElementById('ui-id-" + count + "').click()");
			

			try {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
			} catch (AWTException e) {

				e.printStackTrace();
			}
			

		}

	}
	}

	



