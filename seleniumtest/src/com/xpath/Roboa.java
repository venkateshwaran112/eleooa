package com.xpath;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Roboa {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumworkspace\\seleniumtest\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.mepcoeng.ac.in/");
		
	
		WebElement fi = driver.findElement(By.xpath("//a[@data-toggle='dropdown']"));
		WebElement f = driver.findElement(By.xpath("((//ul[@class='multi-column-dropdown'])[1]//li)[1]//a"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(fi).click().perform();
		ac.moveToElement(f).click().perform();
		ac.sendKeys(f, Keys.DOWN).perform();
		ac.sendKeys(f, Keys.ENTER).perform();

//		Robot ne = new Robot();
//		ne.keyPress(KeyEvent.VK_DOWN);
//		ne.keyRelease(KeyEvent.VK_DOWN);
//		ne.mousePress(InputEvent.BUTTON3_DOWN_MASK);
//		ne.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
		
//		Thread.sleep(2000);
//		ne.keyPress(KeyEvent.VK_ENTER);
//		ne.keyRelease(KeyEvent.VK_ENTER);
//	
		
//		ac.moveToElement(f).click().perform();
//		ac.sendKeys(f, Keys.DOWN).perform();
//		ac.sendKeys(f, Keys.ENTER).perform();
//		List<WebElement> fin = driver.findElements(By.xpath("//a[@class='hvr-sweep-to-right']"));
//		int i=1;
//		 
//			for (WebElement we : fin) {
//				String te = we.getText();
//			    System.out.println(te);
//			}
//		
		
//		
//		Robot ne = new Robot();
//		ne.keyPress(KeyEvent.VK_);
//		ne.keyPress(KeyEvent.VK_ENTER);
//		ne.keyRelease(KeyEvent.VK_ENTER);
//		ne.keyRelease(KeyEvent.VK_DOWN);
//	
		
		
	
//		ac.sendKeys(Keys.DOWN).click().perform();
		
		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CAPS_LOCK);
//		r.keyPress(KeyEvent.VK_V);
//		r.keyPress(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_A);
//		r.keyRelease(KeyEvent.VK_V);
//		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
//		
		
	}

}
