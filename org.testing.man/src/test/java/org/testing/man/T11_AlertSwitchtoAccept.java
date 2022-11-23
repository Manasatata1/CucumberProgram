package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T11_AlertSwitchtoAccept {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr = new ChromeDriver();
		
		dr.get("https://demoqa.com/alerts");				//Open website
		dr.manage().window().maximize();          	 		//Maximize the window
		dr.findElement(By.id("confirmButton")).click();		//Click on the button "click"
		Thread.sleep(5000);
		dr.switchTo().alert().accept();						//Click "ok" on alert page
		Thread.sleep(3000);
		System.out.println("Clicked ok on alert");
		

	}

}
