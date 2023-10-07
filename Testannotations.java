package TestNGpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testannotations {
	
	WebDriver obj;
	
	@BeforeMethod
	void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HAI\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		obj = new ChromeDriver();
	}
	
	@AfterMethod
	void closeBrowser() throws InterruptedException
	{
		Thread.sleep(8000);
		obj.close();
	}
	
	@Test(priority = 1)
	void invalidPwd() throws InterruptedException {
	
	obj.get("https://www.facebook.com");
	WebElement username = obj.findElement(By.id("email"));
	WebElement pwd = obj.findElement(By.id("pass"));
	WebElement lb = obj.findElement(By.name("login"));
	
	Thread.sleep(3000);
	username.sendKeys("8778056612");
	pwd.sendKeys("Vign@8428");
	lb.click();
	Thread.sleep(3000);
	}
	
	@Test(priority = 2)
	void invalidUN() throws InterruptedException {
	
	obj.get("https://www.facebook.com");
	WebElement username = obj.findElement(By.id("email"));
	WebElement pwd = obj.findElement(By.id("pass"));
	WebElement lb = obj.findElement(By.name("login"));
	
	Thread.sleep(3000);
	username.sendKeys("8300912802");
	pwd.sendKeys("banu123@");
	lb.click();
	Thread.sleep(3000);
	}
	
	@Test(priority = 3)
	void validCreds() throws InterruptedException {
	
	obj.get("https://www.facebook.com");
	WebElement username = obj.findElement(By.id("email"));
	WebElement pwd = obj.findElement(By.id("pass"));
	WebElement lb = obj.findElement(By.name("login"));
	
	Thread.sleep(3000);
	username.sendKeys("8778056612");
	pwd.sendKeys("banu123@");
	lb.click();
	Thread.sleep(3000);
	}
	
	@Test(priority = 4)
	void signout() throws InterruptedException {
	
	obj.get("https://www.facebook.com");
	WebElement username = obj.findElement(By.id("email"));
	WebElement pwd = obj.findElement(By.id("pass"));
	WebElement lb = obj.findElement(By.name("login"));
	
	Thread.sleep(3000);
	username.sendKeys("8778056612");
	pwd.sendKeys("banu123@");
	lb.click();
	Thread.sleep(3000);
	
	WebElement moreOption = obj.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div[1]/div[1]/span/div/i"));
    moreOption.click();
    
    Thread.sleep(3000);
    WebElement logout = obj.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div/div/div[1]/div[2]/div/div/div/div/span"));
    logout.click();
	}

}
