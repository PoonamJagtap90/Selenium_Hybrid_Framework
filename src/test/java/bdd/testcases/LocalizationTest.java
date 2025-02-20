package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import bdd.pages.LocalizationPage;

public class LocalizationTest extends BaseClass {

	IndexPage indexPage;
	LocalizationPage changingCountry = new LocalizationPage();
	
	Logger LOG=Logger.getLogger(LocalizationTest.class);

	@Test
	public void validateChangedCountry() {
		LOG.info("Start of localization Test");
		indexPage = new IndexPage();
		changingCountry = new LocalizationPage();
		changingCountry.changeCountry();
		LOG.info("End of localization Test");

	}

}

