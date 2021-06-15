package test5tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Tests extends BaseTests {

	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("https://www.saucedemo.com/"); 
		driver.manage().window().maximize();
	}
	
	
	
	@Test(priority = 0)
	public void logInTest() throws InterruptedException {
		
		loginPage.insertUsername("standard_user");
		loginPage.insertPassword("secret_sauce");
		loginPage.logInButtonClick();
		
		String actualText = productsPage.textFrompProductsTitle();
		assertEquals(actualText, "PRODUCTS");                      
	
	}
	
	
	
	@Test(priority = 5)
	
	public void orderingTest() throws InterruptedException {
	
		logInTest();
		productsPage.ClickAddToCartButtonBackpack();
		productsPage.ClickYourCartButton();
		cartPage.ClickCheckOutButton();
		informationPage.insertFirstname("Dejan");
		informationPage.insertLastname("Beric");
		informationPage.insertZipcode("21000");
		informationPage.ClickContinueButton();
		overviewPage.ClickFinishButton();
		
		
		String actualText = thankyouPage.textFromThankyouLabel();
		assertEquals(actualText, "THANK YOU FOR YOUR ORDER");
		
	} 
	
	
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
}
