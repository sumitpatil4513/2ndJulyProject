package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceLoginPage {
	@FindBy (xpath="//input[@id='Email']")private WebElement Email;
	@FindBy (xpath="//input[@id='Password']")private WebElement Password;
	@FindBy (xpath="//input[@id='RememberMe']")private WebElement RememberMe;
	@FindBy (xpath="//a[text()='Forgot password?']")private WebElement ForgotPassword;
	@FindBy (xpath="//button[text()='Log in']")private WebElement Login;
	@FindBy (xpath="//button[text()='Register']")private WebElement Register;
	
	
	public NopCommerceLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void SendValuesInEmail(String email) {
		Email.clear();
		Email.sendKeys(email);
	}
	public void SendValuesInPassword(String password) {
		Password.clear();
		Password.sendKeys(password);
	}
	public void ClickOnRememberMe() {
		RememberMe.click();
	}
	public void ClickOnForgotPassword() {
		ForgotPassword.click();
	}
	public void ClickOnLogIn() {
		Login.click();
	}
	public void ClickOnRegister() {
		Register.click();
	}

}
