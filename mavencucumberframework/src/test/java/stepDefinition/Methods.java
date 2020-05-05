package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Methods {


	WebDriver driver;

	@Given("^Open chrome$")
	public void Open_chrome() throws Throwable {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anshu kumar\\Desktop\\Setup\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://www.linkedin.com/login");
		driver.manage().window().maximize();    
	}
	//@When("^I enter valid username and valid password$")
	//public void I_enter_valid_username_and_valid_password() throws Throwable {


	//	driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("aksinha1207@linked");

	//driver.findElement(By.xpath("//input[@id='password']")).sendKeys("link@1207");
	//Thread.sleep(2000);

	//below is parameter o methoud in username and password 

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void I_enter_valid_username_and_valid_password(String username, String password) throws Throwable {


		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys(username);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		Thread.sleep(2000);

	} 
	@Then("^User should be able to login$")
	public void User_should_be_able_to_login() throws Throwable {

		driver.findElement(By.xpath("//button[@class='btn__primary--large from__button--floating']")).click();

	}








}