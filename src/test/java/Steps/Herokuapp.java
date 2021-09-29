package Steps;

import org.eclipse.jetty.client.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Iterator;
import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import okhttp3.internal.http1.Http1Codec;

public class Herokuapp {
	WebDriver driver;
	String actURL;
	String url = "";
	HttpURLConnection huc = null;
	int respCode = 200;

	public Herokuapp(Commom commom) {
		this.driver = commom.getDriver();
	}

	@Given("I am on Herokuapp")
	public void i_am_on_herokuapp() {
		System.out.println("I am on Herokuapp");
		driver.get("http://the-internet.herokuapp.com/");
	}

	@When("I click on add\\/remove element")
	public void i_click_on_add_remove_element() {
		driver.findElement(By.cssSelector("a[href=\"/add_remove_elements/\"]")).click();
	}

	@When("I get navigate to add remove element page")
	public void i_get_navigate_to_add_remove_element_page() {
		actURL = driver.getCurrentUrl();
		String expURL = "http://the-internet.herokuapp.com/add_remove_elements/";
		assertEquals(actURL, expURL);
		System.out.println("I am on AddRemove element page");
	}

	@Then("I click on Add element button")
	public void i_click_on_add_element_button() throws InterruptedException {
		driver.findElement(By.cssSelector("button[onclick=\"addElement()\"]")).click();
		System.out.println("I click on Add element button");
		Thread.sleep(3000);
	}

	@Then("I click on Delete button")
	public void i_click_on_delete_button() {
		driver.findElement(By.cssSelector("button[class=\"added-manually\"]")).click();
	}

	@When("I click on Basic Auth")
	public void i_click_on_basic_auth() throws InterruptedException {
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href=\"/basic_auth\"]")).click();
		Thread.sleep(5000);
	}

	@When("I get navigated to Basic Auth page")
	public void i_get_navigated_to_basic_auth_page() {
		String expectedURL = "http://the-internet.herokuapp.com/basic_auth";
		String R = driver.getCurrentUrl();
		assertEquals(expectedURL, R);
	}

	@Then("I enter {string} in {int} in the given field")
	public void i_enter_in_in_the_given_field(String string, Integer int1) {
		System.out.println("Can't select locator");
	}

	@Then("I click on Sign in button")
	public void i_click_on_sign_in_button() {
		System.out.println("Can't select locator");
	}

	@When("I click on broken images button")
	public void i_click_on_broken_images_button() {
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href=\"/broken_images\"]")).click();

	}

	@When("I get navigated to br images page")
	public void i_get_navigated_to_br_images_page() {
		String q = driver.getCurrentUrl();
		String w = "http://the-internet.herokuapp.com/broken_images";
		assertEquals(w, q);

	}

	@Then("I get to Broken and valid Images")
	public void i_get_to_broken_and_valid_images() 
	{
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		Iterator<WebElement> it = images.iterator();
		url = it.next().getAttribute("src");
		if (url == null || url.isEmpty()) {
			System.out.println("URL is either not configured for anchor tag or it is empty");
			continue;
		}
		if (!url.startsWith("asdf.jpg")) {
			System.out.println("URL belongs to another domain, skipping it.");
			continue;
		}
		huc = (HttpURLConnection) (new URL(url).openConnection());
		huc.setRequestMethod("HEAD");
		huc.connect();
		respCode = huc.getResponseCode();
		if (respCode >= 400) {
			System.out.println(url + " is a broken link");
		} else {
			System.out.println(url + " is a valid link");
		}
	}
}
}
