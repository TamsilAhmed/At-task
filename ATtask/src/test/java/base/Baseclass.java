package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Utils;

public class Baseclass {
	public static WebDriver driver;
	@BeforeMethod
		public void Start() {
			
		WebDriverManager.chromedriver().setup();
			
		    driver = new ChromeDriver();
			
			driver.get("https://www.demoblaze.com/");
			
			driver.manage().window().maximize();
			
			

		}
		@AfterMethod
		public void Close() {
			//driver.close();
		}

}
