package com.rav.pagesofAppPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bass.pom.EEloginCredentialsBass;

public class LoginPage extends EEloginCredentialsBass{


	public LoginPage(ChromeDriver driver) {
		this.driver = driver;	}

	public LoginPage enterUnitCode(String unitcode) {
		
		clearAndType(locateElement("name","C_BUSINESS_UNIT"),unitcode);
		
		return this;
//		clearAndType(locateElement("id","username"), data);
	}
	public LoginPage Userid(String Userid) {
//		driver.findElement(By.name("C_USER_ID")).sendKeys(Userid);
		clearAndType(locateElement("name","C_USER_ID"),Userid);
		return this;

	}
	public LoginPage enterPassword(String password) {
//		driver.findElement(By.id("tipLogPwd")).sendKeys(password);
		clearAndType(locateElement("id","tipLogPwd"),password);

		return this;
	}
	public HomePage clickSubmit() {
//		driver.findElement(By.id("Image1")).click();
		click(locateElement("id","Image1"));

		return new HomePage((ChromeDriver) driver);
	}

}
