package utility;

import java.io.File;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import base.Baseclass;

public class Utils extends Baseclass {
	
	public static ExtentReports extent;
	public static ExtentTest test;
	
	
	public void switchwindow() {
		String parendwindow = driver.getWindowHandle();
		
		Set<String>windowhandles = driver.getWindowHandles();
		System.out.println(windowhandles);
		
		for(String address:windowhandles) {
			if(!address.contentEquals(parendwindow)) {
				driver.switchTo().window(address);
				break;
			}
		}
	}
	
	public void titlecheck() throws Exception{
		
		extent = new ExtentReports("Reports.html", false);

		test = extent.startTest("Google Search", "Title Validation");
		try {
	      String title = driver.getTitle();
	      
	      test.log(LogStatus.INFO, "Getting Page Title");
	      
	      if (title.equals("STORE")) {
				
				test.log(LogStatus.PASS, "Title Showed");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Title.png"));
				String img = test.addScreenCapture("./screenshot/Title.png");
			} else {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Error.png"));
				String img = test.addScreenCapture("./screenshot/Error.png");
				test.log(LogStatus.FAIL, "Title is not Shown");
				
			}
	}catch(Exception e) {
		
		test.log(LogStatus.ERROR, "Title Shown Problem");
	}
		extent.endTest(test);

		extent.flush();

}
public void welcometitle() throws Exception{
		
		extent = new ExtentReports("Reports.html", false);

		test = extent.startTest("Welcome page", "Title Validation");
		try {
	      WebElement title = driver.findElement(By.xpath("//a[@id='nameofuser']"));
	      
	      System.out.println(title);
	      
	      test.log(LogStatus.INFO, "Getting Welcome Page Title");
	      
	       
	      
	      if (title.isDisplayed()) {
				
				test.log(LogStatus.PASS, "Title Showed");
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Title.png"));
				String img = test.addScreenCapture("./screenshot/Title.png");
			} else {
				TakesScreenshot ts = (TakesScreenshot) driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(source, new File("./screenshot/Error.png"));
				String img = test.addScreenCapture("./screenshot/Error.png");
				test.log(LogStatus.FAIL, "Title is not Shown");
				
			}
	}catch(Exception e) {
		
		test.log(LogStatus.ERROR, "Title Shown Problem");
	}
		extent.endTest(test);

		extent.flush();

}
public void Elementcheck() {
	extent = new ExtentReports("Reports.html", false);

	test = extent.startTest("All Element", "Element check");
	try {
		
		test.log(LogStatus.INFO, "Getting All Eleemnts");
	
	
	List<WebElement> dynamicElement = driver.findElements(By.className("nav-item"));
	if(dynamicElement.size() != 0) {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./screenshot/Element.png"));
	String img = test.addScreenCapture("./screenshot/Element.png");
	}else {
		TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(source, new File("./screenshot/ElementError.png"));
	String img = test.addScreenCapture("./screenshot/ElementError.png");

	}
	
}catch(Exception e) {
		
		test.log(LogStatus.ERROR, "Title Shown Problem");
	}
		extent.endTest(test);

		extent.flush();
}
public void cart() throws Exception{
	
	extent = new ExtentReports("Reports.html", false);

	test = extent.startTest("Product on cart", "cart Validation");
	try {
      WebElement title = driver.findElement(By.xpath("(//table[@class='table table-bordered table-hover table-striped'])//td[2]"));
      
      System.out.println(title);
      
      test.log(LogStatus.INFO, "Getting cart product");
      
       
      
      if (title.isDisplayed()) {
			
			test.log(LogStatus.PASS, "Card product Showed");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/Product.png"));
			String img = test.addScreenCapture("./screenshot/Product.png");
		} else {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/ProductError.png"));
			String img = test.addScreenCapture("./screenshot/ProductError.png");
			test.log(LogStatus.FAIL, "Product is not Shown");
			
		}
}catch(Exception e) {
	
	test.log(LogStatus.ERROR, "Title Shown Problem");
}
	extent.endTest(test);

	extent.flush();

}
public void Orderconfirmation() throws Exception{
	
	extent = new ExtentReports("Reports.html", false);

	test = extent.startTest("Order page", "Order Validation");
	try {
      WebElement title = driver.findElement(By.xpath("//h2[contains(text(),'Thank you for your purchase!')]"));
  
      
      test.log(LogStatus.INFO, "Getting Coinfirmation");
      
       
      
      if (title.isDisplayed()) {
			
			test.log(LogStatus.PASS, "Purchase Showed");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/Order.png"));
			String img = test.addScreenCapture("./screenshot/order.png");
		} else {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/OrderError.png"));
			String img = test.addScreenCapture("./screenshot/OrderError.png");
			test.log(LogStatus.FAIL, "Title is not Shown");
			
		}
}catch(Exception e) {
	
	test.log(LogStatus.ERROR, "Order not Purchased");
}
	extent.endTest(test);

	extent.flush();

}
public void homepage() throws Exception{
	
	extent = new ExtentReports("Reports.html", false);

	test = extent.startTest("Homepage", "Logout Validation");
	try {
      String title = driver.getTitle();
      
      test.log(LogStatus.INFO, "Getting Logout page");
      
      if (title.equals("STORE")) {
			
			test.log(LogStatus.PASS, "Title Showed");
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/logoutpage.png"));
			String img = test.addScreenCapture("./screenshot/logoutpage.png");
		} else {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshot/logoutError.png"));
			String img = test.addScreenCapture("./screenshot/logoutError.png");
			test.log(LogStatus.FAIL, "Title is not Shown");
			
		}
}catch(Exception e) {
	
	test.log(LogStatus.ERROR, "Title Shown Problem");
}
	extent.endTest(test);

	extent.flush();

}
}


