package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	 WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	 WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://neostox.com/");
	}
	
	@Then("^user enters data \"(.*)\" in Mobile number textbox$")
	public void user_enters_data_in_mobile_number_textbox(String mobileNumber) {
	  driver.findElement(By.xpath("//input[@id='MainContent_signinsignup_txt_mobilenumber']")).sendKeys(mobileNumber);
	}

	@Then("user clicks on SignUp button")
	public void user_clicks_on_sign_up_button() throws InterruptedException {
	   driver.findElement(By.xpath("(//a[@id='lnk_signup1'])[1]")).click();
	   Thread.sleep(2000);
	}

	@Then("^user enters \"(.*)\" in pinbox$")
	public void user_enters_pin_in_pinbox(String pin) throws InterruptedException {
	 driver.findElement(By.xpath("//input[@id='txt_accesspin']")).sendKeys(pin);
	 Thread.sleep(2000);
	}

	@Then("user clicks on submit pin button")
	public void user_clicks_on_submit_pin_button() throws InterruptedException {
	driver.findElement(By.xpath("//a[@id='lnk_submitaccesspin']")).click();
	Thread.sleep(2000);
	}

	@Then("user should land on HomePage")
	public void user_should_land_on_home_page() { 
	driver.findElement(By.xpath("//a[text()='OK'  and @class='btn btn-sm neobutton']")).click();
	 String ActualResult = driver.findElement(By.xpath("//span[@id='lbl_username']")).getText();
	 Assert.assertEquals(ActualResult, "Hi adesh Khedkar" , "User name is not match ");
	 
	
	}

	@Then("user closes the browser")
	public void user_closes_the_browser() {
	driver.quit();
	}
	
	@When("user clicks on ExpandCollapse button")
	public void user_clicks_on_ExpandCollapse_button() {
		driver.findElement(By.xpath("//button[@title='Show Instrument List']")).click();
	}
	
	@When("user clicks on Pending order tab")
	public void user_clicks_on_pendingOrder_Tab() {
		driver.findElement(By.xpath("//a[@id='lnk_pendingorders']")).click();
	}

}
