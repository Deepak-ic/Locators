package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.youtube.com/");
		d.manage().window().maximize();
		WebElement ytsrch = d.findElement(By.name("search_query"));
		ytsrch.sendKeys("India");
		ytsrch.sendKeys(Keys.RETURN);
	}

}
