package b9.maven.com.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import b9.maven.com.utils.Constants;


public class PurchaseFlightPage {
	
	@FindBy(xpath = "//input[@placeholder='First Last']")
	WebElement firstLastField;
	
	@FindBy(xpath = "//input[@placeholder='123 Main St.']")
	WebElement addressField;
	
	@FindBy(xpath = "//input[@placeholder='Anytown']")
	WebElement cityField;
	
	@FindBy(xpath = "//input[@placeholder='State']")
	WebElement stateField;
	
	@FindBy(xpath = "//input[@placeholder='12345']")
	WebElement zipCodeField;
	
	@FindBy(xpath = "//select[@name='cardType']")
	WebElement cardTypeDropdownField;
	
	@FindBy(xpath = "//input[@id='creditCardNumber']")
	WebElement creditCardNumberField;
	
	@FindBy(xpath = "//input[@value='11']")
	WebElement creditCardMonthField;
	
	@FindBy(xpath = "//input[@value='2017']")
	WebElement creditCardYearField;
	
	@FindBy(xpath = "//input[@name='nameOnCard']")
	WebElement NameOnCardField;
	
	@FindBy(xpath = "//input[@id='rememberMe']")
	WebElement rememberMeCheck;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement verificationMessageText;
	
	
	// Class Constructor
	public PurchaseFlightPage() {
		PageFactory.initElements(Constants.driver, this);
	}
	
	public void enterFirstName(String firstLast) {
		firstLastField.sendKeys(firstLast);
	}
	
	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}

	public void enterCity(String city) {
		cityField.sendKeys(city);
	}
	public void enterState(String state) {
		stateField.sendKeys(state);
	}
	
	public void enterzipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);
	}
	
	public void enterCardType(String cardType) {
		Select select = new Select(cardTypeDropdownField);
		select.selectByVisibleText(cardType);
		
	}
	public void enterCreditCardNumber(String creditCardNumber) {
		creditCardNumberField.sendKeys(creditCardNumber);
	}
	
	public void enterCreditCardMonth(String CreditCardMonth) {
		creditCardMonthField.sendKeys(CreditCardMonth);
	}
	
	public void enteryear(String creditCardYear) {
		creditCardYearField.sendKeys(creditCardYear);
	}
	
	public void enterNameOnCard(String NameOnCard) {
		NameOnCardField.sendKeys(NameOnCard);
	}
	
	public void clickRememberMeCheck() {
		rememberMeCheck.click();

	}
	
	public void clicksubmitButton() {
		submitButton.click();
	}
	
	public void verifyMessage(String message) throws InterruptedException {
		String expectedMessage= "Thank you for your purchase today!";
		
		if(expectedMessage.equals(message)) {
			System.out.println("PASSED");
		}else {
			System.out.println("FAIELD");
		}
		
		Thread.sleep(2000);
		Constants.driver.quit();
	}
}
