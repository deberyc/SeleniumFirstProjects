package testNG;

// tri razlièita sajta uèitati preko testNG


 import java.util.concurrent.TimeUnit;

/*dodati test za navigaciju na jos dva sajta i dodati neki wejter umesto thread.sleep */


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimertestNG {
	
	WebDriver driver; // deklarišemo na nivou klase da bude vidljivo svuda
	WebDriverWait cekanje;
	
	@BeforeClass 
	public void preSvihTestova() {
		
		System.out.println("============================"); //ovo sluzi samo za ispis, nije neophodno
		System.out.println("Ispis pre svih testova");
		System.out.println("============================");
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // implicitno za SVAKU STRANICU
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // implicitno za SVE ELEMENTE, kliknuæe èim bude zadovoljen uslov, a posle 10 baca exeption. Posle negde možemo da smanjimo ako hoæemo
	}
	
	
	@BeforeMethod 
	public void preSvakogTesta() throws InterruptedException {
		System.out.println("--------------------------------");
		System.out.println("Ispis pre svakog testa");
		driver.navigate().to("https://www.google.com/");
	//	Thread.sleep(3000);
		driver.manage().window().maximize();
	//	Thread.sleep(3000);
		
	}
	@Test(priority = 20)
	public void trazenjeITBootcampaNaGooglu() throws InterruptedException {
		
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("IT bootcamp");
		searchField.sendKeys(Keys.ENTER);
		
		WebElement linkInSearchResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3"));
		linkInSearchResult.click();
	}
	
	@Test(priority = 10)
	public void trazenjeKupujemProdajemNaGooglu() throws InterruptedException {
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("kupujem prodajem");
		searchField.sendKeys(Keys.ENTER);
		
		WebElement linkInSearchResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div[1]/a/h3")); // uvek isto za pri sajt u pretrazi
		linkInSearchResult.click();
	}
	
	@Test(priority = 1)
	public void trazenjeBlicNaGooglu() throws InterruptedException {
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("blic");
		searchField.sendKeys(Keys.ENTER);
		
		WebElement linkInSearchResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3"));
		linkInSearchResult.click();
	}
	
	@Test(priority = 5)
	public void trazenjePMFNaGooglu() throws InterruptedException {
		WebElement searchField = driver.findElement(By.name("q"));
		searchField.sendKeys("PMF");
		searchField.sendKeys(Keys.ENTER);
		
		WebElement linkInSearchResult = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3"));
		linkInSearchResult.click();
	}
	
	
	@AfterMethod 
	public void posleSvakogTesta() {
		System.out.println("Ispis nakon svakog testa");
		System.out.println("--------------------------------"); // ne moramo imati sve uvek
		driver.manage().deleteAllCookies();
	}
	
	
	@AfterClass 
	public void posleSvihTestova() {
		System.out.println("============================");
		System.out.println("Ispis posle svih testova");
		System.out.println("============================");
		driver.close();

	}

}
