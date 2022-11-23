package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T04_LocatorsById {

	public static void main(String[] args) throws InterruptedException  
 {
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver dr = new EdgeDriver();
		dr.get("https://www.facebook.com");
		
		WebElement a = dr.findElement(By.id("email"));
		a.sendKeys("raghuram.krovvidi@gmail.com");
		System.out.println("Username entered");
		Thread.sleep(3000);
		
		WebElement b = dr.findElement(By.id("pass"));
		b.sendKeys("Moto@123");
		System.out.println("Password entered");
		Thread.sleep(6000);
		
		WebElement c = dr.findElement(By.name("login"));
		c.click();
		System.out.println("Clicked login button");
	}

}
