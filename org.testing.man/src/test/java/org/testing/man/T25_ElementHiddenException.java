package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T25_ElementHiddenException {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.gmail.com");
		d.findElement(By.name("Passwd")).sendKeys("abc@gmail.com");
		
		
	}

}
