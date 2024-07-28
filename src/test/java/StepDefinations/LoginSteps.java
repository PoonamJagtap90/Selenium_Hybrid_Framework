package StepDefinations;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	public static WebDriver driver=null;

	@When("user is on login page")
	public void user_is_on_login_page() {
		driver.get("url1");
	}

	@When("user enter valid username and invalid password")
	//@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_invalid_password() {
		driver.findElement(By.cssSelector("input#ap_email")).sendKeys("suhasinishinde49@gmail.com");
		driver.findElement(By.cssSelector("input.a-button-input")).click();
		driver.findElement(By.cssSelector("input#ap_password")).sendKeys("Hanuman79");
	}

	@And("user clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.cssSelector("input#signInSubmit")).click();
	}

	@Then("user logged in successfully")
	public void user_logged_in_successfully()

	{
		String msg = driver.findElement(By.cssSelector("span.a-list-item")).getText();

		System.out.println(msg);

	}


}
