package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceWishlistpage {
	@FindBy (xpath="//input[@name='addtocart']")private WebElement AddToCartCheckBox;
	@FindBy (xpath="//input[@name='addtocart']")private WebElement Edit;
	@FindBy (xpath="//input[@name='addtocart']")private WebElement Qty;
	@FindBy (xpath="//input[@name='addtocart']")private WebElement Remove;
	@FindBy (xpath="//input[@name='addtocart']")private WebElement UpdateWishList;
	@FindBy (xpath="//input[@name='addtocart']")private WebElement AddToCartButton;
	@FindBy (xpath="//input[@name='addtocart']")private WebElement EmailAFriend;
	
	
	public NopCommerceWishlistpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnAddToCartCheckBox() {
		AddToCartCheckBox.click();
	}
	public void ClickOnEdit(){
		Edit.click();
	}
	public void SendValuesInQty(String qty)
	{
		Qty.clear();
		Qty.sendKeys(qty);
	}
	public void ClickOnRemove() {
		Remove.click();
	}
	public void ClickOnUpdateWishList() {
		UpdateWishList.click();
	}
	public void ClickOnAddToCart() {
		AddToCartButton.click();
	}
	public void ClickOnEmailAFriend() {
		EmailAFriend.click();
	}

}
