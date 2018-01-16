package oldLaunchpad;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExceldataConfig;

public class Workflow {
	WebDriver driver;
	@Test(dataProvider="wordpress")
	public void Datadriven(String username, String password) throws InterruptedException
	{
		
	
	System.setProperty("webdriver.chrome.driver", "C://Sachin//Sachin//Selenium/chromedriver.exe");
	
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demosite.center/wordpress/wp-login.php");
		
		driver.findElement(By.id("user_login")).sendKeys(username);
		driver.findElement(By.id("user_pass")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id='wp-submit']")).click();
		
	}
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}

@DataProvider(name="wordpress")
public Object[][] passdata()
{
	
	ExceldataConfig excel=new ExceldataConfig("C:\\Sachin\\Sachin\\Selenium\\testdata.xlsx");
	int Row=excel.getRowcount(0);
	Object[][] data=new Object[Row][2];
	for(int i=0;i<Row;i++)
	{
		data[i][0]=excel.getData(0, i,0);
		data[i][1]=excel.getData(0, i,1);

	}
	return data;
	
}
	
	}



