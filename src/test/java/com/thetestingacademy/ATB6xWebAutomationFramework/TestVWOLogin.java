package com.thetestingacademy.ATB6xWebAutomationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin {
	@Test
	public void testLoginNegativeVWO() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://app.vwo.com");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Login - VWO");
		Assert.assertEquals(driver.getCurrentUrl(), "https://app.vwo.com/#/login");
		
		WebElement emailInputBox = driver.findElement(By.id("login-username"));
		emailInputBox.sendKeys("admin@admin.com");
		driver.findElement(By.id("login-password")).sendKeys("password@123");
		driver.findElement(By.id("js-login-btn")).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement errorMsg = driver.findElement(By.id("js-notification-box-msg"));
		Assert.assertEquals(errorMsg.getText(), "Your email, password, IP address or location did not match");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Start a free trial")).click();
		driver.quit();
	}
}