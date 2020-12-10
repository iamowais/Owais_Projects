package Selenium.AutomationFw;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import resources.Base;

public class Homepage extends Base {
	
	@Test(dataProvider="getData")
	public void openApplication(String a,String b, String c) throws IOException
	{
		driver=getBrowserDriver();
		driver.manage().window().maximize();
		driver.get(AppUrl);
		
		LoginPage lp=new LoginPage(driver);
		lp.getUsername().sendKeys(a);
		lp.getPassword().sendKeys(b);
		System.out.println(c);
		
		
		
		
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		//imp 2X3 
		Object[][] data= new Object[2][3];
		data[0][0]="2359154";
		data[0][1]="goCorona67!!";
		data[0][2]="Incorrect Password";
		
		data[1][0]="2359158";
		data[1][1]="GoCorona67!!";
		data[1][2]="correct Password";
		
		return data;
	}
	
	@AfterTest
	public void closeDriver() {
		driver.close();
	}

}
