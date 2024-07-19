import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browseractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/practice-project");
driver.navigate().to("https://www.google.com");
System.out.println(driver.getTitle());
driver.navigate().back();
System.out.println(driver.getTitle());
driver.navigate().forward();
System.out.println(driver.getTitle());
driver.manage().window().minimize();
driver.close();
	}

}
