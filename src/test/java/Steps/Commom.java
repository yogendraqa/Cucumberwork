package Steps;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Commom {
	private WebDriver driver;
	
	@BeforeClass
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void Teardown() throws InterruptedException {
		//driver.quit();
		//Thread.sleep(20000);
	}
	
	public WebDriver getDriver() {
		
		return driver;
		
	}

}
