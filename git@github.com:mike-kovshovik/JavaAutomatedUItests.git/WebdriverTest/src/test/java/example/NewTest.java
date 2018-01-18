package example;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTest {
	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeTest
	public void beforeTest()
	{
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
		driver.manage().window().fullscreen();
		driver.navigate().to("http://tut.by");
	}
	
	@Test
	public void simpleTest()
	{	
		
	}


	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}

}
