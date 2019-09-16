package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[text()='Add Customer'])[2]")
	private WebElement addCustomer;
	
	@FindBy(xpath="(//a[text()='Add Tariff Plan'])[1]")
	private WebElement addTariffPlan;
	
	@FindBy(xpath="(//a[text()='Add Tariff Plan to Customer'])[1]")
	private WebElement addTariffToCust;
	
	@FindBy(xpath="(//a[text()='Pay Billing'])[1]")
	private WebElement payBilling;

	public WebElement getAddCustomer() {
		return addCustomer;
	}

	public WebElement getAddTariffPlan() {
		return addTariffPlan;
	}

	public WebElement getAddTariffToCust() {
		return addTariffToCust;
	}

	public WebElement getPayBilling() {
		return payBilling;
	}
	
	
	

}
