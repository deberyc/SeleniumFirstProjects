package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak1 {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		/*   Posetite stranicu http://cms.demo.katalon.com/ i u delu za pretragu uneti 
		  tekst “Flying Ninja” i kliknuti na search dugme (search ikonica).
		   Pri ucitavanju stranice maksimizovati prozor.
             Na kraju programa zatvorite stranicu    */
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.google.com");
		
		driver.navigate().to("http://cms.demo.katalon.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement searchField = driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/label/input"));
		searchField.sendKeys("Flying Ninja");
		
		Thread.sleep(2000);
		searchField.clear();
		Thread.sleep(2000);
		searchField.sendKeys("Sleeping Ninja");
		Thread.sleep(2000);
		
		WebElement searchbutton = driver.findElement(By.xpath("//*[@id=\"search-2\"]/form/button/i"));
		searchbutton.click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
	}

}
