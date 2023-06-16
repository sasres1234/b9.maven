package b9.maven.com.step;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import b9.maven.com.page.PurchaseFlightPage;
import b9.maven.com.utils.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PurchaseFlightSteps {
	
	PurchaseFlightPage obj = new PurchaseFlightPage();
	
	@Given("User navigates to BlazaDemo Purchase {string}")
	public void user_navigates_to_blaza_demo_purchase(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
	    
	}

	@When("User enters Name {string}")
	public void user_enters_name(String Name) {
		obj.enterFirstName(Name);
		
//		WebElement FirstLastField = driver.findElement(By.xpath("//input[@placeholder='First Last']"));
//		  FirstLastField.sendKeys(Name);
	    
	}

	@When("User enters Address {string}")
	public void user_enters_address(String Address) {
		obj.enterAddress(Address);
//		WebElement address = driver.findElement(By.xpath("//input[@placeholder='123 Main St.']"));
//		address.sendKeys(Address);	
	    
	}

	@When("User enters City {string}")
	public void user_enters_city(String city) {
//		WebElement City = driver.findElement(By.xpath("//input[@placeholder='Anytown']"));
//		City.sendKeys(city);
		obj.enterCity(city);
	    
	}

	@When("User enters State {string}")
	public void user_enters_state(String State) {
//		WebElement state = driver.findElement(By.xpath("//input[@placeholder='State']"));
//		state.sendKeys(State);	
		obj.enterState(State);
	      
	}

	@When("User enters Zip Code {string}")
	public void user_enters_zip_code(String ZipCode) {
//		WebElement zipCode = driver.findElement(By.xpath("//input[@placeholder='12345']"));
//		zipCode.sendKeys(ZipCode);	
		obj.enterzipCode(ZipCode);
	    
	}

	@When("User selects Card Type {string}")
	public void user_selects_card_type(String CardType) {
//		WebElement cardType = driver.findElement(By.xpath("//select[@name='cardType']"));
//		cardType.sendKeys(CardType);
		obj.enterCardType(CardType);
	    
	   
	}

	@When("user enters Credit Card Number {string}")
	public void user_enters_credit_card_number(String CreditCardNumber) {
//		WebElement creditCardNumber = driver.findElement(By.xpath("//input[@id='creditCardNumber']"));
//		creditCardNumber.sendKeys(CreditCardNumber);	
	    obj.enterCreditCardNumber(CreditCardNumber);
	    
	}

	@When("User enters Month {string}")
	public void user_enters_month(String Month) {
//		WebElement month = driver.findElement(By.xpath("//input[@value='11']"));
//		month.sendKeys(Month);
		obj.enterCreditCardMonth(Month);
	   
	}

	@When("User enters Year {string}")
	public void user_enters_year(String Year) {
//		WebElement year = driver.findElement(By.xpath("//input[@value='2017']"));
//		year.sendKeys(Year);
		obj.enteryear(Year);
	    
	}

	@When("User enters Name on Card {string}")
	public void user_enters_name_on_card(String NameOnCard) {
//		WebElement nameOnCard = driver.findElement(By.xpath("//input[@name='nameOnCard']"));
//		nameOnCard.sendKeys(NameOnCard);
		obj.enterNameOnCard(NameOnCard);
	   
	}

	@When("User check Remember me")
	public void user_check_remember_me() {
//		WebElement remembermer = driver.findElement(By.xpath("//input[@id='rememberMe']"));
//		remembermer.click();
		obj.clickRememberMeCheck();
	   
	    
	}

	@When("user clicks purchase Flight")
	public void user_clicks_purchase_flight() {
//		WebElement purchaseFlight = driver.findElement(By.xpath("//input[@value='Purchase Flight']"));
//		purchaseFlight.click();
		obj.clicksubmitButton();
	    
	}

	@Then("User verifies success message {string}")
	public void user_verifies_success_message(String Message) throws InterruptedException {
//		WebElement message = driver.findElement(By.xpath("//div[@class='container hero-unit']"));
//		message.sendKeys(Message);
		obj.verifyMessage(Message);
		
		Thread.sleep(2000);
		Constants.driver.quit();
	    
	}

}
