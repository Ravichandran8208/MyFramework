package com.testing.pom;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bass.pom.EEloginCredentialsBass;
import com.rav.pagesofAppPOM.LoginPage;

public class Verifypages extends EEloginCredentialsBass {
	@BeforeTest
	public void set() {
		

	}
	@Test(dataProvider = "fetchData")

	public void testingpages(String unitcode,String Userid ,String password ) throws InterruptedException {
		LoginPage lp=new LoginPage((ChromeDriver) driver);
		lp.enterUnitCode(unitcode).Userid(Userid).enterPassword(password).clickSubmit().clickImportLetter();

	}

	
		

	

}
