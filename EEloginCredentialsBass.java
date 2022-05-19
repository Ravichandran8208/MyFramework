package com.bass.pom;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.base.SeleniumBasePractice;

import io.github.bonigarcia.wdm.WebDriverManager;


public class EEloginCredentialsBass extends SeleniumBasePractice {
	
	public String dataSheetName;
	@DataProvider(name = "fetchData")
	public Object[][] fetchData() throws IOException {
		return com.utills.practice.DataLibrary.readExcelData("sheetforpractice");
	}
	@BeforeMethod
	public void Bassclass () {
		driver = startApp("chrome", "http://192.168.2.120:9087/EximBillWeb/SYS_index.htm");
	}
	
}
