package com.xpath;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Masstamilansongsdownload {
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumworkspace\\seleniumtest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://masstamilan.dev/");
		driver.findElement(By.partialLinkText("See all the latest Tamil movies")).click();
		int i=1;
		while(i>0) {
			if(i>13) {
				i=i-7;
				WebElement pgno = driver.findElement(By.xpath("(//nav)[2]//span["+i+"]"));
				pgno.click();
			}
			else {
				WebElement pgno = driver.findElement(By.xpath("(//nav)[2]//span["+i+"]"));
				pgno.click();
			}
		
//			String at = pgno.getAttribute("class");  
//			if(at.equalsIgnoreCase("page gap")) {
//				WebElement pgn = driver.findElement(By.xpath("(//nav)[2]//span["+(i-1)+"]"));
//				pgn.click();
//			}
			
//			Alert al = driver.switchTo().alert();
//			al.accept();
			Set<String> win = driver.getWindowHandles();
			List<String> wind =new ArrayList(win);
			String parent = wind.get(0);
			for (String string : wind) {
				if(!string.equalsIgnoreCase(parent)) {
					driver.switchTo().window(string);
					driver.close();
				}
			}
			driver.switchTo().window(parent);
			List<WebElement> movlin = driver.findElements(By.tagName("a"));
			int count=0;
			int found=0;
		
			for (WebElement webElement : movlin) {
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//				wait.until(ExpectedConditions.presenceOfElementLocated((By) webElement));
				String movie = webElement.getAttribute("title");
				if(movie.equalsIgnoreCase("Jai Bhim Songs Download")){
				webElement.click();
				driver.findElement(By.partialLinkText("128kbps ZIP")).click();
			
				++found;
				break;
			}
				else {
				count++;
			}
				}
			if(found!=0) {
				break;
				
			}
//			else if(count!=0) {
//				WebElement pgn = driver.findElement(By.xpath("(//nav)[2]//span["+(i+1)+"]"));
//				String att = pgn.getAttribute("class");
//				if(att.equalsIgnoreCase("page gap")) {
//					pgno.click();
//        		}
			i++;
			}
		
//			String pg = pgno.getAttribute("class");
//			if(pg.equalsIgnoreCase("page next")) {
//				
		}
		
		}


