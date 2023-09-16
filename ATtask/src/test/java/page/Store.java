package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Utils;



public class Store extends Utils{
	
	@FindBy(xpath = "(//a[@href='#'])[6]")
	WebElement signup;
	@FindBy(xpath = "//input[@id='sign-username']")
	WebElement username1;
	@FindBy(xpath = "//input[@id='sign-password']")
	WebElement password1;
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[2]")
	WebElement button1;
	@FindBy(xpath = "(//a[@href='#'])[3]")
	WebElement login;
	@FindBy(xpath = "//input[@id='loginusername']")
	WebElement username;
	@FindBy(xpath = "//input[@id='loginpassword']")
	WebElement password;
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
	WebElement button;
	@FindBy(xpath = "//a[@id='nameofuser']")
	WebElement Welcome;
	@FindBy(xpath = "//a[contains(text(),'Laptops')]")
	WebElement laptops;
	@FindBy(xpath = "//a[contains(text(),'Sony vaio i5')]")
	WebElement lap;
	@FindBy(xpath = "(//a[@href='#'])[7]")
	WebElement add2cart;
	@FindBy(xpath = "//a[contains(text(),'Cart')]")
	WebElement cart;
	@FindBy(xpath = "//button[contains(text(),'Place Order')]")
	WebElement placeorder;
	@FindBy(xpath = "//input[@id='name']")
	WebElement name;
	@FindBy(xpath = "//input[@id='country']")
	WebElement country;
	@FindBy(xpath = "//input[@id='city']")
	WebElement city;
	@FindBy(xpath = "//input[@id='card']")
	WebElement creditcart;
	@FindBy(xpath = "//input[@id='month']")
	WebElement month;
	@FindBy(xpath = "//input[@id='year']")
	WebElement year;
	@FindBy(xpath = "(//button[@class='btn btn-primary'])[3]")
	WebElement purchase;
	@FindBy(xpath = "//h2[contains(text(),'Thank you for your purchase!')]")
	WebElement orderconfirm;
	@FindBy(xpath ="//button[@class='confirm btn btn-lg btn-primary']")
	WebElement ok;
	@FindBy(xpath ="(//a[@href='#'])[4]")
	WebElement logout;
	
	
	
	public Store() {
		PageFactory.initElements(driver, this);
	}

	public void signup(String name, String pass) {
		
		signup.click();
		switchwindow();
		username1.sendKeys(name);
		password1.sendKeys(pass);
		button1.click();
		switchwindow();
		
	}
	public void login(String name,String pass) throws Exception {
		
		titlecheck();
		
		Elementcheck();
		
		Thread.sleep(1000);
		
		login.click();
		Thread.sleep(1000);
		
		switchwindow();
		
		username.sendKeys(name);
		password.sendKeys(pass);
		
		Thread.sleep(1000);
		
		button.click();
		
		Thread.sleep(4000);
		
		switchwindow();
		
		welcometitle();
		
	}

public void product() throws Exception {
	
	laptops.click();
	
	lap.click();
	
	Thread.sleep(2000);
	
	add2cart.click();
	
	cart.click();
	
	Thread.sleep(1000);
	
	cart();
	
	
}

public void order(String Name,String Country,String City,String Creditcard,String Month,String Year) throws Exception {
	
	placeorder.click();
	
	switchwindow();
	
	Thread.sleep(1000);
	
	name.sendKeys(Name);
	
	country.sendKeys(Country);
	
	city.sendKeys(City);
	
	creditcart.sendKeys(Creditcard);
	
	month.sendKeys(Month);
	
	year.sendKeys(Year);
	
	purchase.click();
	
	Thread.sleep(1000);
	
	Orderconfirmation();
	
	ok.click();
	
	Thread.sleep(1000);
	
	switchwindow();
	
	logout.click();
	
	homepage();
	
	
	
}

	
	
	
	
}
