package seleniumOsnove;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


/* Napisati program koji
●     Ucitava starnicu https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_1?dchild=1&keywords=selenium+book&qid=1600089669&sr=8-1
●     Dodaje proizvod u korpu
●     Ucitava stranicu korpe
●     Brise kolacic koji je zaduzen za korpu
●     Refresuje stranicu
●     Provera da li je korpa prazna, provera se vrsi preko broja stavki koji su u korpi. 
	Trazite element sa slike, procitajte njegov tekst i poredite da li je taj string jednak “0” */




public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com/Selenium-Framework-Design-Data-Driven-Testing/dp/1788473574/ref=sr_1_1?dchild=1&keywords=selenium+book&qid=1600089669&sr=8-1");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement dodajUKorpu = driver.findElement(By.id("add-to-cart-button"));
		dodajUKorpu.click();
		Thread.sleep(3000);
		
		driver.manage().deleteCookieNamed("session-id");
		Thread.sleep(3000);
		
		driver.navigate().refresh();
		Thread.sleep(3000);
		
		WebElement brojUKorpi = driver.findElement(By.id("nav-cart-count"));
		brojUKorpi.getText();
		
		if(brojUKorpi.getText().equals("0")) {
			System.out.println("Korpa je prazna");
		} else {
			System.out.println("Brisanje kolaca nije obrisalo korpu");
		}
		
		
		driver.close();
		
		
		

	}

}
