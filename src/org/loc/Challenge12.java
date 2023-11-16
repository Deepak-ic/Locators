package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		WebElement srch = d.findElement(By.id("APjFqb"));
		srch.sendKeys("Inmakes learning hub");
		srch.sendKeys(Keys.RETURN);
		WebElement first = d.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']"));
		first.click();
		
		
		
	}

}
