package Waiteri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

/* zatvoriti chat kad se sam otvori*/
  

 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BugBasters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"driver-lib\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.navigate().to("https://blog.qatestlab.com/2020/05/13/bug-busters-a-day-in-the-life-of-qa-engineer/");
		
		
		WebDriverWait cekanje = new WebDriverWait(driver, 20); // koliko max ceka
		WebElement button = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.className("closeIcon_5110")));
		
		
		
		button.click();
		System.out.println("Kraj");
		
	}

}
