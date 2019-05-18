package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {

		
		System.setProperty("webdriver.chrome.driver", "/Users/bsahoo/NaveenJavaTrng/SeleniumTrng/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://ui.cogmento.com/");
		
		//Contains
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("sahoo.biswadeep@gmail.com");

		//Starts-with
		/*when xpath is
		 test_123
		 test_767
		 test_777
		 */
		driver.findElement(By.xpath("//input[starts-with(@name,'pass')]")).sendKeys("deep1234");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
	}

}
