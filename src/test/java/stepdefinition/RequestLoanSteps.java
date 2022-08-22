package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RequestLoanSteps {

	WebDriver driver = null;

	@When("user clicks Request Loan")
	public void user_clicks_Request_Loan() {
		driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[7]/a")).click();
	    
	}

	@And("user enters {int} and {int} and {int}")
	public void user_enters_and_and(Integer int1, Integer int2, Integer int3) {
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("40000");
		driver.findElement(By.xpath("//*[@id=\"downPayment\"]")).sendKeys("3000");
		Assert.assertFalse(true);  

	    
	}

//	@Then("user is navigated to the Request Loan page")
//	public void user_is_navigated_to_the_Request_Loan_page() {
//	    
//	}

	@And("clicks the apply now")
	public void clicks_the_apply_now() throws IOException {
		driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/div/div/form/table/tbody/tr[4]/td[2]/input")).click();
		
			TakesScreenshot tk = (TakesScreenshot) driver;
		    File s1 = tk.getScreenshotAs(OutputType.FILE);
		    FileHandler.copy(s1, new File("SeleniumScreenshot\\scr1.png"));
	    
	}


}
