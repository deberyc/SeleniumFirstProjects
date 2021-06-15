package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShopPage {
	
	
	WebDriver driver;
	
	WebElement addFlyingNinjaToCartButton;
	WebElement flyingNinjaViewCartButton;
	
	WebElement happyNinjaShirtAddButon;
	WebElement happyNinjaShirtViewCartButton;
	
	WebElement patientNinjaAddToCardButton;
	
	

	
	
	public ShopPage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	
	
	
	public WebElement getAddFlyingNinjaToCartButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
	}
	
	public WebElement getFlyingNinjaViewCartButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[3]"));
	}
	
	
	
	public WebElement getHappyNinjaShirtAddButon() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[2]/div/a[2]"));
	}
	
	
	public WebElement getHappyNinjaViewCartButon() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[2]/div/a[3]"));
	}
	
	
	
	public WebElement getPatientNinjaAddToCardButton() {
		return driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[6]/div/a[2]"));
	}
	
	
	
	
	
	
	
	
	
	public void addFlyingNinjaToCartButtonClick() {
		this.getAddFlyingNinjaToCartButton().click();
	}
	
	public void flyingNinjaViewCartButtonClick() {
		this.getFlyingNinjaViewCartButton().click();
	}
	
	
	
	
	public void happyNinjaShirtAddButon() {
		this.getHappyNinjaShirtAddButon().click();
	}
	
	
	public void happyNinjaShirtViewCartButton() {
		this.getHappyNinjaViewCartButon().click();
	}
	
	
	
	public void addPatientToCartButtonClick() {
		this.getPatientNinjaAddToCardButton().click();
	}
	
	
	
	
	
	
}
