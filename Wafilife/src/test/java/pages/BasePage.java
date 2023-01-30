package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static utilities.DriverSetup.getDriver;

import java.time.Duration;

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
	
	public void waitForElementVisiable(By locator) {
		WebDriverWait wait = new WebDriverWait(getDriver(),Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
