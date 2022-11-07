package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceRegisterPage {
	@FindBy(xpath="//a[@class='ico-register']")private WebElement register;
	@FindBy(xpath="//input[@id='gender-male']")private WebElement MaleCheckBox;
	@FindBy(xpath="//input[@id='gender-female']")private WebElement FemaleCheckBox;
	@FindBy(xpath="//input[@id='FirstName']")private WebElement FirstName;
	@FindBy(xpath="//input[@id='LastName']")private WebElement LastName;
	@FindBy(xpath="//select[@class='valid']")private WebElement Day;
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")private WebElement Month;
	@FindBy(xpath="//select[@name='DateOfBirthYear']")private WebElement Year;
	@FindBy(xpath="//input[@id='Email']")private WebElement Email;
	@FindBy(xpath="//input[@id='Company']")private WebElement CompanyDetails;
	@FindBy(xpath="//input[@id='Newsletter']")private WebElement NewsLetterCheckBox;
	@FindBy(xpath="//input[@id='Password']")private WebElement Password;
	@FindBy(xpath="//input[@id='ConfirmPassword']")private WebElement ConfirmPassword;
	@FindBy(xpath="//button[@id='register-button']")private WebElement RegisterButton;
	
	
	
	public NopCommerceRegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnRegister() {
		register.click();
	}
	public void ClickOnMaleCheckbox() {
		MaleCheckBox.clear();
	}
	public void ClickOnFemaleCheckBox() {
		FemaleCheckBox.click();
	}
	public void SendValueInFirstName(String FN) {
		FirstName.sendKeys(FN);
	}
	public void SendValueInLastName(String LN) {
		LastName.sendKeys(LN);
	}
	public void SelectDateOfBirth(String date) {
		Select select = new Select(Day);
		select.selectByVisibleText(date);
	}
	public void SelectMonthOfBirth(String month) {
		Select select = new Select(Month);
		select.selectByVisibleText(month);
	}
	public void SelectYearOfBirth(int index) {
		Select select = new Select(Year);
		select.selectByIndex(index);
	}
	public void SendValuesInEmail(String email) {
		Email.sendKeys(email);
	}
	public void SendValuesInCompanyDetails(String company) {
		CompanyDetails.sendKeys(company);
	}
	public void MarkNewsLatterCheckBox() {
		NewsLetterCheckBox.click();
	}
	public void SendValuesInPassword(String password) {
		Password.sendKeys(password);
	}
	public void SendValuesInConfirmPassword(String con_password) {
		ConfirmPassword.sendKeys(con_password);
	}
	public void ClickOnRegisterButton() {
		RegisterButton.click();
	}
	
	
	

}
