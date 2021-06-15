package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPageTest5 {
	
	WebDriver driver;
	
	WebElement checkoutButton;
	
	
	
	public CartPageTest5(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public WebElement getCheckoutButton() {
		return driver.findElement(By.id("checkout"));
	}
	
	
	
	
	
	
	public void ClickCheckOutButton() {
		this.getCheckoutButton().click();
	}


}
