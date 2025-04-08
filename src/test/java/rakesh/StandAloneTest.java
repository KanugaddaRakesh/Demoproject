package rakesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;  //using javascript executor to scroll the window.
		
		Loadingpage loadingpage = new Loadingpage(driver);
		
		driver.findElement(By.id("userEmail")).sendKeys("rakeshqatesting@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Rakesh@123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='container']//div[1]//div[1]//div[1]//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='container']//div[2]//div[2]//div[1]//button[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='container']//div[3]//div[1]//div[1]//button[2]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("button[routerlink='/dashboard/cart']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,950)");
	    driver.findElement(By.xpath("/html/body/app-root/app-profile/div/div[3]/ul/li[3]/button")).click();
		
		
	}

}
