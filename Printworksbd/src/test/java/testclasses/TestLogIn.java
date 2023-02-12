package testclasses;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import pages.LogInPage;
import pages.PrintworksbdHomePage;
import utilities.DriverSetup;

public class TestLogIn extends DriverSetup {
	PrintworksbdHomePage pHomePage = new PrintworksbdHomePage();
	LogInPage logInPage = new LogInPage();
	
	@Test
	public void loginPageTitle() {
	getDriver().get("https://www.printworksbd.com/");
	pHomePage.clicOnSignUpLoginButton();
	assertEquals(getDriver().getTitle(), logInPage.LOGINPAGETITLE);
	logInPage.write(logInPage.USER_NAME_EMAIL_INUPT_FIELD, "mim");
	logInPage.write(logInPage.PASSWORD_INPUT_FIELD, "123");
	logInPage.clickOnElement(logInPage.LOGINBUTTON);
	logInPage.waitForElementVisiable(logInPage.LOGINBUTTON);
	
	}
}
