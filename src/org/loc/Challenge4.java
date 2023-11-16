package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://en-gb.facebook.com/");
		d.manage().window().maximize();
		WebElement usrname = d.findElement(By.xpath("//input[@data-testid='royal_email']"));
		usrname.sendKeys("xyz123.@gmail.com");
		WebElement paswrd = d.findElement(By.xpath("//input[@data-testid='royal_pass']"));
		paswrd.sendKeys("123456");
		WebElement login = d.findElement(By.xpath("//button[@data-testid='royal_login_button']"));
		login.click();
	}

}
