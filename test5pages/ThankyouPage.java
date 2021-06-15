package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ThankyouPage {

	
	WebDriver driver;
	
	WebElement thankyouLabel;

	public ThankyouPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	
	public WebElement getThankyouLabel() {
		return driver.findElement(By.className("complete-header"));
	}
	
	
	
	
	public String textFromThankyouLabel() {        
		return this.getThankyouLabel().getText();
		
	}
	
	
	
}
