package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T06_LocatorsByLinkText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://www.facebook.com");
		
		WebElement a = dr.findElement(By.name("email"));
		a.sendKeys("raghuram.krovvidi@gmail.com");
		System.out.println("Username entered");
		Thread.sleep(3000);
		
		WebElement w = dr.findElement(By.linkText("Forgotten password?"));
		w.click();
		Thread.sleep(4000);
		System.out.println("Click forgot password");
		
	}

}
