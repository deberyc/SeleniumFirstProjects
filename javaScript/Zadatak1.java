package javaScript;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*Otvoriti 5 tabova i na svakom otici na razliciti sajt 
i potom ih zatvoriti stranicu po stranicu */


public class Zadatak1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.open()");
		Thread.sleep(2000);
		
		js.executeScript("window.open()");
		Thread.sleep(2000);
		
		js.executeScript("window.open()");
		Thread.sleep(2000);
		
		js.executeScript("window.open()");
		Thread.sleep(2000);
		
		//driver.navigate().to("https://blog.qatestlab.com/2020/05/13/bug-busters-a-day-in-the-life-of-qa-engineer/");
		driver.getWindowHandles();
		
		ArrayList<String> listaRuckiProzora = new ArrayList<String>(driver.getWindowHandles());
		
		for (int i = 0; i < listaRuckiProzora.size(); i++) {
			System.out.println(listaRuckiProzora.get(i));
		}
		
		driver.switchTo().window(listaRuckiProzora.get(2));
		driver.navigate().to("https://promenadanovisad.rs/");
		
		driver.switchTo().window(listaRuckiProzora.get(1));
		driver.navigate().to("https://www.kupujemprodajem.com/");
		
		driver.switchTo().window(listaRuckiProzora.get(0));
		driver.navigate().to("https://www.reddit.com/");
		
		driver.switchTo().window(listaRuckiProzora.get(3));
		driver.navigate().to("https://www.w3schools.com/");
		
		driver.switchTo().window(listaRuckiProzora.get(4));
		driver.navigate().to("https://coursehunter.net/");
		
		
		
		Thread.sleep(5000);
		driver.switchTo().window(listaRuckiProzora.get(0));
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(listaRuckiProzora.get(1));
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(listaRuckiProzora.get(2));
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(listaRuckiProzora.get(3));
		driver.close();
		
		Thread.sleep(2000);
		driver.switchTo().window(listaRuckiProzora.get(4));
		
		driver.close();
		System.out.println("kraj.");
		
		
	}

}
