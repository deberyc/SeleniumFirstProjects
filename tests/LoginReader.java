package tests;

import static org.testng.Assert.assertEquals;
import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginReader extends BaseTests{
	
	@BeforeMethod
	public void preSvakogTesta() {
		driver.navigate().to(homeUrl);
		driver.manage().window().maximize();
	}
	
	
	@Test(priority = 0)
	public void logInValidCredentials() throws InterruptedException {
		
		
		String username = citacIzExcela.getStringData("LogInTests", 4, 2);
		//String password = citacIzExcela.getStringData("LogInTests", 5, 2);
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 2);
		String password = String.valueOf(citacIzExcela.getIntegerData("LogInTests", 5, 2));
		logInFormFilling(username, password);
		
		String actualText = myAccountPage.textFromLogOutButton();
		assertEquals(actualText, textForAssertion);
	}
	
	
	@Test(priority = 5)
	public void logInWrongCredentials() throws InterruptedException {
		
		String username = citacIzExcela.getStringData("LogInTests", 4, 3);
		//String password = citacIzExcela.getStringData("LogInTests", 5, 2);
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 3);
		String password = String.valueOf(citacIzExcela.getIntegerData("LogInTests", 5, 3));
		logInFormFilling(username, password);
		
		String actualText = myAccountPage.textAfterCredencials();
		assertEquals(actualText, textForAssertion);
	}
	
	
	@Test(priority = 10)
	public void logInEmptyCredentials() throws InterruptedException {
		
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 9, 4);
		logInFormFilling("", "");
		
		String actualText = myAccountPage.textAfterCredencials();
		assertEquals(actualText, textForAssertion);
	}
	
	
	@Test(priority = 15)
	
	public void logOut() throws InterruptedException {
		
		String textForAssertion = citacIzExcela.getStringData("LogInTests", 7, 2);
		logInValidCredentials();
		myAccountPage.logOutButtonClick();
		
		String actualText = myAccountPage.textFromLogInButton();
		assertEquals(actualText, textForAssertion);
	}
	
	
	public void logInFormFilling(String username, String password) {
		mainNavigation.myAccountTabClick();
		myAccountPage.insertUsername(username);
		myAccountPage.insertPassword(password);
		myAccountPage.rememberMeCheckBoxCheck();
		myAccountPage.logInButtonClick();
	}
	
	
	@AfterMethod
	public void posleSvakogTesta() throws InterruptedException {		
		driver.manage().deleteAllCookies();
		driver.navigate().refresh();
	}

	
	
}
