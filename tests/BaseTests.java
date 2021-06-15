package tests;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import pages.CartPage;
import pages.ShopPage;
import pages.MainNavigation;
import pages.MyAccountPage;

public class BaseTests {  // nema   main
	
	WebDriver driver;
	
	// deklarišemo sve stranice koje su nam potrebne
	MainNavigation mainNavigation;
	MyAccountPage myAccountPage;                          // Base i Login klase  nemaju nikakve elemente, konzumiraju klase stranica
	
	
	ShopPage shopPage;
	CartPage cartPage;
	
	
	ExcelReader citacIzExcela; // èitaè je objekat klase ExcelReader objekat
	String homeUrl;
	
	
	
	
	
	@BeforeClass
	public void preSvihTestova() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  // u ovom kontekstu su samo implicitni ok
		
		

		
		mainNavigation = new MainNavigation(driver);
		myAccountPage =  new MyAccountPage(driver); // svaku novu stranicu gore deklarišemo, pa ovde instanciramo
		
		
		shopPage =  new ShopPage(driver);
		cartPage = new CartPage(driver);
		
		citacIzExcela =  new ExcelReader("data/AutomationTestPlan.xlsx"); // može iako je u glavnoj u beforeMethod
		homeUrl = "http://cms.demo.katalon.com/";
	}
	
	
	
	
	
	@AfterClass
	public void posleSvihTestova() {
		driver.close();
	}
	
	
	
	
}