package pagefactory;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPageBank_PF {
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[1]/input")
	@CacheLookup
	WebElement txt_username;
	
	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[2]/input")
	WebElement txt_password;

	@FindBy(xpath="//*[@id=\"loginPanel\"]/form/div[3]/input")
	WebElement btn_login;
	
	@FindBy(partialLinkText = "Sowmiya")
	List<WebElement> myLinks;
	
	@FindBy(how = How.XPATH, using = "name")
	WebElement abc;
	
	WebDriver driver;
	
	public LoginPageBank_PF(WebDriver driver) {
		this.driver = driver;
		
		
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	}
	
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickOnLogin() {
		btn_login.click();
	}

}
