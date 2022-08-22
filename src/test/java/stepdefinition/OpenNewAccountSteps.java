package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenNewAccountSteps {
	WebDriver driver = null;
	@Given("user is logged into the page")
	public void user_is_logged_into_the_page() {
		
		Assert.assertTrue(driver.findElement(By.cssSelector("#leftPanel > ul > li:nth-child(1) > a")).isSelected());
	}

	@When("user clicks Open New Account")
	public void user_clicks_Open_New_Account() {
		
	    driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[1]/a")).click();
	}

	@Then("user is navigated to the opennewaccount page")
	public void user_is_navigated_to_the_opennewaccount_page() throws IOException {
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/div/input")).click();
		TakesScreenshot tk = (TakesScreenshot) driver;
	    File s1 = tk.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(s1, new File("SeleniumScreenshot\\scr1.png"));
	    
	}


}
//Assert.assertFalse(true);  
