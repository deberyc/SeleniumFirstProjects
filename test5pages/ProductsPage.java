package test5pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {

	WebDriver driver;
	
	WebElement productsTitle;
	WebElement addToCartButtonBackpack;
	WebElement yourCartButton;
	
	

	public ProductsPage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	
	
	public WebElement getProductsTitle() {
		return driver.findElement(By.xpath("//*[@id=\"header_container\"]/div[2]/span"));
	}
	

	
	public WebElement getAddToCartButtonBackpack() {
		return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	}
	

	public WebElement getYourCartButton() {
		return  driver.findElement(By.id("shopping_cart_container"));
	}



	
	
	
	public void ClickAddToCartButtonBackpack() {
		this.getAddToCartButtonBackpack().click();
	}
	
	public void ClickYourCartButton() {
		this.getYourCartButton().click();
	}
	
	
	
	
	
	public String textFrompProductsTitle() {        // assert za Log IN
		return this.getProductsTitle().getText();
		
	}
	
	
}
