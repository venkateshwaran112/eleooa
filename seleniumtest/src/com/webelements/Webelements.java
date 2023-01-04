package com.webelements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelements {

	public static void main(String[] args) {

//	    WebDriver driver = new ChromeDriver();
//	    driver.get("https://www.facebook.com/");
//	    driver.manage().window().maximize();
//	    WebElement mail = driver.findElement(By.id("email"));
//	    mail.sendKeys("vvmr1992@gmail.com");
//	    WebElement pwd= driver.findElement(By.name("pass"));
//	    pwd.sendKeys("venkiraj");
//		WebElement button = driver.findElement(By.name("login"));
//		button.click();
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumworkspace7am\\seleniumtest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mui.com/material-ui/react-table/");
		for(int i=1;i<=5;i++) {
		 WebElement head = driver.findElement(By.xpath("(//table)[1]//tr//th["+i+"]"));
		System.out.print(head.getText()+"  ");
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			WebElement ro = driver.findElement(By.xpath("(//table)[1]//tbody//tr["+i+"]"));
			System.out.println(ro.getText());
		
		}
//		List<WebElement> fi = driver.findElements(By.xpath("//*[@id=\'demo-33a3lyn1z9c\']/div/table//tr"));i
//		List<WebElement> fi = driver.findElements(By.xpath(("(//table[contains(@class,'MuiTable-root css')])[1]//tr")));
//		int rows = fi.size();
//		System.out.println(rows);
//		
////		(//tr//th)[1]//following-sibling::th
//				
//		List<WebElement> co=driver.findElements(By.xpath("(//tr)[1]//child::th"));
//		int columns=fi.size();
//		System.out.println(columns);
//		List<WebElement>cho= driver.findElements(By.xpath("(//tbody)[1]//tr//th"));
//		int choo=cho.size();
//		for (WebElement webElement : cho) {
//		       String te = webElement.getText();
//		       if(te.equalsIgnoreCase("cupcake")) {
//		    	   System.out.println(te);
//		       }
//			
//		}
			
		}
			
		//th[contains(@class,'MuiTableCell-root MuiTableCell-head MuiTableCell-sizeMedium css')]
//		String windowHandle = driver.getWindowHandle();
//		System.out.println(windowHandle);
	}
		
		
		
	
		
	


