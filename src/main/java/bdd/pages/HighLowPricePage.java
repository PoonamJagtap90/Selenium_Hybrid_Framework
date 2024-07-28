package bdd.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bdd.baseclass.BaseClass;

public class HighLowPricePage extends BaseClass {

	@FindBy(css = "span.a-price-whole")
	List<WebElement> Price;

	public HighLowPricePage() {
		PageFactory.initElements(driver, this);
	}

	public void getPriceOfItem() {
		//Map<WebElement, Integer> map = new HashMap<WebElement, Integer>();

		for (int i = 0; i < Price.size(); i++) {
			if (Price.get(i).getText() != "") {
				System.out.println(Price.get(i).getText().replaceAll(",", ""));
			}
		}
			}

}

