package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class T08_LocatorsByxpath {

	public static void main(String[] args) throws InterruptedException  
 {
		WebDriverManager.chromedriver().setup();		
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.facebook.com");
		
		WebElement e = d.findElement(By.xpath("//*[@id='email']"));
		e.sendKeys("raghuram.krovvidi@gmail.com");
		Thread.sleep(4000);
		System.out.println("Username entered");
		
		WebElement f = d.findElement(By.xpath("//*[@id='pass']"));
		f.sendKeys("Moto@123");
		Thread.sleep(3000);
		System.out.println("Password entered");
		
		WebElement g = d.findElement(By.name("login"));
		g.click();
		System.out.println("Logged in successfully");
				
	}

}
