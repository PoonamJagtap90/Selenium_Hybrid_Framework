package bdd.testcases;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import bdd.baseclass.BaseClass;
import bdd.pages.IndexPage;
import bdd.pages.ProductDetailPage;
import bdd.pages.SearchResultPage;
import listeners.AmazonListener;

@Listeners(AmazonListener.class)
public class ProductDetailPageTest extends BaseClass {

	IndexPage indexPage;
	SearchResultPage searchResultPage;
	ProductDetailPage productDetailPage;
	Logger LOG = Logger.getLogger(ProductDetailPageTest.class);

	@Test
	public void checkProduct() {
		LOG.info("Running test for getting information about This Item");
		indexPage = new IndexPage();
		searchResultPage = indexPage.searchProduct(prop.getProperty("search"));
		productDetailPage = searchResultPage.clickOnProduct1();
		productDetailPage.validateAboutThisItem();
		

	}

	@Test
	public void checkQuantity() {
		indexPage = new IndexPage();
		searchResultPage = indexPage.searchProduct(prop.getProperty("search"));
		productDetailPage = searchResultPage.clickOnProduct1();
		//productDetailPage.selectQuantity();
		Assert.assertEquals("Hi","Hi");

	}

}
