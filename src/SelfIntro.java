import java.util.ArrayList;
import java.util.Arrays;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SelfIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Chrome - ChromeDriver --> Methods
		//ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Desktop\\MY Projects\\ChromeDriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://rahulshettyacademy.com/");
		
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.close();
		
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("rahul");
		arr.add("shetty");
		arr.add("academy");
		System.out.println(arr.get(2));
		for (int i=0; i<arr.size();i++)
		{
			
			System.out.println(arr.get(i));
		}
		System.out.println("*******");
		for(String a:arr)
		{
			System.out.println(a);
		}
	}
	
	String[] Arr= {"ra","she","aca"};
	
	




	}