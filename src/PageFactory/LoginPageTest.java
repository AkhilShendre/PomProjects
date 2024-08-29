package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginPageTest {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.saucedemo.com");
		
		LoginPageFactory pg = new LoginPageFactory(driver);
		pg.enterUsername("standard_user");
		pg.enterPassword("secret_sauce");
		pg.clickLoginButton();

	}

}
