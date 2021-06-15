package tests;

import static org.testng.Assert.assertEquals;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartReader extends BaseTests{
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 1)
	public void addProductToCartTest() {
		
		String textForAssertion = citacIzExcela.getStringData("Cart tests", 6, 2);
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.flyingNinjaViewCartButtonClick();
		
		String actualText = cartPage.textFromitem1ProductName();
		assertEquals(actualText, textForAssertion);
	}
	
	
	@Test(priority = 5)
	public void removeProductFromCartTest() {
		
		String textForAssertion = citacIzExcela.getStringData("Cart tests", 6, 3);
		addProductToCartTest();
		cartPage.flyingNinjaDeleteClick();
		
		String actualText = cartPage.textFromEmptyCartLabel();
		assertEquals(actualText, textForAssertion);
	}
	
	
	@Test(priority = 10)
	public void addProductTCard10Times() throws InterruptedException {
		
		String textForAssertion = citacIzExcela.getStringData("Cart tests", 6, 4);
		for (int i = 0; i < 10; i++) {
			shopPage.addFlyingNinjaToCartButtonClick();
			Thread.sleep(200);
		}
		shopPage.flyingNinjaViewCartButtonClick();
		
		String actualText = cartPage.textFromTotalPriceForItem();
		assertEquals(actualText, textForAssertion);
	}
	
	
	@Test(priority = 0)
	public void add3ProductTCard() throws InterruptedException {
		
		int textForAssertion = citacIzExcela.getIntegerData("Cart tests", 6, 5);
		shopPage.addFlyingNinjaToCartButtonClick();
		shopPage.happyNinjaShirtAddButon();
		shopPage.addPatientToCartButtonClick();
		Thread.sleep(500);
		mainNavigation.cartTabClick();
		
		List<WebElement> listaItemaUKorpi = cartPage.getCartItemsList();
		
		int actualNumberOfItems = listaItemaUKorpi.size();
		assertEquals(actualNumberOfItems, textForAssertion);
	}
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	

}
