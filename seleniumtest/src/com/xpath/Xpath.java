package com.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",  "F:\\seleniumworkspace\\seleniumtest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.partialLinkText("Create an Account")).click();
//		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		WebElement ca= driver.findElement(By.xpath("// input [contains(@name,'identifier')]"));
//		ca.sendKeys("venkateeelog@gmail.com");
//		WebElement ba= driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]"));
//		ba.click();
//		WebElement sc = driver.findElement(By.xpath("// input [contains(@name,'password')]"));
//		sc.sendKeys("venkiraj");
//		WebElement s = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
//	    s.click();
		
	}

}
