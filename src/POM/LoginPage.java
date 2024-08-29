package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver d) {
		driver = d;
	}
	
	By usename = By.id("user-name");
	By password = By.id("password");
	By loginbutton = By.id("login-button");
	
	
	public void enterUsername(String uname) {
		driver.findElement(usename).sendKeys(uname);
	}
	
	public void enterPassword(String upass) {
		driver.findElement(password).sendKeys(upass);
	}
	
	public void clickLoginButton() {
		driver.findElement(loginbutton).click();
	}
	
}
