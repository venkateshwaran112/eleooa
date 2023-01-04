package com.xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {
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
			
		}}
	List<WebElement> elements = driver.findElements(By.tagName("a"));
	for (WebElement webElement : elements) {
		String att = webElement.getAttribute("href");
		System.out.println(att);
		Thread.sleep(4000);
//		driver.findElement(By.linkText("//span[text()='Next']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)","");
		Thread.sleep(3000);
		List<WebElement> fi= driver.findElements(By.xpath("//a[@aria-label='Page 2']//following::a"));
		for (WebElement web : elements) {
			String at = web.getAttribute("aria-label");
		 if(at.equals("Page 4")){
			 Thread.sleep(4000);
			 web.click();
			
		 }
		}
		
	}
	

}
}
