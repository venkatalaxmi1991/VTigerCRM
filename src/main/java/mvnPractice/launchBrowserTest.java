package mvnPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launchBrowserTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=null;
		String browser=System.getProperty("Browser");
		switch(browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		
	
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new ChromeDriver();
			break;
			
			

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new ChromeDriver();
			break;
			
			
			default:
				System.out.println("Invalid browser info");
		}
		
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.close();
	}
	}