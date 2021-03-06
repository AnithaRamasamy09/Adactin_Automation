package org.sample.pageObjects;

import org.adactin.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Adactin_SearchHotel extends Base{
	
	
	@FindBy (id="location")
	private WebElement location;
	
	@FindBy (id="Submit")
	private WebElement Submit;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getSubmit() {
		return Submit;
	}


	public Pom_Adactin_SearchHotel()
	{
		PageFactory.initElements(driver, this);
	}


}
