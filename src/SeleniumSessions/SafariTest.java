package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SafariTest {

	public static void main(String[] args) {

		WebDriver driver = new SafariDriver();
		driver.get("https://www.asda.com/login?redirect_uri=https%3A%2F%2Fgroceries.asda.com%2F&request_origin=gi");
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		driver.findElement(By.xpath(""));
		//driver.quit();
		
	}

}
