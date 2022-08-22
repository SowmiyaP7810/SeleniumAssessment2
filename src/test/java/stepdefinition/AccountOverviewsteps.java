package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountOverviewsteps {
	
	WebDriver driver = null;
	
	@When("user clicks Account Overview")
	public void user_clicks_Account_Overview() {
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a")).click();
	    
	}

	@Then("user is navigated to the Account Overview page")
	public void user_is_navigated_to_the_Account_Overview_page() {
	    
	}


}
