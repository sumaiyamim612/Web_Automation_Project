package testclasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pages.FictionPage;
import pages.PrintworksbdHomePage;
import utilities.DriverSetup;

public class TestScrollDown extends DriverSetup {
	
	PrintworksbdHomePage pHomePage = new PrintworksbdHomePage();
	FictionPage fictionPage = new FictionPage();
	
	
	@Test
	public void ScrollUsingJs() throws InterruptedException {
		getDriver().get("https://www.printworksbd.com/");
		pHomePage.clickOnElement(pHomePage.STORYBOOKS);
		pHomePage.clickOnElement(pHomePage.FICTION);
		WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(20));
		JavascriptExecutor js = (JavascriptExecutor)getDriver();
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		
		WebElement footer = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("footer")));
		
		js.executeScript("arguments[0].scrollIntoView();", footer);
		Thread.sleep(5000);
		
	}
	
	

}
