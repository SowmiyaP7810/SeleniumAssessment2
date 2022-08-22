package stepdefinition;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.LoginPageBank_PF;

public class LoginBanksteps {
	WebDriver driver = null;
	LoginPageBank_PF login;
	
	@Given("browser is open")
	public void browser_is_open() {
        System.out.println("*****I am inside LoginBankSteps_PF class******");
		
		System.out.println("Inside Step - browser is open");
		String filePath = new File("chromedriver.exe").getAbsolutePath();
		System.setProperty("webdriver.chrome.driver", filePath);
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	    
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://parabank.parasoft.com/parabank/index.htm");
	    
	}

	@When("user enters Sowmiya and {int}")
	public void user_enters_Sowmiya_and(String username, String password) throws IOException {
		
        login = new LoginPageBank_PF(driver);
		login.enterUsername(username);
		login.enterPassword(password);
		TakesScreenshot tk = (TakesScreenshot) driver;
	    File s1 = tk.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(s1, new File("SeleniumScreenshot\\scr1.png"));
		
	    
	}

	@And("user clicks on login")
	public void user_clicks_on_login() {
		
		login.clickOnLogin();
	    
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws InterruptedException {
     
		driver.findElement(By.id("logout")).isDisplayed();
		Thread.sleep(2000);
		
	    
	}

//	@When("user enters Ramya and {int}")
//	public void user_enters_Ramya_and(String username, String password) {
//		login = new LoginPageBank_PF(driver);
//		login.enterUsername(username);
//		login.enterPassword(password);
		
	    
	}




