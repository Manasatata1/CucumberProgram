package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T09_LocatorsByCSS {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.fb.com");
		d.findElement(By.cssSelector("input.inputtext")).sendKeys("mtatavarthy32@gmail.com");
			
	}

}
