package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_LoginPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.saucedemo.com");
		
		LoginPage pg = new LoginPage(driver);
		pg.enterUsername("standard_user");
		pg.enterPassword("secret_sauce");
		pg.clickLoginButton();

	}

}
                           