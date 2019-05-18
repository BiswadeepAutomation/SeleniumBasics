package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
		// Webdriver is a interface
		//ChromeDriver is a class that has implemented the Webdriver interface
		
		// How to launch chrome browser
		
		System.setProperty("webdriver.chrome.driver", "/Users/bsahoo/NaveenJavaTrng/SeleniumTrng/drivers/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.asda.com/login?redirect_uri=https%3A%2F%2Fgroceries.asda.com%2F&request_origin=gi");
		
		//How to get title of page
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		
		//There are 8 locators in selenium
		// 1. Xpath
		//Absolute xpath (Hierarchy xpath - html/div...) should never be used
		//Use Relative xpath - //input[contains(@type,'email')]
		/*driver.findElement(By.xpath("//input[contains(@type,'email')]")).sendKeys("bsahoo@walmartlabs.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test1234");
		driver.findElement(By.xpath("//button[@class='primary full'][contains(.,'Sign in')]")).click();
		*/
		//2. Id:
		driver.findElement(By.id("username")).sendKeys("bsahoo@walmartlabs.com");
		driver.findElement(By.id("password")).sendKeys("test1234");
		//driver.findElement(By.xpath("//button[@class='primary full'][contains(.,'Sign in')]")).click();
		
		//3. Name:
		//driver.findElement(By.name("username")).sendKeys("bsahoo@walmartlabs.com");
		
		//4. LinkText - This is only for links
		//driver.findElement(By.linkText("Forgotten password?")).click();
		
		//5. PartialLinkText - not recommended to use
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		//6. CSS Selector (
		//If id is presnt then use # before id - #username(id))
		//If class is present use . before class - .class 
		driver.findElement(By.cssSelector(".input-box > input:nth-child(2)")).sendKeys("bsahoo@walmartlabs.com");
		
		//7. ClassName - Not recommended to use
		driver.findElement(By.className("basic full")).click();
		
		//8. Tag
		driver.findElement(By.tagName("")).click();;
		
		//driver.close();
		//driver.quit();
		//validation point
		if (title.equals("Sign in")) {
			System.out.println("Title is correct");
		}else {
			System.out.println("Title is incorrect");
		}
		}
			
		
		
		// How to launch firefox browser
		
		//System.setProperty("webdriver.gecko.driver", "/Users/bsahoo/NaveenJavaTrng/SeleniumTrng/drivers/geckodriver");
		//WebDriver driver_new = new FirefoxDriver();
		
	}


