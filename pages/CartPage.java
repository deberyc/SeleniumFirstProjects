package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
	WebDriver driver;
	
	WebElement item1ProductName;
	
	WebElement deleteProduct;
	WebElement emptyCartLabel;
	
	WebElement totalPriceForItem;
	
	WebElement product2Name; // dodato
	
	WebElement checkout; // jedan dodati zahtev
	WebElement emptyCoupon; // drugi zahtev
	WebElement emptyCouponLabel; // drugi zahtev
	
	
	public CartPage(WebDriver driver) {
		super();
		this.driver = driver;
		
		
	}
	
	public WebElement getItem1ProductName() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	
	public String textFromitem1ProductName() {
		return this.getItem1ProductName().getText();

	}
	
	
	
	
	public WebElement getDeleteProduct() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[1]/a"));
		
	}
	
	public void flyingNinjaDeleteClick() {
		this.getDeleteProduct().click();
	}
	
	
	
	
	public WebElement getEmptyCartLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div/p"));
	}

	
	public String textFromEmptyCartLabel() {
		return this.getEmptyCartLabel().getText();
	}
	
	
	
	
	
	public WebElement getTotalPriceForItem() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[6]/span"));
	}
	
	
	public String textFromTotalPriceForItem() {
		return this.getTotalPriceForItem().getText();
	}
	
	
	
	
	public WebElement getProduct2Name() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/form/table/tbody/tr[1]/td[3]/a"));
	}
	public String textFromProduct2Name() {
		return this.getProduct2Name().getText();

	}
	
	
	public WebElement getCheckout() {
		return driver.findElement(By.cssSelector(".checkout-button.button.alt.wc-forward"));
	}
	
	
	public void checkoutClick() {
		this.getCheckout().click();
	}
	
	
	
	
	public WebElement getEmptyCoupon() {
		return driver.findElement(By.name("apply_coupon"));
	}
	
	public void applyCouponClick() {
		this.getEmptyCoupon().click();
		
	}
	
	
	
	
	public WebElement getEmptyCouponLabel() {
		return driver.findElement(By.xpath("//*[@id=\"post-8\"]/div/div/div[1]/ul/li"));
	}
	

	public String textFromEmptyCouponLabel() {
		return this.getEmptyCouponLabel().getText();
		
	}
	
	
	
	
	
	public List<WebElement> getCartItemsList() {                // LISTA, svi elementi koji imaju cart_item æe biti deo liste
		return driver.findElements(By.className("cart_item"));
	}
	
	
	
}