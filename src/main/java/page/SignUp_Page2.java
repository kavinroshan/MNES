package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignUp_Page2 extends ProjectSpecification{

	@FindBy(xpath="//input[@name=\"firstName\"]")
	WebElement first_name;
	
	@FindBy(xpath="//input[@name=\"lastName\"]")
	WebElement last_name;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement pass;
	
	@FindBy(xpath="//input[@name=\"confirmPassword\"]")
	WebElement repeat_pass;
	
	@FindBy(xpath="//button[text()=\"Sign Up\"]")
	WebElement click_signup;
	
	public SignUp_Page2(WebDriver driver) {             //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public SignUp_Page2 firstName(String firstname) {
		sendKeys(first_name, firstname);
		return this;
	}
	
	public SignUp_Page2 lastName(String lastname) {
		sendKeys(last_name, lastname);
		return this;
	}
	
	public SignUp_Page2 email(String Email) {
		sendKeys(email, Email);
		return this;
	}
	
	public SignUp_Page2 password(String password) {
		sendKeys(pass, password);
		return this;
	}
	
	public SignUp_Page2 confirmPassword(String conpass) {
		sendKeys(repeat_pass, conpass);
		return this;
	}
	
	public HomePage3 clickSignUp() {
		click(click_signup);
		return new HomePage3(driver);
	}
	
}
