package StepDefinition;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import Factory.DriverFactory;
import Pages.HomePage;
import io.cucumber.java.en.*;

public class HomePage_SD  {

	private String HomePageTitle;
	private HomePage homePage = new HomePage(DriverFactory.getDriver());	
	
	@Given("user is on home page of application")
	public void user_is_on_home_page_of_application() {
		DriverFactory.getDriver().get("https://www.takealot.com/");		
	}

	@When("user gets the title of the home page")
	public void user_gets_the_title_of_the_page() {
	    HomePageTitle = homePage.getHomePageTitle();
	    System.out.println("Home Page Title is: "+HomePageTitle);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String title) {
		Assert.assertTrue(HomePageTitle.contains(title));
	}

	@When("user click on register link")
	public void user_click_on_register_link() {
		homePage.click_RegisterLink();
	}
	
	@Then("user is registered and logged into the application")
	public void user_is_registered_and_logged_into_the_application() {
	    Assert.assertTrue(homePage.isLogoutLinkDisplayed());
	}

	@When("user search for {string} in the search bar")
	public void user_search_for_in_the_search_bar(String itemName) throws InterruptedException {
	    homePage.enterItemNameInSearchBar(itemName);
	    homePage.click_SearchButton();
	    Thread.sleep(7000);
	}
	
	@When("user applies brand filter as {string}")
	public void user_applies_brand_filter_as(String BrandName) throws InterruptedException {
		homePage.applyBrandFilter(BrandName);
	}
	@Then("user add {string} to cart")
	public void user_add_item_to_cart(String item) throws InterruptedException {
		homePage.addItemToCart(item);
	}
	@Then("user verifies the quantity in cart is updated as {int}")
	public void Verify_Cart_Quantity(int Expected_cartQuantity) {
		assertEquals(homePage.getCartQuantity(), Expected_cartQuantity);
	}	

}
