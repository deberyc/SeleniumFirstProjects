package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InformationPage {
	

	WebDriver driver;
	
	WebElement firstName;
	WebElement lastName;
	WebElement zipCode;
	WebElement continueButton;
	
	

	public InformationPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	public WebElement getFirstName() {
		return driver.findElement(By.id("first-name"));
	}

	public WebElement getLastName() {
		return driver.findElement(By.id("last-name"));
	}

	public WebElement getZipCode() {
		return driver.findElement(By.id("postal-code"));
	}

	public WebElement getContinueButton() {
		return driver.findElement(By.id("continue"));
	}
	
	
	
	
	public void insertFirstname(String firstname) {   
		this.getFirstName().clear();                                
		this.getFirstName().sendKeys(firstname);
	}
	
	public void insertLastname(String lastname) {  
		this.getLastName().clear();
		this.getLastName().sendKeys(lastname);
	}
	
	
	public void insertZipcode(String zipcode) {  
		this.getZipCode().clear();
		this.getZipCode().sendKeys(zipcode);
	}
	
	
	public void ClickContinueButton() {
		this.getContinueButton().click();
	}
	
	

}
