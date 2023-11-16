package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\Deepak\\\\Documents\\\\Gmail\\\\drivers\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		WebElement usrid = d.findElement(By.id("email"));
		usrid.sendKeys("xyz@gmail.com");
		WebElement pswrd = d.findElement(By.name("pass"));
		pswrd.sendKeys("1234568");
	}

}
