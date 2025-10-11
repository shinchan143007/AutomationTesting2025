package Day1.TestWebBrouserC;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestWebeBrouseAA {
	
	WebDriver driver;
	
	
	@Test(priority=1)
	void open()
	{
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	@Test(priority=2)
	void logo() throws InterruptedException
	{
		Thread.sleep(3000);
		boolean disp = driver.findElement(By.xpath("//img[@alt='company-branding'] ")).isDisplayed();
		System.out.println("Logo is Displyed:-" + disp);
	}
	@Test(priority=3)
	void login() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(By.xpath(" //input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath(" //input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath(" //button[normalize-space()='Login']")).click();
		
	}

}
