package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NopCommerceEstimateShipping {
	@FindBy (xpath="")private WebElement EstimateShipping;
	@FindBy (xpath="(//select[@class='estimate-shipping-address-control'])[1]")private WebElement SelectCountry;
	@FindBy (xpath="(//select[@class='estimate-shipping-address-control'])[2]")private WebElement SelectState;
	@FindBy (xpath="//input[@class='estimate-shipping-address-control']")private WebElement ZipCode;
	@FindBy (xpath="(//div[@class='estimate-shipping-row-item shipping-item'])[1]")private WebElement Ground;
	@FindBy (xpath="(//div[@class='estimate-shipping-row-item shipping-item'])[4]")private WebElement NextDayAir;
	@FindBy (xpath="(//div[@class='estimate-shipping-row-item shipping-item'])[7]")private WebElement SecDayAir;
	@FindBy (xpath="//button[@class='button-2 apply-shipping-button']")private WebElement Apply;
	@FindBy (xpath="//button[@class='mfp-close']")private WebElement CloseWindow ;
	
	public NopCommerceEstimateShipping(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void SelectCountry(String con) {
		Select country = new Select(SelectCountry);
		country.selectByVisibleText(con);
	}
	public void SelectState(String state) {
		Select Sta = new Select(SelectCountry);
		Sta.selectByVisibleText(state);
	}
	public void SendValueInZipCode(String Zip) {
		ZipCode.sendKeys(Zip);
	}
	public void ClickOnGround() {
		Ground.click();
	}
	public void ClickOnNextDayAir() {
		NextDayAir.click();
	}
	public void ClickOnSecDayAir() {
		SecDayAir.click();
	}
	public void ClickOnApply() {
		Apply.click();
	}
	public void ClickOnClose() {
		CloseWindow.click();
	}
	
	
	
	

}
