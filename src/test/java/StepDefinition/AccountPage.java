package StepDefinition;

import org.openqa.selenium.By;

import Utilities.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class AccountPage extends Base{

	@And("^I click the accounts tab$")
	public void i_click_the_accounts_tab()  {
		driver.findElement(By.xpath("//a[@title='Accounts Tab']")).click();
	}

	@Then("^I click the new button$")
	public void i_click_the_new_button() {
		driver.findElement(By.name("new")).click();
	}

	@And("^I click on the account name and type \"([^\"]*)\"$")
	public void i_click_on_the_account_name_and_type(String name)  {
	    driver.findElement(By.xpath("//td/div/input")).sendKeys(name);
	}


}
