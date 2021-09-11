package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFunctionality {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		System.out.println("Title of the page is" + title);
		
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		
		WebElement logibbtn = driver.findElement(By.className("decorativeSubmit"));
		logibbtn.click();
		
		WebElement crmsfalink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfalink.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
