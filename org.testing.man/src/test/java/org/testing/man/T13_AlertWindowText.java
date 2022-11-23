package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T13_AlertWindowText {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		dr.findElement(By.id("confirmButton")).click();
		Thread.sleep(4000);
		System.out.println(dr.switchTo().alert().getText());
		dr.switchTo().alert().accept();
		System.out.println("Alert accepted");
		
		
	}

}
