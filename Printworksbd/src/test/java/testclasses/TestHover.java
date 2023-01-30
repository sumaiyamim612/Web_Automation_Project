package testclasses;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import pages.PrintworksbdHomePage;

import utilities.DriverSetup;

public class TestHover extends DriverSetup {
	
	
	PrintworksbdHomePage pHomePage = new PrintworksbdHomePage();
//	StoryBooksPage sBooksPage = new StoryBooksPage();
	
	
	@Test
	public void HoverTest() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/");
		Actions action = new Actions(getDriver());
		
		WebElement story = getDriver().findElement(By.xpath("//header/div[3]/div[1]/div[2]/ul[1]/li[3]/a[1]"));
		WebElement fiction = getDriver().findElement(By.xpath("//header/div[3]/div[1]/div[2]/ul[1]/li[3]/div[1]/div[1]/ul[1]/li[1]/a[1]"));
		
		
//		pHomePage.cliOnStoryBooks();
		
//		assertEquals(getDriver().getTitle(), pHomePage.PHOMEPAGETITLE);
//		System.out.println(getDriver().getTitle());
		
		action.moveToElement(story).perform();
		Thread.sleep(5000);
		
//		story.click();
//		Thread.sleep(5000);
		
		action.moveToElement(fiction).perform();
		Thread.sleep(5000);

		
		fiction.click();
		Thread.sleep(5000);

	}

}
	
	
