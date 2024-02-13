package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class HomePage3 extends ProjectSpecification {

	@FindBy(xpath="(//a[@class=\"nav-link\"])[3]")
	WebElement create;
	
	@FindBy(xpath="//span[text()=\"New Customer\"]")
	WebElement addCustomer;
	
	@FindBy(xpath="//input[@name=\"name\"]")
	WebElement name;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@name=\"phone\"]")
	WebElement phone;
	
	@FindBy(xpath="//input[@name=\"address\"]")
	WebElement address;
	
	@FindBy(xpath="//span[text()=\"Save Customer\"]")
	WebElement saveCustomer;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/form/div[3]/div/div[1]/div/div[1]/div/div/div/div")             //click select customer field
	WebElement clickCustomer;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[3]/form/div[3]/div/div[1]/div/div[1]/div/div/div/div")             // select customer drop down 
	WebElement clickCustomerDropDown;
	
	@FindBy(xpath="(//li[text()=\"Surya Prakash\"])[1]")             // select customer name
	WebElement selectCustomerName;
	
	
	@FindBy(xpath="//input[@name=\"itemName\"]")             //add item
	WebElement addItem;
	
	@FindBy(xpath="//input[@name=\"quantity\"]")             //quantity
	WebElement quant;
	
	@FindBy(xpath="//input[@name=\"unitPrice\"]")             //price
	WebElement price;
	
	@FindBy(xpath="//input[@name=\"discount\"]")             //discount
	WebElement discount;
	
	@FindBy(xpath="//input[@name=\"amount\"]")             //amount
	WebElement amount;
	
	@FindBy(xpath="//div[@class=\"Invoice_addButton__9uXjb\"]")             //add button for item
	WebElement addButton;
	
	@FindBy(xpath="//button[@aria-label=\"change date\"]")             //click date picker
	WebElement datePicker;
	
	@FindBy(xpath="//p[text()=\"21\"]")             //date selection
	WebElement dateSelection;
	
	@FindBy(xpath="//span[text()=\"OK\"]")             //click ok
	WebElement clickOk;
	
	@FindBy(xpath="(//button[@aria-label=\"Open\"])[2]")             //currency
	WebElement currency;
	
	@FindBy(xpath="//*[@id=\"debug-option-105\"]")             //currency_value
	WebElement currencyValue;
	
	@FindBy(xpath="(//span[@class=\"MuiButton-label\"])[3]")             //save and continue
	WebElement saveAndContinue;
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[2]/div/div/button/span[1]/div")   //Menu button _UI
	WebElement menuButton;
	
	@FindBy(xpath="//*[@id=\"menu-list-grow\"]/li[2]")   //logout
	WebElement logout;
	
	@FindBy(xpath="//*[@id=\"themeButton\"]/a")   //setting button UI
	WebElement setting;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/nav/ul/li[2]/a")   //dashboard button UI
	WebElement dashboard;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/nav/ul/li[3]/a")   //create button UI
	WebElement createButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/nav/ul/li[4]/a")   //invoice button UI
	WebElement invoiceButton;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div[1]/nav/ul/li[5]/a")   //customer button UI
	WebElement customerButton;
	
	
	
	
	public HomePage3(WebDriver driver) {              //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public HomePage3 signInVerification() {
		boolean signedIn = menuButton.isDisplayed();
		System.out.println("Signed In Successfully : "+signedIn );
		return this;
	}
	
	
	public HomePage3 create() {
		click(create);
		return this;
	}
	
	public HomePage3 addCustomer() {
		click(addCustomer);
		return this;
	}
	
	public HomePage3 name(String Name) {
		sendKeys(name, Name);
		return this;
	}
	
	public HomePage3 email(String mail) {
		sendKeys(email, mail);
		return this;
	}
	
	public HomePage3 phone(String num) {
		sendKeys(phone, num);
		return this;
	}
	
	public HomePage3 address(String add) {
		sendKeys(address, add);
		return this;
	}
	
	public HomePage3 save() {
		click(saveCustomer);
		System.out.println("Customer Details added successfully");
		return this;
	}
	
	public HomePage3 selectCustomerFiled() throws InterruptedException {              //click select customer box
		Thread.sleep(5000);
		click(clickCustomer);
		return this;
	}
	
	
	public HomePage3 selectCustomer()  {              //select customer 
		click(selectCustomerName);
		return this;
	}
	
	public HomePage3 addItem(String itemName) {    //addItem
		sendKeys(addItem, itemName);
		return this;
	}
	
	public HomePage3 quantity(String quantity) {    //quant
		sendKeys(quant, quantity);
		return this;
	}
	
	public HomePage3 price(String Price) {    //price
		sendKeys(price, Price);
		return this;
	}
	
	public HomePage3 discount(String Discount) {    //discount
		sendKeys(discount, Discount);
		return this;
	}
	
	
	public HomePage3 addItemButton() {
		click(addButton);
		return this;
	}
	
	public HomePage3 click_datePicker() {
		Actions action = new Actions(driver);
		action.moveToElement(datePicker).click().perform();
		System.out.println("Date picker clicked");
		//click(datePicker);
		return this;
	}
	
	public HomePage3 dateSelection() throws InterruptedException {
		
		click(dateSelection);
		System.out.println("Date selected");
		return this;
	}
	
	public HomePage3 clickOK() {
		click(clickOk);
		return this;
	}
	
	public HomePage3 currency() {
		click(currency);
		return this;
	}
	
	public HomePage3 currencyValue() {
		click(currencyValue);
		return this;
	}
	
	public HomePage3 saveAndContinue() {
		Actions act = new Actions(driver);
		act.moveToElement(saveAndContinue).click().perform();
		//click(saveAndContinue);
		System.out.println("Save and Continue option successfully clicked");
		return this;
	}
	
	public HomePage3 menuButton() {              //menu button
		
		boolean menu = menuButton.isEnabled();
		System.out.println("Menu button is enabled : "+ menu);
		click(menuButton);
		return this;
	}
	
	public HomePage3 logOut() {              //logOut
		//	click(logout);
	    boolean logOUT = logout.isEnabled();
	    System.out.println("Log out option is enabled : "+ logOUT);
	    click(logout);
	    System.out.println("Logged out Successfully");
		return this;
	}
	
public HomePage3 dashBoard() {              //dashboard UI
		
		boolean dash = dashboard.isEnabled();
		System.out.println("Dashboard option is enabled : "+ dash);
		click(dashboard);
		System.out.println("Dashboard option selected successfully");
		return this;
	}

public HomePage3 createButton() {              //create UI
	
	boolean create = createButton.isEnabled();
	System.out.println("Create option is enabled : "+ create);
	click(createButton);
	System.out.println("Create option selected successfully");
	return this;
}

public HomePage3 invoiceButton() {              //invoice UI
	
	boolean invoice = invoiceButton.isEnabled();
	System.out.println("Invoice option is enabled : "+ invoice);
	click(invoiceButton);
	System.out.println("Invoice option selected successfully");
	return this;
}

public HomePage3 customerButton() {              //customer UI
	
	boolean customer = customerButton.isEnabled();
	System.out.println("Customer option is enabled : "+ customer);
	click(customerButton);
	System.out.println("Customer option selected successfully");
	return this;
}

public HomePage3 settingButton() {              //settings UI
	
	boolean settings = setting.isEnabled();
	System.out.println("Settings option is enabled : "+ settings);
	click(setting);
	System.out.println("Settings option selected successfully");
	return this;
}



	
}
