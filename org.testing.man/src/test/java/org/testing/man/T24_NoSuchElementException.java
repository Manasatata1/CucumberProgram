package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T24_NoSuchElementException {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.co.uk");
		d.findElement(By.id("searchDropbox1"));
		d.close();
					

	}

}
