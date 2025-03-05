package com.thetestingacademy.ATB6xWebAutomationFramework;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import PageObjectModel.LoginPage_POM;

public class TestVWOLogin_POM {
	
	@Test
	public void testLoginNegativeVWO() {
		WebDriver driver = new ChromeDriver();
		LoginPage_POM loginPagePOM = new LoginPage_POM(driver);
		String error_msg_text = loginPagePOM.loginToVWOInvalidCreds("admin@gmail.com","admin");
		Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
	}
	
	@Test
	public void testLoginNegativeVWO2() {
		WebDriver driver = new ChromeDriver();
		LoginPage_POM loginPagePOM = new LoginPage_POM(driver);
		String error_msg_text = loginPagePOM.loginToVWOInvalidCreds("krsna@gmail.com","admin");
		Assert.assertEquals(error_msg_text, "Your email, password, IP address or location did not match");
	}
}