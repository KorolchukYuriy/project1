package com.ih.step_defs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;

import com.ih.utils.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class download1 {
	@Given("the user is on download page")
	public void the_user_is_on_download_page() throws InterruptedException, IOException {
	   Driver.getDriver().get("http://the-internet.herokuapp.com/download");
	   
	   
	  
	}
	

	@When("user clicks on selected file and file will be downloaded")
	public void user_clicks_on_selected_file() throws IOException {
		String fileOne= Driver.getDriver().findElement(By.linkText("not_empty.txt")).getText();
		   System.out.println(fileOne);
		   Driver.getDriver().findElement(By.linkText("not_empty.txt")).click();
		   File file = new File("C:\\Users\\Yuriy Korolchuk\\Downloads\\"+fileOne);
		   BufferedReader br = new BufferedReader(new FileReader(file));
		   
		   String str;
		   while((str=br.readLine())!=null)
			   System.out.println(str);
	}

	

}
