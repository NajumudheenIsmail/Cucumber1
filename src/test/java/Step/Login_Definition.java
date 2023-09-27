package Step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Login_Definition {

	WebDriver driver;

		@Given("User should should navigate to the application")
		public void user_should_should_navigate_to_the_application() {
			 driver = new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
		}
		
		@Given("User enter the username as Najumudheen")
		public void user_enter_the_username_as_najumudheen() {
			driver.findElement(By.id("username")).sendKeys("Najumudheen");
		}
		
		@Given("User enter the password as 65F62S")
		public void user_enter_the_password_as_65f62s() {
			driver.findElement(By.id("password")).sendKeys("65F62S");
		}
		
		@Then("clcik the loginbutton to success login Page")
		public void clcik_the_loginbutton_to_success_login_page() {
			driver.findElement(By.id("login")).click();
		}
		
		@Given("User enter the invalid_username as Muthu")
		public void userEnterTheInvalidUsernameAsMuthu() {
			driver.findElement(By.id("username")).sendKeys("Muthu");
		}
		@Given("User enter the invalid_password as {int}")
		public void userEnterTheInvalidPasswordAs(Integer int1) {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}
		@Then("clcik the loginbutton2 to success login Page")
		public void clcikTheLoginbutton2ToSuccessLoginPage() {
		    // Write code here that turns the phrase above into concrete actions
		    throw new io.cucumber.java.PendingException();
		}	
		
		
	

		
	}
	

