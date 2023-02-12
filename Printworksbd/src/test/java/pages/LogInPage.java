package pages;

import org.openqa.selenium.By;

public class LogInPage extends BasePage{
	public String LOGINPAGETITLE = "My Account - Printworks BD";
	public By USER_NAME_EMAIL_INUPT_FIELD = By.xpath("//input[@id='username']");
	public By PASSWORD_INPUT_FIELD = By.xpath("//input[@id='password']");
	public By LOGINBUTTON = By.xpath("//body/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/form[1]/p[3]/input[3]");
	
	public void doLogin(String email, String password) {
		write(USER_NAME_EMAIL_INUPT_FIELD, email);
		write(PASSWORD_INPUT_FIELD, password);
		clickOnElement(LOGINBUTTON);
	}

}
