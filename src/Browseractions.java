import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browseractions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://rahulshettyacademy.com/practice-project");
driver.navigate().to("https://www.google.com");
driver.navigate().back();
driver.navigate().forward();
driver.manage().window().minimize();
driver.close();
	}

}
