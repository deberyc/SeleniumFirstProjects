package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OverviewPage {

	WebDriver driver;
	
	WebElement finishButton;

	public OverviewPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public WebElement getFinishButton() {
		return driver.findElement(By.id("finish"));
	}
	
	
	
	
	public void ClickFinishButton() {
		this.getFinishButton().click();
	}
	
	
}
