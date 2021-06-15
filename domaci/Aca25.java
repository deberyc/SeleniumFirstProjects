package domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aca25 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/*
		Napisati automatski test koji:
			Ocitava stranicu https://demoqa.com/ (inace stranica je namenjena za automatsko testiranje i
			odlicna je za pocetak pa mozete ako zelite proci kroz sve delove stranice)
			
			
			Klikne na "Elements"
			Klikne na "Text Box"
			
			Polje "Full name" ocisti pa unese vase ime - ciscenje se radi tako sto napisete ime elementa
			kako ste ga nazvali i dodate .clear() na primer za element username bi bilo username.clear();
			
			U polje "Email" unesite vas email
			Kliknete na "Check Box"
			Kliknete na strelicu da se spusti dropdown lista (levo od "Home" dugme)
			Selektujete samo "Desktop"
			Kliknete ponovo na "Elements" da se zatvori spisak
			Na kraju stavite sleep 5 sekundi i zatvorite program  */

		
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	
		
		WebElement openE = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		openE.click();
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
		textbox.click();
		Thread.sleep(2000);
		
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		fullname.clear();
		fullname.sendKeys("Dejan Beric");
		Thread.sleep(2000);
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		email.sendKeys("bericdejan@gmail.com");
		Thread.sleep(2000);
		
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
		checkbox.click();
		Thread.sleep(2000);
		

		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/span/button"));
		dropdown.click();
		Thread.sleep(2000);
	
		
		WebElement desktop = driver.findElement(By.xpath("//*[@id=\"tree-node\"]/ol/li/ol/li[1]/span/label/span[3]"));
		desktop.click();
		Thread.sleep(2000);
		
		WebElement closeE = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[1]/div/div/div[1]/span/div/div[1]"));
		closeE.click();
		Thread.sleep(5000);
		
		driver.close();
		
		
	}

}
