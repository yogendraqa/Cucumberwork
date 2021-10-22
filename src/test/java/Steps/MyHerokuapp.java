package Steps;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyHerokuapp {
	WebDriver driver;

	public MyHerokuapp(Commom commom) {
		this.driver = commom.getDriver();
	}

	@When("I click on Dynamic context button")
	public void i_click_on_dynamic_context_button() {
		driver.findElement(By.cssSelector("a[href=\"/dynamic_content\"]")).click();
	}

	@Then("I get navigated to Dynamic Content Page")
	public void i_get_navigated_to_dynamic_content_page() {
		System.out.println("I get navigated to dynamic content page");
		driver.navigate().refresh();
	}

	@Then("The new text and images are automated successfully")
	public void the_new_text_and_images_are_automated_successfully() {
		System.out.println("The new text and images are automated successfully");
	}

	@When("I click on file download")
	public void i_click_on_file_download() {
		driver.findElement(By.cssSelector("a[href=\"/download\"]")).click();
	}

	@Then("I click on a File and the File is downloaded successfully")
	public boolean i_click_on_a_file_and_the_file_is_downloaded_successfully() throws InterruptedException {
		driver.findElement(By.cssSelector("a[href=\"download/FLOWER. IMG.JPG\"]")).click();
		File file = new File("Downloads");
		if (file.exists()) {
			System.out.println("FLOWER.%20IMG.JPG" + " is present");
			return true;
		} else {
			Thread.sleep(5000);
		}
		return false;

	}

	@When("I click on file upload")
	public void i_click_on_file_upload() {
		driver.findElement(By.cssSelector("a[href=\"/upload\"]")).click();
	}

	@Then("I get navigated to File upload page")
	public void i_get_navigated_to_file_upload_page() {
		System.out.println("I am on file upload page");
	}

	@Then("I click on choose file, select a file from system and click on upload")
	public void i_click_on_choose_file_select_a_file_from_system_and_click_on_upload() {
		WebElement uploadfile = driver.findElement(By.cssSelector("#file-upload"));
		uploadfile.sendKeys("C:\\Users\\yogendra.vashishtha\\Downloads\\chromedriver_win32 (1).zip");
		// driver.findElement(By.name("open")).click();
		driver.findElement(By.cssSelector("#file-submit")).click();
	}

	@When("I click on Dynamic Control.")
	public void i_click_on_dynamic_control() {
		driver.findElement(By.cssSelector("a[href=\"/dynamic_controls\"]")).click();
	}

	@Then("I click on Add and check box appears.")
	public void i_click_on_add_and_check_box_appears() throws InterruptedException {
		System.out.println("I am not clicking on anything for now");
	}

	@Then("I click on Remove.")
	public void i_click_on_remove() throws InterruptedException {
		System.out.println("I click on Remove");
		driver.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
		driver.findElement(By.cssSelector("button[onclick=\"swapCheckbox()\"]")).click();
		Thread.sleep(5000);

	}

	@Then("I click on enable add Name and click on disable.")
	public void i_click_on_enable_add_name_and_click_on_disable() {
		System.out.println("I click on enable add Name and click on disable.");
		driver.findElement(By.cssSelector("button[onclick=\"swapInput()\"]")).click();
		WebElement sendelement = driver.findElement(By.cssSelector("input[type=\"Text\"]"));
		sendelement.isEnabled();
	}
	
	@Given("I am Herokuapp")
	public void i_am_herokuapp() {
		driver.get("http://the-internet.herokuapp.com/");
	    System.out.println("I am Herokuapp");
	}
	@When("I click oon Entry ad")
	public void i_click_oon_entry_ad() {
	    driver.findElement(By.cssSelector("a[href=\"/entry_ad\"]")).click();
	}
	@Then("I get navigated to entry ad page and close the entry ad if visible")
	public void i_get_navigated_to_entry_ad_page_and_close_the_entry_ad_if_visible() {
	    System.out.println("I am on entry ad page");
	    driver.findElement(By.cssSelector("a[id=\"restart-ad\"]")).click();
	    WebElement Frame = driver.findElement(By.cssSelector("div[class=\"modal\"]"));
	    //driver.switchTo().frame(Frame);
	    //driver.switchTo().alert().dismiss();
	    driver.findElement(By.xpath("//*[@id=\"modal\"]/div[2]/div[3]/p")).click();
	    //driver.switchTo().defaultContent();
	}
}