package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.redbus.in/");
		d.manage().window().maximize();
		WebElement acc = d.findElement(By.cssSelector("i[class= 'icon icon-user_profile_new icon_rb_secondary_item']"));
		acc.click();
		WebElement log = d.findElement(By.xpath("//span[text()= 'Login/ Sign Up']"));
		log.click();
	}

}
