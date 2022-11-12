package signup.Kashier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

WebDriver driver;
	
	public PageBase(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
