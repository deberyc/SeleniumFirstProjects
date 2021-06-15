package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {
	
	WebDriver driver; // uvek
	
	WebElement usernameInputField;
	WebElement passwordInputField;
	WebElement rememberMeCheckBox;
	WebElement logInButton;
	WebElement logOutButton; 
	
	
	public MyAccountPage(WebDriver driver) {   // konstruktor za driver, prazan
		super();
		this.driver = driver;
	}
	
	
	
	public WebElement getUsernameInputField() {
		return driver.findElement(By.id("username"));  // samo getteri i ne treba za driver
	}
	
	public WebElement getPasswordInputField() {
		return driver.findElement(By.id("password"));  // lokatori samo u ovom Page-u, u getteru
	}
	
	public WebElement getRememberMeCheckBox() {
		return driver.findElement(By.id("rememberme"));
	}
	
	public WebElement getLogInButton() {
		return driver.findElement(By.name("login"));
	}
	
	public WebElement getLogOutButton() {                                                // za assert isto služi
		return driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
	}
	
	public WebElement errorMessage() {                                                                            // nije getter, poruka o grešci 
		return driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/main/article/div/div/div/ul/li"));
	}
	
	
	
	// metode za izvrsavanje samog testa
	
	public void insertUsername(String username) {  // metoda koja popunjava username.  Kad budemo žellei da popunimo username, neæemo pisati nikakav kod, 
		this.getUsernameInputField().clear();      //                                samo æemo pozvati ovu metodu i proslediti ime koje želimo da upišemo  
		this.getUsernameInputField().sendKeys(username);
	}
	
	public void insertPassword(String password) {  // ne prima int, jer je kombinacija karaktera
		this.getPasswordInputField().clear();
		this.getPasswordInputField().sendKeys(password);
	}
	
	public void rememberMeCheckBoxCheck() {
		this.getRememberMeCheckBox().click();
	}
	
	public void logInButtonClick() {
		this.getLogInButton().click();
	}
	
	public void logOutButtonClick() {
		this.getLogOutButton().click();
	}
	
	
	
	
	// Assert-i
	
	public String textFromLogOutButton() {        // assert za Log in
		return this.getLogOutButton().getText();
	}
	
	
	public String textFromLogInButton() {        // assert za Log out
		return this.getLogInButton().getText();
		
	}
	
	public String textAfterCredencials() {  // assert za error
		return this.errorMessage().getText();
	}
	
	
	
	
	
}
