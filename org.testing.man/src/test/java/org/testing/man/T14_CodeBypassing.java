package org.testing.man;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T14_CodeBypassing {

	public static void main(String[] args) throws InterruptedException {
		 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

	}

}
