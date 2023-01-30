package testclasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.PrintworksbdHomePage;
import utilities.DriverSetup;

public class TestHomePage extends DriverSetup {
	
	PrintworksbdHomePage pHomePage = new PrintworksbdHomePage();


	
	@Test
	public void HomePageTitle() {
		getDriver().get("https://www.printworksbd.com/");
//		pHomePage.cliOnStoryBooks();
		assertEquals(getDriver().getTitle(), pHomePage.PHOMEPAGETITLE);
		System.out.println(getDriver().getTitle());
	}
	

}
