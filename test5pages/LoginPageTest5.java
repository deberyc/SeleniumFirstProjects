package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageTest5 {
	
	
	WebDriver driver;
	
	WebElement usernameField;
	WebElement passwordField;
	WebElement loginField;
	
	
	public LoginPageTest5(WebDriver driver) {
		super();
		this.driver = driver;
	}


	
	public WebElement getUsernameField() {
		return driver.findElement(By.name("user-name"));
	}
	

	public WebElement getPasswordField() {
		return driver.findElement(By.name("password"));
	}


	public WebElement getLoginField() {
		return driver.findElement(By.id("login-button"));
	}
	
	
	
	
	
	public void insertUsername(String username) {   
		this.getUsernameField().clear();                                  
		this.getUsernameField().sendKeys(username);
	}
	
	public void insertPassword(String password) {  
		this.getPasswordField().clear();
		this.getPasswordField().sendKeys(password);
	}
	
	

	
	
	public void logInButtonClick() {
		this.getLoginField().click();
	}
	
	
	
	
	public String textFromLogInButton() {        
		return this.getLoginField().getText();
		
	}
	
	

}
