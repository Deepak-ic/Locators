package org.loc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Challenge13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "C:\\\\\\\\Users\\\\\\\\Deepak\\\\\\\\Documents\\\\\\\\Gmail\\\\\\\\drivers\\\\\\\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.flipkart.com/");
		d.manage().window().maximize();
	}

}
