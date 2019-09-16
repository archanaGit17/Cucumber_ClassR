package com.stepdefinition;

import java.awt.Button;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.objectrepository.AddTariffPage;
import com.objectrepository.HomePage;
import com.resources.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;


public class AddTariffSteps extends FunctionalLibrary {
	/*static WebDriver driver;

	@Given("User should be in telecom home page")
	public void user_should_be_in_telecom_home_page() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\subbian\\eclipse-workspace\\Arch\\Cucumber_RClass\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}*/

	@Given("click on add tariff button")
	public void click_on_add_tariff_button() {
		
		HomePage page=new HomePage();
		button(page.getAddTariffPlan());
		/*driver.get("http://demo.guru99.com/telecom/");
		driver.findElement(By.xpath("//a[text()='Add Tariff Plan']")).click();*/
	}
	@When("user enter all the field with valid data")
	public void user_enter_all_the_field_with_valid_data() {
		
		AddTariffPage page=new AddTariffPage();
		text(page.getMonthlyRent(),"500");
		text(page.getLocalMin(), "60");
		text(page.getInterMin(), "30");
		text(page.getSmsPack(),"100");
		text(page.getLocCharges(), "2");
		text(page.getInterCharges(), "5");
		text(page.getSmsCharges(), "1");
	}

	@When("user enters all the fields with valid datas")
	public void user_enters_all_the_fields_with_valid_datas(DataTable tariffDetails) {

		List<List<String>> data=tariffDetails.asLists(String.class);
		driver.findElement(By.id("rental1")).sendKeys(data.get(1).get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(data.get(1).get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(data.get(1).get(2));
		driver.findElement(By.name("sms_pack")).sendKeys(data.get(1).get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(data.get(1).get(4));
		driver.findElement(By.name("inter_charges")).sendKeys(data.get(1).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(data.get(1).get(6));
	
	}
	
	@When("user enter all the fields with valid datas")
	public void user_enter_all_the_fields_with_valid_datas(DataTable tariff) {
		List<Map<String,String>> data=tariff.asMaps(String.class,String.class);
		driver.findElement(By.id("rental1")).sendKeys(data.get(2).get("Pack"));
		driver.findElement(By.id("local_minutes")).sendKeys(data.get(2).get("Locmin"));
		driver.findElement(By.id("inter_minutes")).sendKeys(data.get(2).get("Intermin"));
		driver.findElement(By.name("sms_pack")).sendKeys(data.get(2).get("Sms"));
		driver.findElement(By.id("minutes_charges")).sendKeys(data.get(2).get("Locchrg"));
		driver.findElement(By.name("inter_charges")).sendKeys(data.get(2).get("Interchrg"));
		driver.findElement(By.id("sms_charges")).sendKeys(data.get(2).get("Smschrg"));
	}

	@When("click on submit button")
	public void click_on_submit_button() {
		
		AddTariffPage page=new AddTariffPage();
		button(page.getSubmit_1());
		
		/*driver.findElement(By.xpath("//input[@value='submit']")).click();*/
	}

	@Then("tariff id should be generated and displayed")
	public void tariff_id_should_be_generated_and_displayed() {
      Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]")).isDisplayed());
	}
}
