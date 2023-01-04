package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","F:\\seleniumworkspace7am\\seleniumtest\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("wonderwomen");
	Thread.sleep(5000);
	List<WebElement> goo = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
	int count=0;
	Thread.sleep(2000);
	for (WebElement sugg : goo) {
//		System.out.println(sugg.getText());
	count++;
		if(count==4) {
			sugg.click();
			break;
			
		}
		
		
	}	
}
}	
