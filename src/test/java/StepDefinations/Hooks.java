package StepDefinations;

import bdd.baseclass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void launchBrowserAndUrl() {
		BaseClass.launchApp();

	}

	@After
	public void closeBrowser() {
		BaseClass.tearDown();
	}

}

