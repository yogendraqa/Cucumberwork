package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Commom {
	private WebDriver driver;
	
	@Before
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@After
	public void Teardown() throws InterruptedException {
		//driver.quit();
		//Thread.sleep(5000);
	}
	
	public WebDriver getDriver() {
		
		return driver;
		
	}

}
