package org.loc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Challeneg11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://inmakesedu.com/");
		d.manage().window().maximize();
		WebElement add = d.findElement(By.xpath("//a[contains(text(),'02-01 Mai tower')]"));
		String txt = add.getText();
		System.out.println(txt);
	}

}