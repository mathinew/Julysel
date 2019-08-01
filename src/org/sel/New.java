package org.sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\workspace\\NewProj\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement cntct = driver.findElement(By.xpath("//a[text()='CONTACT US']"));
		cntct.click();
		
	}
	
	

}
