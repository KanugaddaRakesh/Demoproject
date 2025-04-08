package rakesh;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;  //using javascript executor to scroll the window.
		
		Loadingpage loadingpage = new Loadingpage(driver);
		Productcatalog pcat=new Productcatalog(driver);
		loadingpage.goTo();
		loadingpage.loginapp("rakeshqatesting@gmail.com", "Rakesh@123");
		loadingpage.login();
		Thread.sleep(2000);
		pcat.p1();
		pcat.Checkout();
		
		
		
	}

}
