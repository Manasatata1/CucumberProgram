package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T17_SelectAnimalsFrom2ndFrame {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		d.switchTo().frame(1);
		WebElement e = d.findElement(By.id("animals"));
		Select s = new Select(e);
		Thread.sleep(3000);
		s.selectByIndex(3);
		System.out.println("Avatar selected");
				
	}

}
