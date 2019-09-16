package com.objectrepository;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.FunctionalLibrary;

public class AddTariffPage extends FunctionalLibrary {
	
	public AddTariffPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="rental1")
	private WebElement monthlyRent;
	@FindBy(id="local_minutes")
	private WebElement localMin;
	@FindBy(id="inter_minutes")
	private WebElement interMin;
	@FindBy(id="sms_pack")
	private WebElement smsPack;
	@FindBy(id="minutes_charges")
	private WebElement locCharges;
	@FindBy(id="inter_charges")
	private WebElement interCharges;
	@FindBy(id="sms_charges")
	private WebElement smsCharges;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit_1;
	public WebElement getMonthlyRent() {
		return monthlyRent;
	}
	public WebElement getLocalMin() {
		return localMin;
	}
	public WebElement getInterMin() {
		return interMin;
	}
	public WebElement getSmsPack() {
		return smsPack;
	}
	public WebElement getLocCharges() {
		return locCharges;
	}
	public WebElement getInterCharges() {
		return interCharges;
	}
	public WebElement getSmsCharges() {
		return smsCharges;
	}
	public WebElement getSubmit_1() {
		return submit_1;
	}
	
	
}
