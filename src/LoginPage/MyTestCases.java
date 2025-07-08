package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v135.page.model.WebAppManifest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestCases {
//mar7ba
	WebDriver driver = new ChromeDriver();
	String theURL = "https://automationteststore.com/";
	String SignupPage = "https://automationteststore.com/index.php?rt=account/create";

	@BeforeTest
	// @ : annotation المنطقة المحجوزة لكل تيست
	public void myStup() {
		driver.get(theURL);

		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void Signup() {
	
		driver.navigate().to(SignupPage);
		
		WebElement firstName = driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[1]/form/div[1]/fieldset/div[1]/div/input"));
		firstName.sendKeys("hamzeh");
	}

}
