package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		WebElement srch = d.findElement(By.id("twotabsearchtextbox"));
		srch.sendKeys("samsung");
		srch.sendKeys(Keys.RETURN);
	}

}
