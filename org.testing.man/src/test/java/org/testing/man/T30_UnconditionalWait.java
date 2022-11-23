package org.testing.man;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import javafx.util.Duration;

public class T30_UnconditionalWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver d = new ChromeDriver(); 
		d.manage().window().maximize();
		FluentWait <ChromeDriver> fw = new FluentWait <ChromeDriver>(d);
		fw.withTimeout(Duration.seconds(30));
		fw.pollingEvery(Duration.millis(500));
		d.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");
		
		WebElement w = d.findElement(By.id("iframeResult"));
		fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(w));
		d.findElement(By.id("fname")).sendKeys("Manasa");
		d.findElement(By.id("lname")).sendKeys("Krovvidi");
		fw.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@value='Submit']")));
		d.switchTo().defaultContent();
	}

}
