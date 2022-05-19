package com.rav.pagesofAppPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import com.bass.pom.EEloginCredentialsBass;

public class HomePage extends EEloginCredentialsBass {
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public void clickImportLetter() throws InterruptedException {
		Thread.sleep(100);
	driver.switchTo().frame(3);
	
	driver.findElement(By.name("Import Letter of Credit")).click();
	
//	String title = driver.getTitle();
//	System.out.println(title);
	
	
	}

}
