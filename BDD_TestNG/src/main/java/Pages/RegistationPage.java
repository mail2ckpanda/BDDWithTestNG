package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistationPage {
	
	private WebDriver driver;
	
	public RegistationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "register_customer_first_name")
	private WebElement edit_FirstName;
	
	@FindBy(id = "register_customer_last_name")
	private WebElement edit_LastName;
	
	@FindBy(id = "register_customer_email")
	private WebElement edit_Email;
	
	@FindBy(id = "register_customer_new_password")
	private WebElement edit_Password;
	
	@FindBy(id = "register_customer_mobile_national_number")
	private WebElement edit_MobileNum;
	
	@FindBy(xpath = "//button[text()='Register']")
	private WebElement btn_Register;
	
	
	
	public void enterFirstName(String fname) {		
		edit_FirstName.sendKeys(fname);		
	}
	public void enterLastName(String lname) {		
		edit_LastName.sendKeys(lname);		
	}
	
	public void enterEmail() {	
		int random_int = (int)(Math.random()*(1000));
		String email = "fname"+random_int+"@mailinator.com";
	      System.out.println(random_int);
		edit_Email.sendKeys(email);		
	}
	
	public void enterPassword(String pwd) {		
		edit_Password.sendKeys(pwd);		
	}
	
	public void enterMobileNum(String mobileNum) {		
		edit_MobileNum.sendKeys(mobileNum);		
	}
	
	public void clickRegisterButton() throws InterruptedException {	
		Thread.sleep(3000);
		btn_Register.submit();	
	}
	
}
