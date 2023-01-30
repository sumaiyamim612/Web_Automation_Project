package pages;

import org.openqa.selenium.By;

public class WafilifeHomePage extends BasePage {
	
	public By LEKHOKBUTTON = By.xpath("//span[contains(text(),'লেখক')]");
	public By AUTHORBUTTON = By.xpath("//h3[contains(text(),'Dr. Muhammad Moniuzzaman ')]");
	public By CLICKBOOK = By.xpath("//img[@src=\"https://wafilife-media.wafilife.com/uploads/2020/10/MBBS-04-192x254.png\"]");
			
	public void cliOnLekhokButton() {
		clickOnElement(LEKHOKBUTTON);
	}


}
