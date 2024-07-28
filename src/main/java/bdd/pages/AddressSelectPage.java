package bdd.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bdd.baseclass.BaseClass;

public class AddressSelectPage extends BaseClass {
	
	@FindBy(css="input#defaultBuyBtnBlockerMsg")
	WebElement selectAddressInput;
	
	@FindBy(css="input[data-testid=\"Address_selectShipToThisAddress\"]")
	WebElement useThisAddressBtn;
	

}

