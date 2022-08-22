package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateContactInfosteps {
	WebDriver driver = null;
	
	@When("user clicks Update Contact Info")
	public void user_clicks_Update_Contact_Info() throws IOException {
	    driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[6]/a")).click();
	    TakesScreenshot tk = (TakesScreenshot) driver;
	    File s1 = tk.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(s1, new File("SeleniumScreenshot\\scr1.png"));
	    //Thread.sleep(3000);
	}

	@Then("user is navigated to the Update Contact Info  page")
	public void user_is_navigated_to_the_Update_Contact_Info_page() {
	    
	}


}
