package domaci;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dragoljub27 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

/*		Otici na ovaj URL - https://demoqa.com/
			Kliknuti na dugme Elements sa leve strane
			Kliknuti na Text Box sa leve strane
			Popuniti sva 4 polja, kliknuti na Submit i proveriti da li se resenje pojavilo ispod (ko zeli tezu varijatnu neka proveri 
			da li je dobar ispis u smislu da li se ispisalo ime koje se unelo)
			Kliknuti na Check Box sa leve strane, cekirati Home i proveriti da li se izvrsilo cekiranje
			
			Kliknuti na Radio Button sa leve strane, kliknuti na Yes i proveriti da li se izvrsilo biranje radio buttona
			
			Kada kazem proveriti mislim da koristite if funkciju i da se ispise neki print

			Ovaj sajt je namenjen za vezbanje seleniuma, ko hoce dodatno da vezba moze da proba sve ove elemente koji su prikazani sa leve strane
			I nemoj se odmah lepiti za xpath da samo preko toga trazite elemente, pokusajte prvo ID ili class pa tek onda xpath ako bas se ne snadjete */
		
		
/*		Nadovezuje se na domaci koji sam dao juce tako da necete praviti novu klasu nego cete samo dopuniti sta ste juce radili. Treba da promenite svaki
		threadsleep u wdwait, da na pocetku pre klika na "Elements" otvorite 2 taba, u ta dva taba da otvorite Facebook i Youtube, 
		posle toga je potrebno zatvoriti samo Facebook tab. Nakon toga se nastavlja izvrsavanje koda od juce sta sam dao. */
		
		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
		
		
		
		
		
		WebElement openE = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5"));
		openE.click();
		Thread.sleep(2000);
		
		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"item-0\"]/span"));
		textbox.click();
		Thread.sleep(2000);
		
		
		WebElement fullname = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
		fullname.sendKeys("Dejan Beric");
		Thread.sleep(2000);
		
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
		email.sendKeys("bericdejan@gmail.com");
		Thread.sleep(2000);
		
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("Belgrade, Serbia");
		Thread.sleep(2000);
		
		WebElement address2 = driver.findElement(By.id("permanentAddress"));
		address2.sendKeys("Novi Sad, Serbia");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(2000);
		
		WebElement resenje = driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
		
		if(resenje.isDisplayed()) {
			System.out.println("Resenje je prikazano.");
		} else {
			System.out.println("Resenje nije prikazano.");
		}
		
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"item-1\"]/span"));
		checkbox.click();
		Thread.sleep(2000);
		
		WebElement home = driver.findElement(By.className("rct-checkbox"));
		home.click();
		Thread.sleep(2000);
		
		
		WebElement check = driver.findElement(By.cssSelector(".rct-icon.rct-icon-check"));
		
		if(check.isDisplayed()) {
			System.out.println("Cekiranje je prikazano.");
		} else {
			System.out.println("Cekiranje je prikazano.");
		}
		
		
		WebElement radio = driver.findElement(By.id("item-2"));
		radio.click();
		Thread.sleep(2000);
		
		WebElement yes = driver.findElement(By.className("custom-control-label"));
		yes.click();
		Thread.sleep(2000);
	
		WebElement selection = driver.findElement(By.className("mt-3"));
		
		if(selection.isDisplayed()) {
			System.out.println("Yes je cekirano.");
		} else {
			System.out.println("Yes nije cekirano.");
		}
		
		
		driver.close();
		
	}

}
