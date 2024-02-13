package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecification;

public class SignIn_Page1 extends ProjectSpecification {
	
	
	@FindBy(xpath = "//span[text()=\"Don't have an account? Sign Up\"]")
	WebElement clickCreateAccount;
	
	@FindBy(xpath="//input[@name=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//input[@name=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//button[text()=\"Sign In\"]")
	WebElement signInButton;
	
	
	public SignIn_Page1(WebDriver driver) {             //constructor
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public SignUp_Page2 clickCreateAccount() {      //Create_AccountButton
		click(clickCreateAccount);
		return new SignUp_Page2(driver);
	}
	

	public SignIn_Page1 email(String mail) {   //enter Email_id
		sendKeys(email, mail);
		return this;
	}

	public SignIn_Page1 password(String pass) {   //enter Password
		sendKeys(password, pass);
		return this;
	}
	
	public HomePage3 signInButton() {   //click SignIn Button
		click(signInButton);
		return new HomePage3(driver);
	}
}
