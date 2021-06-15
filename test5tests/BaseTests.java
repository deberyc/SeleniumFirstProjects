package test5tests;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import test5pages.CartPageTest5;
import test5pages.InformationPage;
import test5pages.LoginPageTest5;
import test5pages.OverviewPage;
import test5pages.ProductsPage;
import test5pages.ThankyouPage;

public class BaseTests {

	
	WebDriver driver;
	
	
	LoginPageTest5 loginPage;
	ProductsPage productsPage;
	CartPageTest5 cartPage;
	InformationPage informationPage;
	OverviewPage overviewPage;
	ThankyouPage thankyouPage;
	
	@BeforeClass
	public void preSvihTestova() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		
		
		loginPage = new LoginPageTest5(driver);
		
		productsPage = new ProductsPage(driver);
	
		cartPage = new CartPageTest5(driver);
		
		informationPage = new InformationPage(driver);
		
	
		overviewPage = new OverviewPage(driver);
		
		thankyouPage = new ThankyouPage(driver);
	}
	
	

	@AfterClass
	public void posleSvihTestova() {
		driver.close();
	}
	
	
}
