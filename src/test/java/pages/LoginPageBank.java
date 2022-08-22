	package pages;
	
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	
	public class LoginPageBank {
		
		protected WebDriver driver;
	
		private By txt_username = By.xpath("//*[@id=\\\"loginPanel\\\"]/form/div[1]/input");
		
		private By txt_password = By.xpath("//*[@id=\\\"loginPanel\\\"]/form/div[2]/input");
		
		private By btn_login = By.xpath("//*[@id=\\\"loginPanel\\\"]/form/div[3]/input");
		
		private By btn_logout = By.xpath("//*[@id=\"leftPanel\"]/ul/li[8]/a");
		
		
		public LoginPageBank(WebDriver driver) {
		
			this.driver = driver;
			
			if(!driver.getTitle().equals("ParaBank")) {
				
				throw new IllegalStateException("This is not Login Page. The Current page is "
				+driver.getCurrentUrl());
			}
		}
		
		
		public void enterUsername(String username) {
			
			driver.findElement(txt_username).sendKeys(username);
		}
		
		public void enterPassword(String password) {
			
			driver.findElement(txt_password).sendKeys(password);
		}
		
		public void clickLogin() {
			
			driver.findElement(btn_login).click();
		}
		
		public void checkLogOutIsDisplayed() {
			
			driver.findElement(btn_logout).isDisplayed();
		}
		
		public void loginValidUser(String username, String password) {
			
			driver.findElement(txt_username).sendKeys(username);
			driver.findElement(txt_password).sendKeys(password);
			driver.findElement(btn_login).click();
		}
		
	
	}
