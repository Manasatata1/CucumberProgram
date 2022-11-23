package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T26_ElementDIsabledException {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_disabled");
		d.findElement(By.id("lname"));
		
		
	}

}
