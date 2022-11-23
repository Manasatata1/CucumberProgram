package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T10_isEnabled {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver dr = new ChromeDriver();
			dr.get("https://www.fb.com");
			
			Boolean x = dr.findElement(By.id("email")).isEnabled();
			Thread.sleep(4000);
				if (x== true)
				{
					System.out.println("Email field enabled");
				}
				else
				{
					System.out.println("Email field is disabled");
				}
										

	}

}
