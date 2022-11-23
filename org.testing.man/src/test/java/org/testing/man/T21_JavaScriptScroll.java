package org.testing.man;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T21_JavaScriptScroll {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver();
		d.get("https://demos.telerik.com/aspnet-ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		Thread.sleep(4000);
//		JavaScriptExecutor jse = (JavaScriptExecutor) d;
		

	}

}
