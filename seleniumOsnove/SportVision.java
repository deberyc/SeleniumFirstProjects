package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SportVision {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.sportvision.rs/patike/69812591-champion-johnny");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("/html/body/div[2]/main/div[3]/div[1]/div[1]/div/div[2]/div[4]/ul/li[4]"))
		.click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"nb_addToCartButton\"]"))
		.click();
		Thread.sleep(3000);
		
		// driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("NBIDS");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		if (driver.findElement(By.xpath("/html/body/header/div[2]/div/div[3]/div[1]/div/a/div[2]")).getText().equals("0")) {
			System.out.println("Korpa prazna.");
		}
		else {
			System.out.println("Korpa nije prazna.");
		}
		
		driver.close();
		
		
		
		
	}

}
