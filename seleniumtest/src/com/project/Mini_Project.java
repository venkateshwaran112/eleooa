package com.project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",  "F:\\seleniumworkspace7am\\seleniumtest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
			Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		WebElement first = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]"));
		first.sendKeys("Venkat");
		WebElement last = driver.findElement(By.xpath("//input[@name='lastname']"));
		last.sendKeys("M");
		WebElement mob = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mob.sendKeys("8838333764");
		WebElement pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pwd.sendKeys("venkatesh");
		WebElement day = driver.findElement(By.xpath("(//select[@aria-label='Day'])[1]"));
		Select s = new Select(day);
		s.selectByVisibleText("14");
		WebElement Month = driver.findElement(By.xpath("(//select[@aria-label='Month'])[1]"));
	    Select s1 = new Select(Month);
	    s1.selectByValue("2");
	    WebElement year = driver.findElement(By.xpath("(//select[@aria-label='Year'])[1]"));
		Select s11 = new Select(year);
		s11.selectByValue("1999");
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]")).click();
		Thread.sleep(3000);
		TakesScreenshot scr = (TakesScreenshot) driver;
		File gtscr = scr.getScreenshotAs(OutputType.FILE);
		File fi = new File("F:\\seleniumworkspace7am\\seleniumtest\\screen1.png");
	    FileHandler.copy(gtscr, fi);
		
	}

	
}
