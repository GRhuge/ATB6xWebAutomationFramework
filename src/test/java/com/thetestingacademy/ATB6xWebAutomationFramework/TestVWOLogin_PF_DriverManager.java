package com.thetestingacademy.ATB6xWebAutomationFramework;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageFactory.LoginPage_PF;
import base.CommonToAllTest;

public class TestVWOLogin_PF_DriverManager extends CommonToAllTest {
	@Test
	public void testLoginNegativeVWO() throws FileNotFoundException {
		WebDriver driver = new ChromeDriver() ;
		LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
		loginPage_PF.openVWOLoginURL();
		String error_msg=loginPage_PF.loginToVWOInvalidCredses();
		Assert.assertEquals(error_msg, "Your email, password, IP address or location did not match");
		driver.quit();
	}
}