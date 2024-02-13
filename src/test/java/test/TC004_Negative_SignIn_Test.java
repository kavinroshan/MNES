package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.SignIn_Page1;

public class TC004_Negative_SignIn_Test extends ProjectSpecification {
	
	@BeforeTest
	public void setup() {
		excelfile ="NegativeSignIn_TestCase";
	}
	
	@Test (dataProvider = "getData")
	public void SignInTest(String email, String password){
		new SignIn_Page1(driver)
		.email(email)
		.password(password)
		.signInButton();
	}
}
