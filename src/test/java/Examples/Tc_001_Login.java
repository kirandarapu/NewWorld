package Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Tc_001_Login {
	
	public static WebDriver driver;
	public static void main(String[] args) {
	
		
		//Headless testing
		ChromeOptions co=new ChromeOptions();
//		co.setHeadless(true);
		
		//launching the webbrowser
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
//		driver=WebDriverManager.chromedriver().capabilities(co).create();
////		driver=new ChromeDriver(co);
		 
		 //open the application
		 driver.get("https://www.google.com/");
		 
		 driver.findElement(By.name("q")).sendKeys("selenium");
		 System.out.println("text is entered");
		 

		
	}
	
	
}
