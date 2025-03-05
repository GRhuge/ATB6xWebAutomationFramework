package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPage_POM {
	
	WebDriver driver;
	public LoginPage_POM(WebDriver driver) {
		this.driver=driver;
	}
	
	//Page Locators
	private By username = By.id("login-username");
	private By password = By.id("login-password");
	private By signButton = By.id("js-login-btn");
	private By error_message = By.id("js-notification-box-msg");
	
	//Page Actions
	public String loginToVWOInvalidCreds(String user,String pwd) {
		driver.get("https://app.vwo.com");
		driver.findElement(username).sendKeys(user);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(signButton).click();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		WebElement errorMsg = driver.findElement(By.id("js-notification-box-msg"));
		String error_msg_text = errorMsg.getText();
		System.out.println("Error Message: " + error_msg_text);
		driver.quit();
		return error_msg_text;
	}
}