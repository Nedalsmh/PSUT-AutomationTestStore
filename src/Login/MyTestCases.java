package Login;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
	WebDriver driver = new ChromeDriver();
	String theURL="https://automationteststore.com/";
	String singnupPage="https://automationteststore.com/index.php?rt=account/create";
	Random rand = new Random ();
	
	
	@BeforeTest
	public void mysetup()
	{
		driver.get(theURL);
		driver.manage().window().maximize();
		
	}
	
	
	@Test (priority=1)
	public void signup() throws InterruptedException
	{		driver.get(singnupPage);
	
	//element
	WebElement firstNameInput= driver.findElement(By.xpath("//input[@id='AccountFrm_firstname']"));
	WebElement lastNameInput= driver.findElement(By.id("AccountFrm_lastname"));
	WebElement emailInput = driver.findElement(By.id("AccountFrm_email"));
	WebElement teleInput = driver.findElement(By.id("AccountFrm_telephone"));
	WebElement faxInput = driver.findElement(By.id("AccountFrm_fax"));
	
	WebElement companyInput = driver.findElement(By.id("AccountFrm_company"));
	WebElement address1Input = driver.findElement(By.id("AccountFrm_address_1"));
	WebElement address2Input = driver.findElement(By.id("AccountFrm_address_2"));
	WebElement cityInput = driver.findElement(By.id("AccountFrm_city"));
	WebElement postalcodeInput = driver.findElement(By.id("AccountFrm_postcode"));
	WebElement accountNameLoginInput = driver.findElement(By.id("AccountFrm_loginname"));
	WebElement passwordInput = driver.findElement(By.id("AccountFrm_password"));
	WebElement confirmPasswordInput = driver.findElement(By.id("AccountFrm_confirm"));
	WebElement subscribeInput = driver.findElement(By.id("AccountFrm_newsletter1"));
	WebElement agreeInput = driver.findElement(By.id("AccountFrm_agree"));
	//WebElement buttoncretae = driver.findElement(By.cssSelector(".btn.btn-orange.pull-right.lock-on-click"));
    WebElement buttoncretae = driver.findElement(By.cssSelector("button[title='Continue']"));
	
	
	
	WebElement countryInput = driver.findElement(By.id("AccountFrm_country_id"));
	WebElement stateInput = driver.findElement(By.id("AccountFrm_zone_id"));
	
	
	//Data
	String [] firstName= {"Rogina","Abeer","Roaa","Ahmad","Ali","Khalil","Laith","Yaser"};
	
	int myFirstNameIndex = rand.nextInt(firstName.length);
	
	String [] lastName= {"Ahmad","Ali","Khalil","Laith","Yaser"};
	int mylastNameIndex = rand.nextInt(lastName.length);
	int randonnumberforemail = rand.nextInt(7000);
			
	String email= firstName[myFirstNameIndex] +"." + lastName[mylastNameIndex] + randonnumberforemail + "@gmail.com" ;
	String tele="962" + rand.nextInt(99999999);
	String fax="06515897";
	String company = "JorMAll";
	String address1="Sweifieh";
	String address2="Khaled St.";
	String city="Amman";
	
	Thread.sleep(1000);
	
	int numberOfOptioscountry=countryInput.findElements(By.tagName("option")).size();
	Select myselecmySelectCountry = new Select(countryInput);
	//myselecmySelectCountry.selectByVisibleText("Jordan");
	int randomcountryIndex = rand.nextInt(1,numberOfOptioscountry);
	myselecmySelectCountry.selectByIndex(randomcountryIndex);
	
	Thread.sleep(1000);
	
	
	
	int numberOfOptios=stateInput.findElements(By.tagName("option")).size();
	Select myselecmySelectStatet = new Select(stateInput);
	int randomStateIndex = rand.nextInt(1,numberOfOptios);
	myselecmySelectStatet.selectByIndex(randomStateIndex);
	
	String postalcode="11191";
	String login = firstName[myFirstNameIndex] + lastName[mylastNameIndex]  + randonnumberforemail ;
	String pass = "New854$912";
			
	//Actions
	firstNameInput.sendKeys(firstName[myFirstNameIndex]);
	lastNameInput.sendKeys(lastName[mylastNameIndex]);
	emailInput.sendKeys(email);
	teleInput.sendKeys(tele);
	faxInput.sendKeys(fax);
	companyInput.sendKeys(company);
	address1Input.sendKeys(address1);
	address2Input.sendKeys(address2);
	cityInput.sendKeys(city);
	postalcodeInput.sendKeys(postalcode);
	accountNameLoginInput.sendKeys(login);
	passwordInput.sendKeys(pass);
	confirmPasswordInput.sendKeys(pass);
	subscribeInput.click();
	agreeInput.click();
	buttoncretae.click();
	}
	

	
}
