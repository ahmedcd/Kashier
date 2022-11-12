package signup.Kashier;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_Up_Page extends PageBase {

	public Sign_Up_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name = "full_name")
	WebElement FullName ;
	
	@FindBy(name = "store_name")
	WebElement StoreName ;
	
	@FindBy(name = "mobile_number")
	WebElement MobileNumber ;
	
	@FindBy(name = "email")
	WebElement Email ;
	
	@FindBy(id = "register-password")
	WebElement Password ;
	
	@FindBy(id = "r-register-password")
	WebElement ConfirmPassword ;
	
	@FindBy(id = "register-submit-btn")
	WebElement SignupBtn ;
	
	@FindBy(xpath = "//*[@id=\"m_login\"]/div/div/div[2]/div[3]/a[2]")
	WebElement ArabicMode ;
	
	public void signup (String full_name , String store_name , String mobile_number , String email , String password ,String confirm_password ) {
		
		FullName.clear();
		FullName.sendKeys(full_name);
		StoreName.clear();
		StoreName.sendKeys(store_name);
		MobileNumber.clear();
		MobileNumber.sendKeys(mobile_number);
		Email.clear();
		Email.sendKeys(email);
		Password.clear();
		Password.sendKeys(password);
		ConfirmPassword.clear();
		ConfirmPassword.sendKeys(confirm_password);
		
		SignupBtn.click();
	}

}
