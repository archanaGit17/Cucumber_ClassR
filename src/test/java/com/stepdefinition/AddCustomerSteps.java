package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddCustomerSteps {
	static WebDriver driver;
	@Given("User is in telecom home page")
	public void user_is_in_telecom_home_page() {
      System.setProperty("webdriver.chrome.driver","C:\\Users\\subbian\\eclipse-workspace\\Arch\\Cucumber_RClass\\driver\\chromedriver.exe");
      driver=new ChromeDriver();
	}

	@Given("click on add customer button")
	public void click_on_add_customer_button() {
	 driver.get("http://demo.guru99.com/telecom/");
	 driver.findElement(By.xpath("(//a[text()='Add Customer'])[2]")).click();
	}

	@When("user enters all the fields with valid data")
	public void user_enters_all_the_fields_with_valid_data() {
		 driver.findElement(By.xpath("//label[@for='done']")).click();
	     driver.findElement(By.id("fname")).sendKeys("archana");
	     driver.findElement(By.id("lname")).sendKeys("subbian");
	     driver.findElement(By.id("email")).sendKeys("archana@gmail.com");
	     driver.findElement(By.name("addr")).sendKeys("chennai");
	     driver.findElement(By.id("telephoneno")).sendKeys("1234567890");
	}
	
	@When("user enters all the field with valid data.")
	public void user_enters_all_the_field_with_valid_data(DataTable CusDetails) {
		
		List<String> data=CusDetails.asList(String.class);
		
		 driver.findElement(By.xpath("//label[@for='done']")).click();
	     driver.findElement(By.id("fname")).sendKeys(data.get(0));
	     driver.findElement(By.id("lname")).sendKeys(data.get(1));
	     driver.findElement(By.id("email")).sendKeys(data.get(2));
	     driver.findElement(By.name("addr")).sendKeys(data.get(3));
	     driver.findElement(By.id("telephoneno")).sendKeys(data.get(4));
	}
	
	@When("user enter all the field with valid data.")
	public void user_enter_all_the_field_with_valid_data(DataTable CustomerD) {
	
		Map<String,String> data=CustomerD.asMap(String.class, String.class);
		
		 driver.findElement(By.xpath("//label[@for='done']")).click();
	     driver.findElement(By.id("fname")).sendKeys(data.get("fname"));
	     driver.findElement(By.id("lname")).sendKeys(data.get("lname"));
	     driver.findElement(By.id("email")).sendKeys(data.get("email"));
	     driver.findElement(By.name("addr")).sendKeys(data.get("address"));
	     driver.findElement(By.id("telephoneno")).sendKeys(data.get("phnno"));	
	}
	

@When("user enterss all the field with valid data {string},{string},{string},{string},{string}")
public void user_enterss_all_the_field_with_valid_data(String fname, String lname, String email, String add, String phn) {
	
	driver.findElement(By.xpath("//label[@for='done']")).click();
    driver.findElement(By.id("fname")).sendKeys(fname);
    driver.findElement(By.id("lname")).sendKeys(lname);
    driver.findElement(By.id("email")).sendKeys(email);
    driver.findElement(By.name("addr")).sendKeys(add);
    driver.findElement(By.id("telephoneno")).sendKeys(phn);

}
	
	@When("clicks on submit button")
	public void clicks_on_submit_button() {
    
     driver.findElement(By.xpath("//input[@value='Submit']")).click();
	}

	@Then("customer id should be generated and displayed")
	public void customer_id_should_be_generated_and_displayed() {
    Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
	}
}
