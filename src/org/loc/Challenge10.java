package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://inmakesedu.com/about_us");
		d.manage().window().maximize();
		WebElement inmtxt = d.findElement(By.xpath("//h2[contains(text(),'Inmakes learning')]"));
		String txt = inmtxt.getText();
		System.out.println(txt);
	}

}
