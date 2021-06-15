package tests;

//  napraviti test za dodavanje proizvoda u korpu

//  obrisati item iz korpe test

// dodajte jedan te isti produkt 10 puta u cart

// zadatak: dodajte tri razlicita proizvoda u korpu

import java.util.List;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTests extends BaseTests{
	
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("http://cms.demo.katalon.com/");
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 0)
	public void addProductToCartTest() throws InterruptedException { // dodavanje u korpu
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.flyingNinjaViewCartButtonClick();
		
		String actualText = cartPage.textFromitem1ProductName();
		assertEquals(actualText, "Flying Ninja");
	}
	
	
	@Test(priority = 2)
	public void add3ProductToCard() throws InterruptedException { // tri proizvoda u korpu
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.happyNinjaShirtAddButon();
		shopPage.addPatientToCartButtonClick();
		Thread.sleep(500);
		mainNavigation.cartTabClick();
		
		List<WebElement> listaItemaUKorpi = cartPage.getCartItemsList();
		
		int actualNumberOfItems = listaItemaUKorpi.size();
		assertEquals(actualNumberOfItems, 3);
	}
	
	
	
	
	@Test(priority = 3)
	public void deleteProductToCartTest() {    // brisanje iz korpe
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.flyingNinjaViewCartButtonClick();
		cartPage.flyingNinjaDeleteClick();
		
		String actualText = cartPage.textFromEmptyCartLabel();
		assertEquals(actualText, "Your cart is currently empty.");;
	}
		
	
	@Test(priority = 10)
	public void addProductTCard10Times() throws InterruptedException {  // 10 puta isti
		for (int i = 0; i < 10; i++) {
			
			shopPage.addFlyingNinjaToCartButtonClick();
			Thread.sleep(200); // bez ne dodaje svih 10
		}
			shopPage.flyingNinjaViewCartButtonClick();
			
			String actualText = cartPage.textFromTotalPriceForItem();
			assertEquals(actualText, "$120.00");
	}
	
	
/*	@Test(priority = 13)
	public void insertEmptyCoupon() throws InterruptedException { // dodati test 1.
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.flyingNinjaViewCartButtonClick();
		cartPage.applyCouponClick();
		
		String actualText = cartPage.textFromEmptyCouponLabel();
		assertEquals(actualText, "Please enter a coupon code.");	
		
	}
	
	
	@Test(priority = 15)
	public void goToCheckout() throws InterruptedException {   // dodati test 2.
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.flyingNinjaViewCartButtonClick();
		cartPage.checkoutClick();
		
		
	}*/
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
		
		
	}

}
