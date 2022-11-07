 package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceMyAccount {
	//CustomerInfo
	@FindBy(xpath="(//a[text()='My account'])[1]")private WebElement MyAccount;
	@FindBy(xpath="//input[@id='gender-male']")private WebElement GenderMale;
	@FindBy(xpath="//input[@id='gender-female']")private WebElement GenderFemale;
	@FindBy(xpath="//input[@id='FirstName']")private WebElement FirstName;
	@FindBy(xpath="//input[@id='LastName']")private WebElement LastName;
	@FindBy(xpath="//select[@name='DateOfBirthDay']")private WebElement Date;
	@FindBy(xpath="//select[@name='DateOfBirthMonth']")private WebElement Month;
	@FindBy(xpath="DateOfBirthYear")private WebElement Year;
	@FindBy(xpath="//input[@id='Email']")private WebElement Email;
	@FindBy(xpath="//input[@id='Company']")private WebElement CompanyName;
	@FindBy(xpath="//input[@id='Newsletter']")private WebElement NewsletterCheckbox;
	@FindBy(xpath="//button[@id='save-info-button']")private WebElement Save;
	//Addresses
	@FindBy(xpath="(//a[text()='Addresses'])[1]")private WebElement Address;
	@FindBy(xpath="//button[text()='Add new']")private WebElement AddNewAddress;
	@FindBy(xpath="//input[@id='Address_FirstName']")private WebElement AddFN;
	@FindBy(xpath="//input[@id='Address_LastName']")private WebElement AddLN;
	@FindBy(xpath="//input[@id='Address_Email']")private WebElement AddEmail;
	@FindBy(xpath="//input[@id='Address_Company']")private WebElement AddCompanyName;
	@FindBy(xpath="//select[@id='Address_CountryId']")private WebElement Country;
	@FindBy(xpath="//select[@id='Address_StateProvinceId']")private WebElement State;
	@FindBy(xpath="//input[@id='Address_City']")private WebElement City;
	@FindBy(xpath="//input[@id='Address_Address1']")private WebElement Address1;
	@FindBy(xpath="//input[@id='Address_Address2']")private WebElement Address2;
	@FindBy(xpath="//input[@id='Address_ZipPostalCode']")private WebElement ZipCode;
	@FindBy(xpath="//input[@id='Address_PhoneNumber']")private WebElement PhoneNo;
	@FindBy(xpath="//input[@id='Address_FaxNumber']")private WebElement FaxNo;
	@FindBy(xpath="//button[@class='button-1 save-address-button']")private WebElement AddSave;
	//Orders
	@FindBy(xpath="(//a[text()='Orders'])[1]")private WebElement Order;
	@FindBy(xpath="//button[@class='button-2 order-details-button']")private WebElement Details;
	//DownlodableProducts
	@FindBy(xpath="//li[@class='downloadable-products inactive']")private WebElement DownlodableProduct;
	//BackInStockSuscriptions
	@FindBy(xpath="//a[text()='Back in stock subscriptions']")private WebElement BackInStockSuscriptions;
	//RewardPoints
	@FindBy(xpath="//a[text()='Reward points']")private WebElement RewardPoints;
	//ChangePassword
	@FindBy(xpath="//a[text()='Change password']")private WebElement ChangePassword;
	@FindBy(xpath="//input[@id='OldPassword']")private WebElement OldPassword;
	@FindBy(xpath="//input[@id='NewPassword']")private WebElement NewPassword;
	@FindBy(xpath="//input[@id='ConfirmNewPassword']")private WebElement ConfirmPassword;
	@FindBy(xpath="//button[@class='button-1 change-password-button']")private WebElement ChangePass;
	//MyProductReview
	@FindBy(xpath="//a[text()='My product reviews']")private WebElement MyProductReview;
	
	public NopCommerceMyAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnMyAccount() {
		MyAccount.click();
	}
	public void ClickOnGenderFemale() {
		GenderFemale.click();
	}
	public void ClickOnGenderMale() {
		GenderMale.click();
	}
	public void SendValuesInFirstName(String firstname) {
		FirstName.sendKeys(firstname);
	}
	public void SendValuesInLastName(String lastname) {
		LastName.sendKeys(lastname);
	}
	public void SelectDate(String day) {
		Select select = new Select(Date);
		select.selectByVisibleText(day);
	}
	public void SelectMonth(String month) {
		Select select = new Select(Month);
		select.selectByVisibleText(month);
	}
	public void SelectYear(String year) {
		Select select = new Select(Year);
		select.selectByVisibleText(year);
	}
	public void SendValuesInEmail(String mail) {
		Email.sendKeys(mail);
	}
	public void SendValuesInCompanyName1(String CName) {
		CompanyName.sendKeys(CName);	
	}
	public void ClickOnNewsletterCheckBox() {
		NewsletterCheckbox.click();
	}
	public void ClickOnSaveButton() {
		Save.click();
	}
	public void ClickOnAddress() {
		Address.click();
	}
	public void ClickOnAddNewAddress() {
		AddNewAddress.click();
	}
	public void SendValuesInAddFirstName(String FN) {
		AddFN.sendKeys(FN);
	}
	public void SendValuesInAddLastName(String LN) {
		AddLN.sendKeys(LN);
	}
	public void SendValuesInAddEmail(String email) {
		AddEmail.sendKeys(email);
	}
	public void SendValuesInCompanyName(String company) {
		AddCompanyName.sendKeys(company);
	}
	public void SelectCountry(String country) {
		Select select = new Select(Country);
		select.selectByVisibleText(country);
	}

	public void SelectState(String state) {
		Select select = new Select(State);
		select.selectByVisibleText(state);
	}
	public void SendValuesInCity(String city) {
		City.sendKeys(city);
	}
	public void SendValuesInAddress1(String Add1) {
		Address1.sendKeys(Add1);
	}
	public void SendValuesInAddress2(String Add2) {
		Address2.sendKeys(Add2);
	}
	public void SendValuesInZipCode(String zip) {
		ZipCode.sendKeys(zip);
	}
	public void SendValuesInPhoneNo(String phone) {
		PhoneNo.click();
	}
	public void SendValuesInFaxNo(String fax) {
		FaxNo.sendKeys(fax);
	}
	public void ClickOnAdd_Save() {
		AddSave.click();
	}
	public void ClickOnOrder() {
		Order.click();
	}
	public void ClickOnOrder_Details() {
		Details.click();
	}
	public void ClickOnDownlodableProducts() {
		DownlodableProduct.click();
	}
	public void ClickOnBackInToStockSuscription() {
		BackInStockSuscriptions.click();
	}
	public void ClickOnRewardPoints() {
		RewardPoints.click();
	}
	public void ClickOnChangePassword() {
		ChangePassword.click();
	}
	public void SendValuesInOldPassword(String oldpassword) {
		OldPassword.sendKeys(oldpassword);
	}
	public void SendValuesInNewPassword(String newpassword) {
		NewPassword.click();
	}
	public void SendValuesInConfirmPassword(String confirmpass) {
		ConfirmPassword.sendKeys(confirmpass);
	}
	public void ClickOnChangePassButton() {
		ChangePass.click();
	}
	public void ClickOnMyProductReview() {
		MyProductReview.click();
	}






	

}
