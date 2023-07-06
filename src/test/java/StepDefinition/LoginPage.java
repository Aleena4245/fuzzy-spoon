package StepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage extends Base{

	@Given("^I open chrome browser$")
	public void i_open_chrome_browser()  {
		openBrowser();
	}

	@When("^I visit the qa environment$")
	public void i_visit_the_qa_environment()  {
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("^I should be on the login page$")
	public void i_should_be_on_the_login_page()  {
		String title = driver.getTitle();
	Assert.assertEquals("Login | Salesforce", title);
	}

	@Then("^I enter \"([^\"]*)\" username$")
	public void i_enter_username(String un)  {
		driver.findElement(By.id("username")).sendKeys(un);
	}

	@Then("^I enter \"([^\"]*)\" password$")
	public void i_enter_password(String pw) {
		 driver.findElement(By.id("password")).sendKeys(pw);
 }

	@When("^I click the login button$")
	public void i_click_the_login_button()  {
		driver.findElement(By.id("Login")).click();
	}

	@Then("^I should see the home page$")
	public void i_should_see_the_home_page()  {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("dialogClose")));
		driver.findElement(By.className("dialogClose")).click();
		boolean hometab = driver.findElement(By.xpath("//a[@title='Home Tab - Selected']")).isDisplayed();
		Assert.assertTrue(hometab);
	}

}
