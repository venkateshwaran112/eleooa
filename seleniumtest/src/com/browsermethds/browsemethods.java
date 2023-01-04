package com.browsermethds;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browsemethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",  "F:\\seleniumworkspace7am\\seleniumtest\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.selenium.dev/downloads/");
	    driver.manage().window().maximize();
	    
	}

}
