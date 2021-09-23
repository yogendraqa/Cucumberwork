package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZookSearch_elements {
	
	WebDriver driver;
	
	@FindBy(xpath = "//div[text()='Book Store Application']/../../..//div[@class='element-list collapse show']//li[@id='item-2']")public WebElement bstore;
	
	public ZookSearch_elements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
