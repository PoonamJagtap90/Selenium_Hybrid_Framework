package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.HomePage;
import bdd.pages.IndexPage;
import bdd.pages.LoginPage;
//import bdd.testcases.LoginPageTest;
import listeners.AmazonListener;

@Listeners(AmazonListener.class)
public class LoginPageTest extends BaseClass {

	LoginPage loginPage = new LoginPage();
	IndexPage indexPage;
	HomePage homePage = new HomePage();

	Logger LOG = Logger.getLogger(LoginPageTest.class);

	@Test
	public void loginTest() {
		LOG.info("Running Loging Page Test");
		indexPage = new IndexPage();
		loginPage = indexPage.clickOnSignIn();
		homePage = loginPage.login();
		String url = homePage.getHomePageURL();
		String expectedURL = "https://www.amazon.in/?ref_=nav_signin";
		Assert.assertEquals(url, expectedURL);
        LOG.info("End of Login Test");
	}


}
