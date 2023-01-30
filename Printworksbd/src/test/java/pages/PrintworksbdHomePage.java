package pages;

import org.openqa.selenium.By;

public class PrintworksbdHomePage extends BasePage {
	
	public String PHOMEPAGETITLE = "Printworks BD- The Best Place to Shop Books Online in Bangladesh";
	
	public By STORYBOOKS = By.xpath("//header/div[3]/div[1]/div[2]/ul[1]/li[3]/a[1]");
	public By FICTION = By.xpath("//body/div[@id='nav-panel']/div[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]");

	public void cliOnStoryBooks() {
		clickOnElement(STORYBOOKS);
	}
	
	public void cliOnFiction() {
		clickOnElement(FICTION);
	}

}
