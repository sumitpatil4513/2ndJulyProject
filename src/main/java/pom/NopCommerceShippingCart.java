package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceShippingCart {
	@FindBy(xpath="//a[@class='ico-cart']")private WebElement shippingCart;
	@FindBy (xpath="//input[@id='itemquantity13819']")private WebElement Qty;
	@FindBy (xpath="//button[@class='remove-btn']")private WebElement Remove;
	@FindBy (xpath="//button[@id='updatecart']")private WebElement UpdateShippingCart;
	@FindBy (xpath="//button[@class='button-2 continue-shopping-button']")private WebElement ContinueShipping;
	@FindBy (xpath="//a[@class='estimate-shipping-button']")private WebElement EstimateShipping;
	@FindBy (xpath="//a[text()='Edit']")private WebElement Edit;
	@FindBy (xpath="//select[@id='checkout_attribute_1']")private WebElement GiftWrap;
	@FindBy (xpath="//input[@id='discountcouponcode']")private WebElement CopunTab;
	@FindBy (xpath="//button[@id='applydiscountcouponcode']")private WebElement ApplyCopun;
	@FindBy (xpath="//input[@id='giftcardcouponcode']")private WebElement GiftCartCode;
	@FindBy (xpath="//button[@id='applygiftcardcouponcode']")private WebElement AddGiftCard;
	@FindBy (xpath="//input[@id='termsofservice']")private WebElement AgreeCheckBox;
	@FindBy (xpath="//button[@id='checkout']")private WebElement CheckOut;
	
	
	
	public NopCommerceShippingCart(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void ClickOnCart() {
		shippingCart.click();
	}
	public void ClickOnEdit() {
		Edit.click();
	}
	public void SendValuesInQty(String qty) {
		Qty.clear();
		Qty.sendKeys(qty);
	}
	public void ClickOnRemove() {
		Remove.click();
	}
	public void ClickOnUpdateShippingCart() {
		UpdateShippingCart.click();
	}
	public void ClickOnContinueShipping() {
		ContinueShipping.click();
	}
	public void ClickOnEstimateShipping() {
		EstimateShipping.click();
	}
	public void SelectGiftWrap(int index) {
		Select select = new Select(GiftWrap);
		select.selectByIndex(index);
	}
	public void SendValuesInCouponCode(String code) {
		CopunTab.sendKeys(code);
	}
	public void SendValuesInGiftcartCode(String Gcode) {
		GiftCartCode.sendKeys(Gcode);
	}
	public void ClickOnApplyCopun() {
		ApplyCopun.click();
	}
	public void ClickOnCheckOut() {
		CheckOut.click();
	}
	public void ClickOnAcceptCheckBox() {
		AgreeCheckBox.click();
	}
	public void ClickOnAddGiftCard() {
		AddGiftCard.click();
	}
	

}
