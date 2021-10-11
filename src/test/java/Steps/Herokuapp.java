package Steps;

//import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.WebElementDescriber;

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
		// driver.findElement(By.cssSelector("a[href=\"/basic_auth\"]")).click();
		Thread.sleep(5000);
	}

	@When("I get navigated to Basic Auth page")
	public void i_get_navigated_to_basic_auth_page() {
		// String expectedURL = "http://the-internet.herokuapp.com/basic_auth";
		// String R = driver.getCurrentUrl();
		// assertEquals(expectedURL, R);
		System.out.println("I get navigated to Basic Auth page");
	}

	@Then("I enter {string} and {string} in the given field")
	public void i_enter_in_in_the_given_field(String string, String string1) {
		driver.get("http://" + string + ":" + string1 + "@the-internet.herokuapp.com/basic_auth");
		System.out.println("done");
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
	public void i_get_to_broken_and_valid_images() throws MalformedURLException, IOException {
		WebElement images = driver.findElement(By.tagName("img"));
		// System.out.println(images.size());
		// Iterator<WebElement> it = images.iterator();
		url = images.getAttribute("src");
		System.out.println(url);
		if (url == null || url.isEmpty()) {
			System.out.println("URL is either not configured for anchor tag or it is empty");
			// continue;
		}

		if (!url.startsWith("asdf.jpg")) {
			System.out.println("URL belongs to another domain, skipping it.");

		}
		huc = (HttpURLConnection) (new URL(url).openConnection());
		huc.setRequestMethod("HEAD");
		huc.connect();
		System.out.println(huc.getResponseCode() + ", " + huc.getResponseMessage());
		respCode = huc.getResponseCode();
		if (respCode != 200) {
			System.out.println(url + " is a broken link");
		} else {
			System.out.println(url + " is a valid link");
		}
	}

	@When("I click on Checkboxes")
	public void i_click_on_checkboxes() {
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.cssSelector("a[href='/checkboxes']")).click();
	}

	@Then("I get navigated to checkbox page")
	public void i_get_navigated_to_checkbox_page() {
		System.out.println("I get navigated to checkbox page");
	}

	@Then("I click on checkbox1 and checkbox2 and again on checkbox1")
	public void i_click_on_checkbox1_and_checkbox2_and_again_on_checkbox1() throws InterruptedException {
		WebElement checkbox1 = driver.findElement(By.cssSelector("input[type='checkbox']"));
		checkbox1.click();
		Thread.sleep(2000);
		checkbox1.click();
	}

	@When("I click on Challenging DOM")
	public void i_click_on_challenging_dom() {
		System.out.println("I click on challenging dom button");
		driver.findElement(By.cssSelector("a[href='/challenging_dom']")).click();
	}

	@Then("I get navigated to Challenging dom page")
	public void i_get_navigated_to_challenging_dom_page() {
		System.out.println("I get navigated to Challenging dom page");
	}

	@Then("I click on Blue button and Red button and green button")
	public void i_click_on_blue_button_and_red_button_and_green_button() {
		WebElement bluebutton = driver.findElement(By.cssSelector("a[class=\"button\"]"));
		bluebutton.click();
		System.out.println("Clicked on bluebutton successfully");
		WebElement Redbutton = driver.findElement(By.cssSelector("a[class=\"button alert\"]"));
		Redbutton.click();
		System.out.println("Clicked on Redbutton successfully");
		WebElement greenbutton = driver.findElement(By.cssSelector("a[class=\"button success\"]"));
		greenbutton.click();
		System.out.println("Clicked on greenbutton successfully");
	}

	@Given("I am on Herkuapp")
	public void i_am_on_herkuapp() {
		driver.get("http://the-internet.herokuapp.com/");
		System.out.println("I am on Herokuapp");
	}

	@When("I click on context menu button")
	public void i_click_on_context_menu_button() {
		driver.findElement(By.cssSelector("a[href=\"/context_menu\"]")).click();
	}

	@Then("I get navigated to Context menu page")
	public void i_get_navigated_to_context_menu_page() {
		System.out.println("I get navigated to Context menu page");
	}

	@Then("I right click on the box and Ok on the javascript alert")
	public void i_right_click_on_the_box_and_ok_on_the_javascript_alert() {
		Actions action = new Actions(driver);
		WebElement Rightclick = driver.findElement(By.cssSelector("#hot-spot"));
		action.contextClick(Rightclick).perform();
		driver.switchTo().alert().accept();
	}

	@When("I click in digest auth")
	public void i_click_in_digest_auth() {
		driver.findElement(By.cssSelector("a[href=\"/digest_auth\"]")).click();
	}

	@Then("I get navigated to digest auth page")
	public void i_get_navigated_to_digest_auth_page() {
		System.out.println("I get navigated to digest auth page");

	}

	@Then("I enter {string} and {string} in the given fields")
	public void i_enter_and_in_the_given_fields(String string, String string2) {
		driver.get("http://" + string + ":" + string2 + "@the-internet.herokuapp.com/digest_auth");
		// driver.switchTo().alert().accept();

	}

	@When("I click on Disappearing elements")
	public void i_click_on_disappearing_elements() {
		driver.findElement(By.cssSelector("a[href=\"/disappearing_elements\"]")).click();
	}

	@Then("I get navigated to disappearing elements")
	public void i_get_navigated_to_disappearing_elements() {
		System.out.println("I get navigated to disappearing elements");
	}

	@Then("If Gallery button is present then click else print not found.")
	public void if_gallery_button_is_present_then_click_else_print_not_found() {
		// driver.findElement(By.cssSelector("a[href=\"/gallery/\"]"));
		try {
			if (driver.findElement(By.cssSelector("a[href=\"/gallery/\"]")).isDisplayed()) {
				driver.findElement(By.cssSelector("a[href=\"/gallery/\"]")).click();
			}

		} catch (Exception e) {
			System.out.println("Gallery button not found");
			// driver.navigate().refresh();
		}
	}

	@When("I click on Drag and Drop button")
	public void i_click_on_drag_and_drop_button() {
		driver.findElement(By.cssSelector("a[href=\"/drag_and_drop\"]")).click();
	}

	@Then("I get navigated to drag and drop page")
	public void i_get_navigated_to_drag_and_drop_page() {
		System.out.println("Now I am on drag and drop page");
	}

	@Then("I drag A context to context B")
	public void i_drag_a_context_to_context_b() {
		Actions act=new Actions(driver);
		WebElement drag = driver.findElement(By.cssSelector("#column-a"));
		WebElement drop = driver.findElement(By.cssSelector("#column-b"));
		act.dragAndDrop(drag, drop).build().perform();
	}
}
