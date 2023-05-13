package Pages;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = "//a[text()='Register']")
	private WebElement lnk_Register;
	
	@FindBy(xpath = "//button[text()='Logout']")
	private WebElement lnk_Logout;
	
	@FindBy(name = "search")
	private WebElement edit_SearchBar;
	
	@FindBy(xpath = "//button[@class='button search-btn search-icon']")
	private WebElement btn_Search;
	
	@FindBy(id = "_undefined")
	private WebElement edit_brandFilter;
		
	@FindBy(xpath = "//ul[@class = 'filter-search-module_options-container_Qhqix']//li[1]")
	private WebElement chkbox_firstBrand;
	
	@FindBy(xpath = "//div[@class = 'badge-count badge-button-module_badge-count_28PIS']")
	private WebElement Cart_itemCount;
	
	
	public String getHomePageTitle() {
		return driver.getTitle();
	}	
	
	public void click_RegisterLink() {
		lnk_Register.click();
	}
	
	public boolean isLogoutLinkDisplayed() {
		return lnk_Logout.isDisplayed();		
	}
	
	public void enterItemNameInSearchBar(String itemName) {
		edit_SearchBar.sendKeys(itemName);
	}
	
	public void click_SearchButton() {
		btn_Search.click();
	}
	
	public void applyBrandFilter(String BrandName) throws InterruptedException {
		edit_brandFilter.sendKeys(BrandName);
		Thread.sleep(2000);	
		chkbox_firstBrand.click();
		Thread.sleep(5000);		
	}
	
	public void addItemToCart(String itemName) throws InterruptedException {
		int itemIndex = 0;
		List<WebElement> allItems = driver.findElements(By.xpath("//div[@class = 'product-card-module_title-wrapper_1sj9D']//a[@target = '_blank']"));
		for(int i = 0;i<=allItems.size()-1;i++) {
			if (allItems.get(i).getText().contains(itemName)) {
				itemIndex = i;
				break;
			}			
		}
		itemIndex =itemIndex+1;
		String xpth ="(//button[text()='Add to Cart'])["+itemIndex+"]";
		System.out.println("add to cart index is "+itemIndex);
	driver.findElement(By.xpath(xpth)).click();
	Thread.sleep(3000);
	}
	
	public int getCartQuantity() {
		String count = Cart_itemCount.getText();
		count = count.trim();
		return Integer.parseInt(count);
	}
	
}
