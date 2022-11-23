package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T18_MoveToFrame1fromFrame2 {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		d.switchTo().frame(1);
		WebElement e1 = d.findElement(By.id("animals"));
		Select s = new Select(e1);
		Thread.sleep(3000);
		s.selectByVisibleText("Baby Cat");
		System.out.println("Baby Cat selected");
		
		d.switchTo().defaultContent();
		d.switchTo().frame(0);
		d.switchTo().frame(0);
		WebElement e2 = d.findElement(By.id("a"));
		e2.click();
		System.out.println("Checkbox clicked");
		Thread.sleep(2000);
		d.close();
				
	}

}
