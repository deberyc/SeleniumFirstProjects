package domaci;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dragoljub28 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "driver-lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.com/");
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.open()");
		Thread.sleep(2000);
		
		js.executeScript("window.open()");
		Thread.sleep(2000);
		
		driver.navigate().to("https://facebook.com/");
		driver.getWindowHandles();
		
		ArrayList<String> dvaTaba = new ArrayList<String>(driver.getWindowHandles());
		
		for (int i = 0; i < dvaTaba.size(); i++) {
			System.out.println(dvaTaba.get(i));
		}
		
		
		driver.switchTo().window(dvaTaba.get(1));
		driver.navigate().to("https://youtube.com/");
		Thread.sleep(3000);
		
		driver.switchTo().window(dvaTaba.get(0));
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(dvaTaba.get(2));
		driver.navigate().to("https://demoqa.com/");
		Thread.sleep(2000);
		
		
		WebDriverWait cekanje = new WebDriverWait(driver, 5);
		
		WebElement openE = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[3]/h5")));
		openE.click();
		
		
		WebElement textbox = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id=\"item-0\"]/span")));
		textbox.click();
		
		
		
		WebElement fullname = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id=\"userName\"]")));
		fullname.sendKeys("Dejan Beric");
		
		
		
		WebElement email = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id=\"userEmail\"]")));
		email.sendKeys("bericdejan@gmail.com");
	
		
		WebElement address = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.id("currentAddress")));
		address.sendKeys("Belgrade, Serbia");
		
		
		WebElement address2 = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.id("permanentAddress")));
		address2.sendKeys("Novi Sad, Serbia");
	
		
		WebElement submit = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.id("submit")));
		submit.click();
		
		
		WebElement resenje = driver.findElement(By.cssSelector(".border.col-md-12.col-sm-12"));
		
		if(resenje.isDisplayed()) {
			System.out.println("Resenje je prikazano.");
		} else {
			System.out.println("Resenje nije prikazano.");
		}
		
		
		WebElement checkbox = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.xpath("//*[@id=\"item-1\"]/span")));
		checkbox.click();
		
		
		WebElement home = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.className("rct-checkbox")));
		home.click();
		
		
		
		WebElement check = driver.findElement(By.cssSelector(".rct-icon.rct-icon-check"));
		
		if(check.isDisplayed()) {
			System.out.println("Cekiranje je prikazano.");
		} else {
			System.out.println("Cekiranje je prikazano.");
		}
		
		
		WebElement radio = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.id("item-2")));
		radio.click();
	
		
		WebElement yes = cekanje.until(ExpectedConditions.elementToBeClickable
				(By.className("custom-control-label")));
		yes.click();
		
	
		WebElement selection = driver.findElement(By.className("mt-3"));
		
		if(selection.isDisplayed()) {
			System.out.println("Yes je cekirano.");
		} else {
			System.out.println("Yes nije cekirano.");
		}
		
		
		driver.quit();
		
		
	}

}
