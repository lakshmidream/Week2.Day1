package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		String loginTitle=driver.getTitle();
		System.out.println("Page Tile is is" + loginTitle);
		
		
		WebElement userName = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		
		userName.sendKeys("demosalesmanager");
		password.sendKeys("crmsfa");
		loginButton.click();
		
				
		String crmsfapage=driver.getTitle();
		System.out.println("The Tiltle of the page is " + crmsfapage);
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		WebElement leadslink = driver.findElement(By.linkText("Leads"));
		leadslink.click();
		
		WebElement createLeadLink = driver.findElement(By.linkText("Create Lead"));
		createLeadLink.click();
		String createLeadTitle=driver.getTitle();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SEP11_CompanyName");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SEP11_LastName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("SEP11_Firstname");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SEP11_LocalFN");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("SEP11_LocalLN");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("SEP11_PersonalTitle");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SEP11_ProfTitle");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Sep11_DeptName");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("100000");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("200");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("CODE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("SEP11_DESC");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("sep11_symbol");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("SEP11_Notes");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("CHN");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12345");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567890");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("1234567890");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("test.com");
//		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("SEP11_NAME");
//		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("SEP11_NAME");
//		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("ADD1");
//driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("ADD2");
//		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("SEP11");
//		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600053");
//		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("1234");
//		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).clear();
		driver.findElement(By.name("submitButton")).click();
		
		String leadFirstName = driver.findElement(By.id("viewLead_firstName_sp")).getAttribute("class");	
		
		System.out.println("FirstName of the lead is" +leadFirstName);
		String leadPage=driver.getTitle();
		System.out.println("Lead Page is created and the tiltle is " +leadPage );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
