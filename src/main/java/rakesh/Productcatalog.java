package rakesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productcatalog {
	
	WebDriver driver;
	
	public Productcatalog(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	//WebElement userEmail = driver.findElement(By.id("userEmail")).sendKeys("rakeshqatesting@gmail.com");
	//driver.findElement(By.id("userPassword")).sendKeys("Rakesh@123");
	//driver.findElement(By.id("login")).click();
	
	@FindBy(xpath="//div[@class='container']//div[1]//div[1]//div[1]//button[2]")
	WebElement product1;
	
	@FindBy(xpath="//div[@class='container']//div[2]//div[2]//div[1]//button[2]")
	WebElement product2;
	
	@FindBy(xpath="//div[@class='container']//div[3]//div[1]//div[1]//button[2]")
	WebElement product3;
	
	@FindBy(css="button[routerlink='/dashboard/cart']")
	WebElement checkout;
	
	//driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']")).click();
	
	
	public void p1() throws InterruptedException
	{
		product1.click();
		Thread.sleep(2000);
		product2.click();
		Thread.sleep(2000);
		product3.click();
		Thread.sleep(2000);
	}
	
	public void Checkout()
	{
		checkout.click();
	}
	
}
