package Steps;

import org.openqa.selenium.By;

import static org.junit.Assert.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demoqalogin {
	WebDriver driver;

	@Given("I am on Demoqa login page")
	public void i_am_on_demoqa_login_page() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/login");
		driver.manage().window().maximize();
	}

	@When("I click on NewUser")
	public void i_click_on_new_user() {
		WebElement Newuserbutton = driver.findElement(By.cssSelector("#newUser"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,50)", "");
		Newuserbutton.click();

	}

	@Then("I get navigate to Registeration Page")
	public void i_get_navigate_to_registeration_page() {
		String R;
	 WebElement headerText = driver.findElement(By.cssSelector(".main-header"));
	  R = headerText.getText();
	 assertEquals (R, "Register");
	 //Assert.assertTrue(headerText, "App is hunged from last 60 seconds due to spinner");
	}

	@Given("I am on Demoqa registration page")
	public void i_am_on_demoqa_registration_page() {
		System.out.println("I am on Demoqa registration page");
	}  //////////////////////////doubt

	@When("I enter {string} in the {string} field")
	public void i_enter_in_the_field(String string, String string2) throws InterruptedException {
		WebElement firstName = driver.findElement(By.cssSelector("#firstname"));
		WebElement lastName = driver.findElement(By.cssSelector("#lastname"));
		WebElement Username = driver.findElement(By.cssSelector("#userName"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		firstName.sendKeys("Yogendra");
		lastName.sendKeys("Vashishtha");
		Username.sendKeys("yogi");
		password.sendKeys("yogi1998");
		Thread.sleep(5000);
		driver.findElement(By.id("register")).click();

		//System.out.println("I enter Yogendra in the FirstName field");
		//System.out.println("I enter Vashishtha in the LastName field");
		//System.out.println("I enter Yogi in the UserName field");
		//System.out.println("I enter Basketball@1998 in the password field");
	}

	@Then("I click on Register")
	public void i_click_on_register() {
		WebElement registerr = driver.findElement(By.id("register"));
		registerr.click();
	}

}
