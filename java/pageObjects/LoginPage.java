package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class LoginPage {
	public WebDriver driver;
	//Objects Description here
	By username=By.id("textfield");
	By password=By.cssSelector("input[name=\"password\"]");


	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}

	@Test
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}


}
