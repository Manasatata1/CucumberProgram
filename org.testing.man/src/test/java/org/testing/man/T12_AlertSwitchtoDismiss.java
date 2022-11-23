package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T12_AlertSwitchtoDismiss {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr = new ChromeDriver();
		dr.get("https://demoqa.com/alerts");
		dr.findElement(By.id("confirmButton")).click();
		Thread.sleep(4000);
		dr.switchTo().alert().dismiss();
		System.out.println("Dismissed the alert");

	}

}
