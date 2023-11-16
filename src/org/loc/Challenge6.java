package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.cleartrip.com/trains");
		d.manage().window().maximize();
		WebElement from = d.findElement(By.xpath("//input[@title='From station']"));
		from.sendKeys("Chennai");
		WebElement to = d.findElement(By.xpath("//input[@title='To station']"));
		to.sendKeys("Coimbatore");
		WebElement srch = d.findElement(By.xpath("//button[@id='trainFormButton']"));
		srch.click();
	}

}
