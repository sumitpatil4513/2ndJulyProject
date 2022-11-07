package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceCheckout {
	//BillingAddress
	@FindBy(xpath="//a[@class='ico-cart']")private WebElement shippingCart;
	@FindBy (xpath="//input[@id='termsofservice']")private WebElement AgreeCheckBox;
	@FindBy (xpath="//button[@id='checkout']")private WebElement CheckOut;
	@FindBy (xpath="//input[@id='ShipToSameAddress']")private WebElement ShipToSameAdress;
	@FindBy (xpath="//input[@id='ShipToSameAddress']")private WebElement SelectAddress;
    //ShippingAddress
	@FindBy (xpath="//input[@id='BillingNewAddress_FirstName']")private WebElement FirstName;
	@FindBy (xpath="//input[@id='BillingNewAddress_LastName']")private WebElement LastName;
	@FindBy (xpath="//input[@id='BillingNewAddress_Email']")private WebElement Email;
	@FindBy (xpath="//input[@id='BillingNewAddress_Company']")private WebElement Company;
	@FindBy (xpath="//select[@id='BillingNewAddress_CountryId']")private WebElement Country;
	@FindBy (xpath="//select[@id='BillingNewAddress_StateProvinceId']")private WebElement State;
	@FindBy (xpath="//input[@id='BillingNewAddress_City']")private WebElement City;
	@FindBy (xpath="//input[@id='BillingNewAddress_Address1']")private WebElement Address1;
	@FindBy (xpath="//input[@id='BillingNewAddress_Address2']")private WebElement Address2;
	@FindBy (xpath="//input[@id='BillingNewAddress_ZipPostalCode']")private WebElement ZipCode;
	@FindBy (xpath="//input[@id='BillingNewAddress_PhoneNumber']")private WebElement PhoneNo;
	@FindBy (xpath="//input[@id='BillingNewAddress_FaxNumber']")private WebElement FaxNo;
	@FindBy (xpath="(//button[text()='Continue'])[1]")private WebElement SAContinue;
	//ShippingMethods
	@FindBy (xpath="//input[@id='shippingoption_0']")private WebElement Ground;
	@FindBy (xpath="//input[@id='shippingoption_1']")private WebElement NextDayAir;
	@FindBy (xpath="//input[@id='shippingoption_2']")private WebElement SecDayAir;
	@FindBy (xpath="(//a[@onclick='return Checkout.back(),!1'])[2]")private WebElement SMBack;
	@FindBy (xpath="(//button[text()='Continue'])[3]")private WebElement SMContinue;
	//PaymentMethods
	@FindBy (xpath="//input[@id='paymentmethod_0']")private WebElement CheckMoneyOrder;
	@FindBy (xpath="//input[@id='paymentmethod_1']")private WebElement CreditCard;
	@FindBy (xpath="(//a[@onclick='return Checkout.back(),!1'])[3]")private WebElement PMBack;
	@FindBy (xpath="(//button[text()='Continue'])[4]")private WebElement PMContinue;
	@FindBy (xpath="(//a[@onclick='return Checkout.back(),!1'])[4]")private WebElement PIBack;
	@FindBy (xpath="//button[@onclick='PaymentInfo.save()']")private WebElement PIContinue;
	@FindBy (xpath="(//a[@onclick='return Checkout.back(),!1'])[5]")private WebElement COBack;
	@FindBy (xpath="//button[@onclick='ConfirmOrder.save()']")private WebElement ConfirmOrder;
	@FindBy (xpath="//a[text()='Click here for order details.']")private WebElement OrderDetails;
	@FindBy (xpath="//button[@onclick='setLocation(\"/\")']")private WebElement OrderContinue;
	
	
	
	public NopCommerceCheckout(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnContinueOrder() {
		OrderContinue.click();
	}
	public void ClickOnOrderDetails() {
		OrderDetails.click();
	}
	public void ClickOnConfirmOrder() {
		ConfirmOrder.click();
	}
	public void ClickOnCOBack() {
		COBack.click();
	}
	public void ClickOnPIContinur() {
		PIContinue.click();
	}
	public void ClickOnPIBack() {
		PIBack.click();
	}
	public void ClickOnPMContinue() {
		PMContinue.click();
	}
	public void ClickOnPMBack() {
		PMBack.click();
	}
	public void ClickOnCreditCard() {
		CreditCard.click();
	}
	public void ClickOnMoneyOrder() {
		CheckMoneyOrder.click();
	}
	public void ClickOnSMContinue() {
		SMContinue.click();
	}
	public void ClickOnSMBack() {
		SMBack.click();
	}
	public void ClickOnSecDayAir() {
		SecDayAir.click();
	}
	public void ClickOnNextDayAir() {
		NextDayAir.click();
	}
	public void ClickOnGround() {
		Ground.click();
	}
	public void ClickOnCart() {
		shippingCart.click();
	}
	public void ClickOnAcceptCheckBox() {
		AgreeCheckBox.click();
	}
	public void ClickOnCheckOut() {
		CheckOut.click();
	}
	public void ClickOnShipToSameAddressCheckbox() {
		ShipToSameAdress.click();
	}
	public void SelectAddress(String address) {
		Select select = new Select(SelectAddress);
		select.selectByVisibleText(address);
	}
	public void SendValuesInFirstName(String FN)
	{
		FirstName.clear();
		FirstName.sendKeys(FN);
	}
	public void SendValuesInLastName(String LN) {
		LastName.clear();
		LastName.sendKeys(LN);
	}
	public void SendValuesInEmail(String email) {
		Email.clear();
		Email.sendKeys(email);
	}
	public void SendValuesInCompany(String company)
	{
		Company.clear();
		Company.sendKeys(company);
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
		City.clear();
		City.sendKeys(city);
	}
	public void SendValuesInAddress1(String add1) {
		Address1.clear();
		Address1.sendKeys(add1);
	}
	public void SendValuesInAddess2(String add2) {
		Address2.clear();
		Address2.sendKeys(add2);
	}
	public void SendValuesInZipCode(String zip) {
		ZipCode.clear();
		ZipCode.sendKeys(zip);
	}
	public void SendValuesInPhoneNo(String phNo ) {
		PhoneNo.clear();
		PhoneNo.sendKeys(phNo);
	}
	public void SendValuesInFaxNo(String faxNo) {
		FaxNo.clear();
		FaxNo.sendKeys(faxNo);
	}
	public void ClickOnContinue() {
		SAContinue.click();
	}
}
