package org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fb {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\New folder\\Facebook\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://Sprint.com/");
		Thread.sleep(6000);
		WebElement close=driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		close.click();
		WebElement c=driver.findElement(By.xpath("//i[contains(@class,'fa fa-times-circle')]"));
		c.click();
		
		
		
		
		WebElement s=driver.findElement(By.id("digital-header-nav-link-head-1"));
		Actions actions=new Actions(driver);
		actions.moveToElement(s).perform();
		
	
		WebElement g=driver.findElement(By.xpath("//span[text()='5G phones']"));
		
		g.click();
		
		WebElement print=driver.findElement(By.id("digital-footer-bottom-link-bottom-9"));
		String data=print.getText();
		System.out.println(data);
	}

}
