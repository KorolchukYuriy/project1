package com.ih.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	private static WebDriver driver = null;

	public static WebDriver getDriver() {

		if (driver == null) {
			String browser = ConfigurationReader.getProperty("browser");

			switch (browser) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
//			case "firefox":
//				WebDriverManager.firefoxdriver().setup();
//				driver = new FirefoxDriver();
			}
		}

		return driver;
	}

	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}

	}
}
