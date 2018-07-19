package com.mouseHover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\a631020\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		Action act = builder.moveToElement(driver.findElement(By.xpath(".//*[@id='userLoginBlock']/a"))).build();
		act.perform();
		

	}

}
