package PageFactory;

import java.io.FileNotFoundException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.CommonToAllPage;
import Utils.PropertyReader;

public class LoginPage_PF extends CommonToAllPage {
	WebDriver driver;
	public LoginPage_PF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Page Locators
	@FindBy(id = "login-username")
	private WebElement username;
	
	@FindBy(id = "login-password")
	private WebElement password;
	
	@FindBy(id = "js-login-btn")
	private WebElement signButton;
	
	@FindBy(id = "js-notification-box-msg")
	private WebElement error_message;
	
	//Page Actions
	public String loginToVWOInvalidCredses() throws FileNotFoundException {
		enterInput(username,PropertyReader.readKey("invalid_username"));
		enterInput(password,PropertyReader.readKey("invalid_password"));
		clickElement(signButton);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return error_message.getText();
	}
}