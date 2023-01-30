package testclasses;


import org.testng.annotations.Test;

import pages.FictionPage;
import pages.PrintworksbdHomePage;
import pages.StoryBooksPage;
import utilities.DriverSetup;

public class TestFictionPage extends DriverSetup{
	
	PrintworksbdHomePage pHomePage = new PrintworksbdHomePage();
	StoryBooksPage sBooksPage = new StoryBooksPage();
    FictionPage fictionPage = new FictionPage();
  
    @Test
    public void TestBook() {
    	
		getDriver().get("https://www.printworksbd.com/");
		pHomePage.cliOnStoryBooks();
		pHomePage.cliOnFiction();
//		pHomePage.waitForElementVisiable(pHomePage.FICTION);
//		fictionPage.clickOnElement(fictionPage.VIEWPAGE);
		

    	
    }

}
