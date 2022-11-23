package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T23_SelectItemFromDropdown {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://www.amazon.in");
		
		WebElement e = d.findElement(By.name("url"));
		Select s = new Select (e);
		s.selectByIndex(3);
		Thread.sleep(3000);
		s.selectByVisibleText("Baby");
		Thread.sleep(2000);
		s.selectByValue("search-alias=stripbooks");
		Thread.sleep(2000);
		d.close();

	}

}
