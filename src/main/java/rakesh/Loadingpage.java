package rakesh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loadingpage {
	
	WebDriver driver;
	
	public Loadingpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	
	//WebElement userEmail = driver.findElement(By.id("userEmail")).sendKeys("rakeshqatesting@gmail.com");
	//driver.findElement(By.id("userPassword")).sendKeys("Rakesh@123");
	//driver.findElement(By.id("login")).click();
	
	@FindBy(id="userEmail")
	WebElement userEmail;
	
	@FindBy(id="userPassword")
	WebElement userpassword;
	
	@FindBy(id="login")
	WebElement submit;
	
	public void loginapp(String username, String password)
	{
		userEmail.sendKeys(username);
		userpassword.sendKeys(password);
		
	}
	
	public void login()
	{
		submit.click();
	}
	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
	}
}
