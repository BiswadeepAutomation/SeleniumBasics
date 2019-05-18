package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/bsahoo/NaveenJavaTrng/SeleniumTrng/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.cleartrip.com/");		
		Select sel = new Select(driver.findElement(By.id("Adults")));
		sel.selectByVisibleText("2");
		
		
		
	/*	driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("bsahoo@walmartlabs.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[@class='primary full'][contains(.,'Sign in')]")).click();
		driver.wait(10);
		driver.findElement(By.id("sign-in-button")).click();
		driver.findElement(By.id("lnkAccountAccess")).click();
		driver.findElement(By.xpath("/html/body/div/div/section/div/main/div[3]/section/header/a")).click();
		driver.findElement(By.id("address-postcode")).sendKeys("DN211ZA");*/
		
	}

}
