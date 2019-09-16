package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddCustomerPage extends FunctionalLibrary {

	public AddCustomerPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//label[@for='done']")
	private WebElement done;
	@FindBy(id="fname")
	private WebElement firstName;
	@FindBy(id="lname")
	private WebElement lastName;
	@FindBy(id="email")
	private WebElement emailId;
	@FindBy(xpath="//textarea[@name='addr']")
	private WebElement address;
	@FindBy(id="telephoneno")
	private WebElement phno;
	@FindBy(xpath="//input[@value='Submit']")
	private WebElement submit;
	
	
	public WebElement getDone() {
		return done;
	}
	public WebElement getFirstName() {
		return firstName;
	}
	public WebElement getLastName() {
		return lastName;
	}
	public WebElement getEmailId() {
		return emailId;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getPhno() {
		return phno;
	}
	public WebElement getSubmit() {
		return submit;
	}
}
