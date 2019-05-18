package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/bsahoo/NaveenJavaTrng/SeleniumTrng/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.xpath("//*[@id=\"pushmonkey-prompt-container\"]/div/div[3]/a[1]")).click();
		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		driver.findElement(By.id("fileupload")).sendKeys("/Users/bsahoo/export.csv");
		
		
		
		
		
	}

}
