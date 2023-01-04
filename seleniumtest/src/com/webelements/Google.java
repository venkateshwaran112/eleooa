package com.webelements;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\seleniumworkspace7am\\seleniumtest\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.google.com/");
	WebElement fi= driver.findElement(By.name("q"));
	fi.sendKeys("gold rate" +Keys.ENTER);
	List<WebElement> f = driver.findElements(By.tagName("a"));
	for (WebElement webElement : f) {
		String te = webElement.getText();
		if(te.contains("https://")) {
			System.out.println(te);
		}
	}
//	int i=1;
//	while(i>0) {
//	 WebElement fi = driver.findElement(By.xpath("(//li[@role='presentation'])["+i+"]"));
//	 String s=fi.getText();
//	 if(s.equalsIgnoreCase("gold rate in chennai")) {
//		 fi.click();
//		 break;
//	 }
//	 i++;
//	}
	}
}
//	for (WebElement webElement : fi) {
//	String s=webElement.getText();	
//	System.out.println(s);
////	if(s.equalsIgnoreCase("gold rate in chennai")) {
////		webElement.click();
////		break;
////	}
//	}
