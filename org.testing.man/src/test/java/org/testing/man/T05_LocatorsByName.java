package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T05_LocatorsByName {

	public static void main(String[] args) throws InterruptedException  
 {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver dr = new EdgeDriver();
		dr.get("https://www.facebook.com");
		
		WebElement a = dr.findElement(By.name("email"));
		a.sendKeys("raghuram.krovvidi@gmail.com");
		System.out.println("Username entered");
		Thread.sleep(3000);
				
		WebElement b = dr.findElement(By.name("pass"));
		b.sendKeys("abcd");
		System.out.println("Password entered");
		Thread.sleep(4000);
			
		WebElement c = dr.findElement(By.name("login"));
		c.click();
		Thread.sleep(3000);
		System.out.println("clicked login");
		
	}

}
