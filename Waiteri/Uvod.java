package Waiteri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Uvod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	/*	Idite na sajt promenade https://promenadanovisad.rs/en/
			Obrisite kolace
			Kliknite refresh
			Sacekajte dok se ne pojavi pop-up
			Na pop-upu kliknite x(close) dugme	  */
		
		
		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // samo za stranicu
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // za svaki element da se pojavi max 10 sek (u html, ne ljudskim ocima), posle 10 sek baci gresku
		
		driver.manage().window().maximize();
		driver.navigate().to("https://promenadanovisad.rs/en/");
		Thread.sleep(3000);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(3000); // eksplicitno
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		WebDriverWait cekanje = new WebDriverWait(driver, 10);  // eksplicitni sa uslovom, kliknuæe èim može, a posle 10 baca exeption
		WebElement button = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id=\"page\"]/div/footer/div[2]/div[2]/span")));
		
		//Thread.sleep(3000);
		
	//	WebElement button = driver.findElement(By.xpath("//*[@id=\"page\"]/div/footer/div[2]/div[2]/span"));
		button.click();
		
		
		System.out.println("Kraj programa.");
	}

}
