package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* zadatak dodatati jedan proizvod u korpu i potom otvoriti korpu  */ 

public class Zadatak3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		WebElement addtocart = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[2]"));
		addtocart.click();
		Thread.sleep(2000);
		
		WebElement viewcart = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/ul/li[1]/div/a[3]"));
		viewcart.click();
		Thread.sleep(2000);
		
		
		driver.close();
		
	}

}
