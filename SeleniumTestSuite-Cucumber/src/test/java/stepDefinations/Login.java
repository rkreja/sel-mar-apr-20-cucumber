package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	WebDriver driver;
	
	@Before
	public void invokeDriver() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	@After
	public void closeDriver() {
		
		driver.close();
	}
	
	
	
	@Given("user naviagtes to {string}")
	public void user_naviagtes_to_http_www_automationpractice_com(String url) {
		
		
		
	    driver.get(url);	}

	@Given("click on top signin button")
	public void click_on_top_signin_button() {
	    driver.findElement(By.className("login")).click();
	}

	@Given("enter userid {string}")
	public void enter_userid(String string) {
	    driver.findElement(By.id("email")).sendKeys(string);
	}

	@Given("enter password {string}")
	public void enter_password(String string) {
	    driver.findElement(By.id("passwd")).sendKeys(string);
	}

	@Given("click on signin button")
	public void click_on_signin_button() {
	    driver.findElement(By.id("SubmitLogin")).click();
	}

	@Then("verify text displays {string}, and {string}")
	public void verify_text_displays_and(String string, String string2) {
	    
		String errMsg =driver.findElement(By.xpath("//div[contains(@class,'alert-danger')]")).getText();
		Assert.assertEquals("Check error message displays: "+ string, true, errMsg.contains(string));
		Assert.assertEquals("Check error message displays: "+ string2, true, errMsg.contains(string2));
		
	}
	
	
	@Then("verify welcome message displays {string}")
	public void verify_welcome_message_displays(String string) {
	    
		String msg = driver.findElement(By.className("info-account")).getText();
		Assert.assertEquals("Check user is succcessfully logged in and welcome and "
				+ "welcome message displayed.", true, msg.contains(string));
	}
	
	
	@And("enter email address {string} to create an account")
	public void enter_email_address_abc987mailinatorcom_to_create_an_account(String string) throws Throwable {
		
		driver.findElement(By.id("email_create")).sendKeys(string);
		Thread.sleep(3000);
		

	}
	
	
	@Given("click on create an account button")
	public void click_on_create_an_account_button() {
	    driver.findElement(By.id("SubmitCreate")).click();
	}
	
	
	
	
	
	
	@Then("user enter firstname {string}")
	public void user_enter_firstname(String string) {
	    driver.findElement(By.id("customer_firstname")).sendKeys(string);
	}

	@Then("user enter lastname {string}")
	public void user_enter_lastname(String string) {
		driver.findElement(By.id("customer_lastname")).sendKeys(string);
	}

	@Then("user enter password {string}")
	public void user_enter_password(String string) {
		driver.findElement(By.id("passwd")).sendKeys(string);
	}

	@Then("user enter address {string}")
	public void user_enter_address(String string) {
		driver.findElement(By.id("address1")).sendKeys(string);
	}

	@Then("user enter city {string}")
	public void user_enter_city(String string) {
		driver.findElement(By.id("city")).sendKeys(string);
	}

	@Then("user select state {string}")
	public void user_select_state(String string) {
		WebElement dropDown = driver.findElement(By.id("id_state"));
		Select s = new Select(dropDown);
		s.selectByVisibleText(string);
	}

	@Then("user enter zipcode {int}")
	public void user_enter_zipcode(int zip) {
		driver.findElement(By.id("postcode")).sendKeys(Integer.toString(zip));
	}

	@Then("enter mobile number {string}")
	public void enter_mobile_number(String string) {
		driver.findElement(By.id("phone_mobile")).sendKeys(string);
	}

	@Then("click register button")
	public void click_register_button() {
		driver.findElement(By.id("submitAccount")).click();

		
	}

	@Then("verify user successfully created")
	public void verify_user_successfully_created() {
	  WebElement msgHolder =driver.findElement(By.xpath("//*[contains(text(),'Welcome to your account. Here you can manage all of your personal information and orders.')]"));
	Assert.assertNotNull("Verify user successfully created and welcome message displayed", msgHolder);
		
	}


	
}
