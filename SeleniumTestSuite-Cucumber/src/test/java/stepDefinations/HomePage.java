package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;

public class HomePage {

	
	@Given("clicks on Dress button")
	public void clicks_on_Dress_button() {
		TestBase.getDriver().findElement(By.xpath("(//a[@title='Dresses'])[2]")).click();
	}

	@Given("mouse over on first printed dress product")
	public void mouse_over_on_first_printed_dress_product() {
	    WebElement e = TestBase.getDriver().findElement(By.xpath("(//img[@title='Printed Dress'])[1]"));
	    Actions actions = new Actions(TestBase.getDriver());
	    actions.moveToElement(e).build().perform();
	    TestBase.getDriver().findElement(By.className("quick-view")).click();
	    
	}

	
}
