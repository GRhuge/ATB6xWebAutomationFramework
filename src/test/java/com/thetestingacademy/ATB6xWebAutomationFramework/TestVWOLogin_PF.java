package com.thetestingacademy.ATB6xWebAutomationFramework;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageFactory.LoginPage_PF;
import PageObjectModel.LoginPage_POM;

public class TestVWOLogin_PF {
	@Test
	public void testLoginNegativeVWO() throws FileNotFoundException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com");
		LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
		String error_msg=loginPage_PF.loginToVWOInvalidCredses();
		Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
		driver.quit();
	}
}