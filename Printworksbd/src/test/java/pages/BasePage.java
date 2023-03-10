package pages;

import static utilities.DriverSetup.getDriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	WebElement driver;
	
	public WebElement getElement(By locator) {
		return getDriver().findElement(locator);
	}
	
	public void clickOnElement(By locator) {
		getElement(locator).click();	
	}
	public String getElementText(By locator) {
		return getElement(locator).getText();
	}
		public void write(By locator, String text) {
		getElement(locator).sendKeys(text);
	}
	public void waitForElementVisiable(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
