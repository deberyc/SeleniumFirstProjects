package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Zadatak2 {
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*  Napisati program koji:
●     Ucitava stranicu http://cms.demo.katalon.com/
●     Maksimizuje stranicu
●     Odlazi na stranicu za login tako sto klikne na My Account link iz navigacije
●     Popunjava username i password (customer/123456789)
●     Loguje se na stranicu pristiskom na Login dugme
●     Odjavljuje se sa stranice klikom na link Logout
●     Na kraju programa zatvorite stranicu. */  
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement myAccount = driver.findElement(By.xpath("//*[@id=\"primary-menu\"]/ul/li[3]/a"));
		myAccount.click();
		Thread.sleep(2000);
		
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"username\"]"));
		username.sendKeys("customer");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		password.sendKeys("123456789");
		Thread.sleep(2000);
		
		WebElement rememberMe = driver.findElement(By.xpath("//*[@id=\"rememberme\"]"));
		rememberMe.click();
		Thread.sleep(2000);
		
		WebElement logInButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/form/p[3]/button"));
		logInButton.click();;
		Thread.sleep(2000);
		
		WebElement logOutButton = driver.findElement(By.xpath("//*[@id=\"post-10\"]/div/div/div/p[1]/a"));
		logOutButton.click();
		Thread.sleep(2000);
		
		
		
		
		
		driver.close();
		
	}

}
