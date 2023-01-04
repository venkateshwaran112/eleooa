package com.screenshot;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, java.io.IOException {
		
		System.setProperty("webdriver.chrome.driver",  "F:\\seleniumworkspace7am\\seleniumtest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://accounts.google.com/signin/v2/identifier?flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//		WebElement ca= driver.findElement(By.xpath("// input [contains(@name,'identifier')]"));
//		ca.sendKeys("venkateeelog@gmail.com");
//		WebElement ba= driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[1]"));
//		ba.click();
//		Thread.sleep(3000);
//		WebElement sc = driver.findElement(By.xpath("// input [contains(@name,'password')]"));
//		sc.sendKeys("venkiraj");
//		WebElement s = driver.findElement(By.xpath("(//div[@class='VfPpkd-RLmnJb'])[1]"));
//	    s.click();
		driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
		 WebElement mail = driver.findElement(By.id("email"));
		    mail.sendKeys("venkivasulog@gmail.com");
		    WebElement pwd= driver.findElement(By.name("pass"));
		    pwd.sendKeys("venkiraj");
			WebElement button = driver.findElement(By.name("login"));
			button.click();
			Thread.sleep(5000);
	  //  driver.get("http://www.greenstechnologies.in/");
		TakesScreenshot scr = (TakesScreenshot) driver;
		File gtscr = scr.getScreenshotAs(OutputType.FILE);
		File fi = new File("F:\\seleniumworkspace7am\\seleniumtest\\screen1.png");
	    FileHandler.copy(gtscr, fi);
        
		
}
}