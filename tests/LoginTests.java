package tests;

// dodati testove za logovanje sa pogresnim kredencijalima, bez kredencijala i logout test 

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class LoginTests extends BaseTests{
	
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to("http://cms.demo.katalon.com/"); // ponavlja se, pa možemo u Base test da je smestimo
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername("customer");
		myAccountPage.insertPassword("123456789");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		
		String actualText = myAccountPage.textFromLogOutButton();
		assertEquals(actualText, "Log out");                        // assert da je tekst koji smo dobili od Log out Button i "Log out" jednak.
	
	}

	
	
/*	@BeforeMethod                         // za ExcellReader
	public void preSvakogTesta() {  
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	
	}
	
	
	@Test(priority = 0)                                                      // za ExcellReader
	public void logInValidCredentials() throws InterruptedException {
		
		String username = citacIzExcela.getStringData("LogInTests", 4, 2);  
		String password = citacIzExcela.getStringData("LogInTests", 5, 2); // u Excelu celije formatirane u String
		
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 2);
		
	//	String password = String.valueOf(citacIzExcela.getIntegerData("LogInTests", 5, 2)); // kastovanje u String
		
		logInFormFilling(username, password);
		
		String actualText = myAccountPage.textFromLogOutButton();
		assertEquals(actualText, textForAssertion);
	} */
	
	
	@Test(priority=5)
	public void logovanjeBezKredencijala(){
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername("");
		myAccountPage.insertPassword("");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		
		String errorMessage = myAccountPage.textAfterCredencials();
		assertEquals(errorMessage, "Error: Username is required.");
	}
	
	@Test(priority=10)
	public void logovanjeSaInvalidnimKredencijalima(){
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername("dsadasf1");
		myAccountPage.insertPassword("e2144212");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		
		String errorMessage = myAccountPage.textAfterCredencials();
		assertEquals(errorMessage, "ERROR: Invalid username. Lost your password?");
	}
	
	@Test(priority=15)
	public void logOut(){
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername("customer");
		myAccountPage.insertPassword("123456789");
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
		myAccountPage.logOutButtonClick();
//		myAccountPage.getLogOutButton();
		
		String actualText = myAccountPage.textFromLogInButton();
		assertEquals(actualText, "LOG IN");
	}
	
/*	public void logInFormFilling(String username, String password) {  // dodato za citanje iz fajla, izdvojena metoda kada se puno ponavlja
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername(username);
		myAccountPage.insertPassword(password);
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
	} */
	
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}
	
	
	
}