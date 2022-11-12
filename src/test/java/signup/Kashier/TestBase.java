package signup.Kashier;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
	

	public WebDriver driver;

	// Setup Before Senario_Test
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://merchant.kashier.io/signup");
	}

	// Close Browser After Senario_Test
	@AfterTest
	public void closeDriver() {
		//driver.quit();
	}

}
