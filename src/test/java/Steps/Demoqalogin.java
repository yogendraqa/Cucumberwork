package Steps;

import org.openqa.selenium.By;

import static org.junit.Assert.*;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Demoqalogin {
	WebDriver driver;

	public Demoqalogin(Commom commom) {
		this.driver = commom.getDriver();
	}

	@Given("I am on Demoqa login page")
	public void i_am_on_demoqa_login_page() {
		driver.get("https://demoqa.com/login");
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
		assertEquals(R, "Register");
		// Assert.assertTrue(headerText, "App is hunged from last 60 seconds due to
		// spinner");
	}

	@Given("I am on Demoqa registration page")
	public void i_am_on_demoqa_registration_page() {
		System.out.println("I am on Demoqa registration page");
	}

	@When("I enter {string} and {string} and {string} and {string} field")
	public void i_enter_and_and_and_field(String string, String string2, String string3, String string4)
			throws InterruptedException {
		driver.get("https://demoqa.com/register");
		// WebDriver driver = this.driver;
		WebElement firstName = driver.findElement(By.cssSelector("#firstname"));
		WebElement lastName = driver.findElement(By.cssSelector("#lastname"));
		WebElement Username = driver.findElement(By.cssSelector("#userName"));
		WebElement password = driver.findElement(By.cssSelector("#password"));
		firstName.sendKeys(string);
		lastName.sendKeys(string2);
		Username.sendKeys(string3);
		password.sendKeys(string4);
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.id("register")).click();

		// System.out.println("I enter Yogendra in the FirstName field");
		// System.out.println("I enter Vashishtha in the LastName field");
		// System.out.println("I enter Yogi in the UserName field");
		// System.out.println("I enter Basketball@1998 in the password field");
	}

	@Then("I click on Register")
	public void i_click_on_register() {
		WebElement registerr = driver.findElement(By.id("register"));
		registerr.click();
	}

	@Given("I am on Registration Page")
	public void i_am_on_registration_page() {
		driver.get("https://demoqa.com/register");
		// System.out.println("Hi");
	}

	@When("I click on Book Store")
	public void i_click_on_book_store() {
		WebElement Nested = driver.findElement(By.xpath(
				"//div[text()='Book Store Application']/../../..//div[@class='element-list collapse show']//li[@id='item-2']"));
		System.out.println(Nested.getText());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click()", Nested);
	}

	@Then("I get navigate to book search page")
	public void i_get_navigate_to_book_search_page() {
		// System.out.println("Hi");
		String expurl = "https://demoqa.com/books";
		String acturl = driver.getCurrentUrl();
		if (!expurl.equals(acturl)) {
			fail("The result wasn't expected brooooo");
		}

	}

}
