package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demologin_elements {
	
	WebDriver driver;
	
	@FindBy(css = "#newUser") public WebElement nubutt;
	@FindBy(css = ".main-header") public WebElement logo;
	@FindBy(css = "#firstname") public WebElement fname;
	@FindBy(css = "#lastname" ) public WebElement lname;
	@FindBy(css = "#userName") public WebElement Uname;
	@FindBy(css = "#password") public WebElement password;
	@FindBy(id = "register") public WebElement button;
	
	public Demologin_elements(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	
	}

}
