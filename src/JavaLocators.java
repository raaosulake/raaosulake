
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;



public class JavaLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password=getPassword(driver);
		System.out.println(password);
		driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("sunarao");
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("CSSPlaceholder");
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("XpathPlaceholder");
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys("CSSId");
		Thread.sleep(1000);
		driver.findElement(By.id("inputUsername")).clear();
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("XpathId");
		driver.findElement(By.name("inputPassword")).sendKeys("name@123");
		Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).clear();
		driver.findElement(By.cssSelector("input[type*='Pass']")).sendKeys("RegEx");
		Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).clear();
		driver.findElement(By.cssSelector("input[type^='PASsword']")).sendKeys("CSSRegEx");
		Thread.sleep(1000);
		driver.findElement(By.name("inputPassword")).clear();
		driver.findElement(By.cssSelector("input[type*='passw']")).sendKeys("CSSRegEx*");
		driver.findElement(By.className("signInBtn")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//driver.findElement(By.linkText("Forgot your password?")).click();
		//driver.findElement(By.partialLinkText("Forgot your passw")).click();
		driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	//	driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Raosulake");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Raaosulake");
		driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("raaosulake@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9959660245");
		driver.findElement(By.xpath("//button[contains(.,'Reset Login')]")).click();
		driver.findElement(By.cssSelector("button.go-to-login-btn"));
		
	//	driver.findElement(By.xpath("//button[normalize-space()='Go to Login']")).click();

		driver.findElement(By.cssSelector("input[id='inputUsername']")).sendKeys("Raaosulake");
		

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		//driver.findElement(By.xpath("//button[contains(.,'Sign In')]")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
	//System.out.println(driver.findElement(By.xpath("//p[contains(normalize-space(),'You are ')]")).getText());
		
Assert.assertEquals(driver.findElement(By.xpath("//p[contains(normalize-space(),'You are ')]")).getText(), "You are successfully logged in.");
driver.findElement(By.xpath("//button")).click();
driver.quit();
	}
public static String getPassword(WebDriver driver) throws InterruptedException
{
	driver.get("http://www.rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[contains(.,'Reset Login')]")).click();
String pwd=	driver.findElement(By.xpath("//form/p")).getText();
//Please use temporary password 'rahulshettyacademy' to Login.
String[] Pwdsplit=pwd.split("'");
	//0-th index=Please use temporary password
//1st index='rahulshettyacademy' to Login.
String password= Pwdsplit[1].split("'")[0];
return password;

}
}
