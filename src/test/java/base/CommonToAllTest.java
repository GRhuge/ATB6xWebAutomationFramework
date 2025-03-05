package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import driver.DriverManager;

public class CommonToAllTest {
	
	// This class will start the WebDriver
	// Down the WebDriver
	
	@BeforeMethod
	public void setUp() {
		DriverManager.init();
	}
	
	public void tearDown() {
		DriverManager.down();
		}
 }

