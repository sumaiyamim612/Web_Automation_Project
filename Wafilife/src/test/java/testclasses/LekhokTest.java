package testclasses;


import static org.testng.Assert.assertEquals;


import org.testng.annotations.Test;

import pages.LekhokPage;
import pages.WafilifeHomePage;
import utilities.DriverSetup;

public class LekhokTest extends DriverSetup {
	
	WafilifeHomePage wafilifeHomePage = new WafilifeHomePage();
	LekhokPage lekhokPage = new LekhokPage();
	
	@Test
	public void lekhokPageTitle() {
		getDriver().get("https://www.wafilife.com/");
		wafilifeHomePage.cliOnLekhokButton();
		assertEquals(getDriver().getTitle(), lekhokPage.LEKHOKPAGETITLE);
		System.out.println(getDriver().getTitle());
	}
	
	@Test
	public void TestAuthorName() {
		getDriver().get("https://www.wafilife.com/");
		wafilifeHomePage.cliOnLekhokButton();
		wafilifeHomePage.clickOnElement(wafilifeHomePage.AUTHORBUTTON);
		wafilifeHomePage.waitForElementVisiable(wafilifeHomePage.AUTHORBUTTON);
		wafilifeHomePage.clickOnElement(wafilifeHomePage.CLICKBOOK);
		wafilifeHomePage.waitForElementVisiable(wafilifeHomePage.CLICKBOOK);
//		assertEquals(getDriver().getTitle(), lekhokPage.LEKHOKPAGETITLE);
//		System.out.println(getDriver().getTitle());


	}
	
	
	

}
