package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	WebDriver driver;

	public LoginPageFactory(WebDriver d) {
		driver = d;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="user-name") 
	WebElement username;
	
	@FindBy(id="password") 
	WebElement password;
	
	@FindBy(id="login-button") 
	WebElement loginbutton;
	
	public void enterUsername(String uname) {
		username.sendKeys(uname);
	}
	
	public void enterPassword(String upass) {
		password.sendKeys(upass);
	}
	
	public void clickLoginButton() {
		loginbutton.click();
	}
}
