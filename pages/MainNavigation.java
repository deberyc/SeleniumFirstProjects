package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainNavigation {
	
	WebDriver driver; // uvek
	
	
	WebElement myAccountTab;  // u ovom Page-u navigacioni elementi posebno izdvojeni, pet tabova, ali neæemo sve
//	WebElement cartTab;
	
	
	
	public MainNavigation(WebDriver driver) { // konstruktor za driver, prazan
		super();
		this.driver = driver;
		
	}
	
	
	
	public WebElement getMyAccountTab() {
		return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
	}
	
	
	
	// metode za izvrsavanje samog testa
	
	public void myAccountTabClick() {
		this.getMyAccountTab().click();
	}
	
	
	
	
	
	
	public WebElement getCartTab() {
		return driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[1]/a"));
	}
	
	public void cartTabClick() {
		this.getCartTab().click();
	}  
	
	
	
	
}
