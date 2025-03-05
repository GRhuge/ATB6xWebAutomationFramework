package Base;

import java.io.FileNotFoundException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.PropertyReader;

import java.time.Duration;
import driver.DriverManager;

public class CommonToAllPage {
	
	// If you want to call something before every page object class, put your code here
	
	
	public CommonToAllPage() {
	}
	
	public void openVWOLoginURL() {
		try {
			DriverManager.getDriver().get(PropertyReader.readKey("url"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void clickElement(By by) {
		DriverManager.getDriver().findElement(by).click();
	}
	
	public void clickElement(WebElement by) {
		by.click();
	}
	
	public void enterInput(By by, String key) {
		DriverManager.getDriver().findElement(by).sendKeys(key); 
	}
	
	public void enterInput(WebElement element, String key) {
		element.sendKeys(key);
	}
	
	//Waits
	public WebElement presenceOfElement(By elementLocation) {
        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.presenceOfElementLocated(elementLocation));
    }
	
	 public WebElement visibilityOfElement(By elementLocation) {
	        return new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOfElementLocated(elementLocation));
	    }
	 
	   public WebElement getElement(By key) {
	        return DriverManager.getDriver().findElement(key);
	    }

	    public WebElement getElement(WebElement element) {
	        return element;
	    }
}