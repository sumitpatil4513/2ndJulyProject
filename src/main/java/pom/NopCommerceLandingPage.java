package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NopCommerceLandingPage {
	//Header Members
	@FindBy(xpath="//a[@class='ico-register']")private WebElement register;
	@FindBy(xpath="//a[@class='ico-login']")private WebElement logIn;
	@FindBy(xpath="//a[@class='ico-wishlist']")private WebElement wishList;
	@FindBy(xpath="//a[@class='ico-cart']")private WebElement shippingCart;
	@FindBy(xpath="//a[@class='ico-logout']")private WebElement logOut;
	@FindBy(xpath="//a[@class='ico-account']")private WebElement Myaccount;
	@FindBy(xpath="//img[@alt='nopCommerce demo store']")private WebElement NopComLogo;
	@FindBy(xpath="//input[@class='search-box-text ui-autocomplete-input']")private WebElement searchTab;
	@FindBy(xpath="//button[@class='button-1 search-box-button']")private WebElement searchButton;
	//MainMenus
	@FindBy(xpath="(//a[text()='Computers '])[1]")private WebElement Computer;
	@FindBy(xpath="(//a[text()= 'Electronics '])[1]")private WebElement Electronics;
	@FindBy(xpath="(//a[text()= 'Apparel '])[1]")private WebElement Apparel;
	@FindBy(xpath="(//a[text()= 'Digital downloads '])[1]")private WebElement DigitalDownlodes;
	@FindBy(xpath="(//a[text()= 'Books '])[1]")private WebElement Books;
	@FindBy(xpath="(//a[text()= 'Jewelry '])[1]")private WebElement Jwelry;
	@FindBy(xpath="(//a[text()= 'Gift Cards '])[1]")private WebElement GiftCards;
	@FindBy(xpath="(//a[@href='/desktops'])[1]")private WebElement Desktops;
	@FindBy(xpath="(//a[@href='/notebooks'])[1]")private WebElement Notebook;
	@FindBy(xpath="(//a[@href='/software'])[1]")private WebElement Software;
	@FindBy(xpath="(//a[@href='/camera-photo'])[1]")private WebElement CameraAndPhoto;
	@FindBy(xpath="(//a[@href='/cell-phones'])[1]")private WebElement CellPhone;
	@FindBy(xpath="(//a[@href='/others'])[1]")private WebElement Other;
	@FindBy(xpath="(//a[@href='/shoes'])[1]")private WebElement Shoes;
	@FindBy(xpath="(//a[@href='/clothing'])[1]")private WebElement Clothing;
	@FindBy(xpath="(//a[@href='/accessories'])[1]")private WebElement Accessaries;
	//FooterMembers
	@FindBy(xpath="((//a[@href='/sitemap'])[1]")private WebElement SiteMapes;
	@FindBy(xpath="(//a[@href='/shipping-returns'])[1]")private WebElement ShippingAndReturn;
	@FindBy(xpath="(//a[@href='/privacy-notice'])[1]")private WebElement PrivecyNotice;
	@FindBy(xpath="(//a[@href='/conditions-of-use'])[1]")private WebElement ConditionsOfUse;
	@FindBy(xpath="(//a[@href='/about-us'])[1]")private WebElement AboutUs;
	@FindBy(xpath="(//a[@href='/contactus'])[1]")private WebElement ContactUs;
	@FindBy(xpath="(//a[@href='/search'])[1]")private WebElement Search;
	@FindBy(xpath="(//a[@href='/news'])[2]")private WebElement News;
	@FindBy(xpath="(//a[@href='/blog'])[1]")private WebElement Blog;
	@FindBy(xpath="(//a[@href='/recentlyviewedproducts'])[1]")private WebElement RecentlyViewedProducts;
	@FindBy(xpath="(//a[@href='/compareproducts'])[1]")private WebElement CompareProductList;
	@FindBy(xpath="((//a[@href='/newproducts'])[1]")private WebElement NewProducts;
	@FindBy(xpath="(//a[@href='/customer/info'])[2]")private WebElement MyAccount2;
	@FindBy(xpath="(//a[@href='/order/history'])[1]")private WebElement Orders;
	@FindBy(xpath="(//a[@href='/order/history'])[1]")private WebElement Addresses;
	@FindBy(xpath="(//a[@href='/cart'])[2]")private WebElement ShippingCart;
	@FindBy(xpath="(//a[@href='/wishlist'])[2]")private WebElement Wishlist;
	@FindBy(xpath="(//a[@href='/vendor/apply'])[1]")private WebElement VendorAccount;
	@FindBy(xpath="//a[text()='Facebook']")private WebElement Facebook;
	@FindBy(xpath="//a[text()='Twitter']")private WebElement Twitter;
	@FindBy(xpath="//a[text()='RSS']")private WebElement Rss;
	@FindBy(xpath="//a[text()='YouTube']")private WebElement YouTube;
	@FindBy(xpath="//input[@id='newsletter-email']")private WebElement NewsLetterTab;
	@FindBy(xpath="//button[@id='newsletter-subscribe-button']")private WebElement Suscribe;
	@FindBy(xpath="//a[text()='nopCommerce']")private WebElement NopCommerce;
	//Mid Elements
	@FindBy(xpath="//a[text()='New online store is open!']")private WebElement NewOlStore;
	@FindBy(xpath="//a[text()='nopCommerce new release!']")private WebElement NopCommerceNewRelease;
	@FindBy(xpath="//a[text()='About nopCommerce']")private WebElement AboutNopCommerce;
	@FindBy(xpath="(//a[text()='details'])[1]")private WebElement Details1;
	@FindBy(xpath="(//a[text()='details'])[2]")private WebElement Details2;
	@FindBy(xpath="(//a[text()='details'])[3]")private WebElement Details3;
	//VotingPart
	@FindBy(xpath="//input[@id='pollanswers-1']")private WebElement Exellent;
	@FindBy(xpath="(//input[@id='pollanswers-2']")private WebElement Good;
	@FindBy(xpath="(//input[@id='pollanswers-3']")private WebElement Poor;
	@FindBy(xpath="(//input[@id='pollanswers-4']")private WebElement VeryBad;
	@FindBy(xpath="(//button[@id='vote-poll-1']")private WebElement VoteButton;
	@FindBy(xpath="(//a[@href='/news'])[1]")private WebElement ViewNewsArchive;
	
	
	public NopCommerceLandingPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void ClickOnNopComLogo() {
		NopComLogo.click();
	}
	public void ClickOnRegister() {
		register.click();
	}
	public void ClickOnLogin() {
		logIn.click();
	}
	public void ClickOnLogout() {
		logOut.click();
	}
	public void ClickOnWishlist() {
		wishList.click();
	}
	public void ClickOnCart() {
		shippingCart.click();
	}
	public void sendDataInSearchtab(String serchContex) {
		searchTab.sendKeys(serchContex);
	}
	public void ClickOnSearchButton() {
		searchButton.click();
	}
	public void ClickOnComputers() {
		Computer.click();
	}
	public void ClickOnElectronics() {
		Electronics.click();
	}
	public void ClickOnApperel() {
		Apparel.click();
	}
	public void ClickOnDigitalDownlodes() {
		DigitalDownlodes.clear();
	}
	public void ClickOnBooks() {
		Books.click();
	}
	public void ClickOnJwelry() {
		Jwelry.click();
	}
	public void ClickOnGiftCards() {
		GiftCards.click();
	}
	public void ClickOnAccessaries() {
		Accessaries.click();
	}
	public void ClickOnClothing() {
		Clothing.click();
	}
	public void ClickOnShoes() {
		Shoes.click();
	}
	public void ClickOnOthers() {
		Other.click();
	}
	public void ClickOnCellPhones() {
		CellPhone.click();
	}
	public void ClickOnCameraAndPhotoes() {
		CameraAndPhoto.click();
	}
	public void ClickOnSoftware() {
		Software.click();
	}
	public void ClickOnNoteBooks() {
		Notebook.click();
	}
	public void ClickOnDesktop() {
		Desktops.click();
	}
	public void ClickOnSiteMapes() {
		SiteMapes.click();
	}
	public void ClickOnShippingAndReturn() {
		ShippingAndReturn.click();
	}
	public void ClickOnPrivecyNotices() {
		PrivecyNotice.click();
	}
	public void ClickOnConditionOfUse() {
		ConditionsOfUse.click();
	}
	public void ClickOnAboutUs() {
		AboutUs.click();
	}
	public void ClickOnContactUs() {
		ContactUs.click();
	}
	public void ClickOnSearch() {
		Search.click();
	}
	public void ClickOnNews() {
		News.click();
	}
	public void ClickOnBlog() {
		Blog.click();
	}
	public void ClickOnRecentlyViewedProducts() {
		RecentlyViewedProducts.click();
	}
	public void ClickOnCompareProductList() {
		CompareProductList.click();
	}
	public void ClickOnNewProducts() {
		NewProducts.click();
	}
	public void ClickOnVendorAccount() {
		VendorAccount.click();
	}
	public void ClickOnWishlist2() {
		Wishlist.click();
	}
	public void ClickOnShippingCart2() {
		ShippingCart.click();
	}
	public void ClickOnAddresses() {
		Addresses.click();
	}
	public void ClickOnOrders() {
		Orders.click();
	}
	public void ClickOnMyAccount2() {
		MyAccount2.click();
	}
	public void ClickOnFacebook() {
		Facebook.click();
	}
	public void ClickOnTwitter() {
		Twitter.click();
	}
	public void ClickOnRss() {
		Rss.click();
	}
	public void ClickOnYouTube() {
		YouTube.click();
	}
	
	public void SendDataInNewsLetterTab(String Value) {
		NewsLetterTab.sendKeys(Value);
	}
	public void ClickOnSuscribe() {
		Suscribe.click();
	}
	public void ClickOnNopCommerce() {
		NopCommerce.click();
	}
	public void ClickOnNewOlStore() {
		NewOlStore.click();
	}
	public void ClickOnNopCommerceNewRelease() {
		NopCommerceNewRelease.click();
	}
	public void ClickOnAboutNopCommerce() {
		AboutNopCommerce.click();
	}
	public void ClickOnDetails1() {
		Details1.click();
	}
	public void ClickOnDetails2() {
		Details2.click();
	}
	public void ClickOnDetails3() {
		Details3.click();
	}
	public void ClickOnVote() {
		VoteButton.click();
	}
	public void ClickOnExellent() {
		Exellent.click();
	}
	public void ClickOnGood() {
		Good.click();
	}
	public void ClickOnPoor() {
		Poor.click();
	}
	public void ClickOnVeryBad() {
		VeryBad.click();
	}
	public void ClickOnViewNewsArchive() {
		ViewNewsArchive.click();
	}


}
