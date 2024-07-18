import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//WebElement staticdropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		dropdown.selectByIndex(3);
		dropdown.selectByVisibleText("INR");
		dropdown.selectByValue("AED");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(2000);
	//driver.findElement(By.id("hrefIncAdt")).click();

//	int i=1;
//	//int i=1 here, why becoz already one Adult exists by default.
//	while(i<5)
//	{
//		driver.findElement(By.id("hrefIncAdt")).click();
//		
//		i++;
//	}
	

	 for(int i=1; i<5;i++) 
	 { 
		 driver.findElement(By.id("hrefIncAdt")).click();
	  
	 }
	 
	driver.findElement(By.id("btnclosepaxoption")).click();
	
}

		
}
