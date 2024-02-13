package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.SignIn_Page1;

public class TC001_Postive_SignUp_Test extends ProjectSpecification {

	@BeforeTest
	public void setup() {
		excelfile ="Positive_SignUp";
	}
	
	@Test (dataProvider = "getData")
	public void SignUpTest(String firstName, String lastName, String email, String password, String repeatPass){
		new SignIn_Page1(driver)
		.clickCreateAccount()
		.firstName(firstName)
		.lastName(lastName)
		.email(email)
		.password(password)
		.confirmPassword(repeatPass)
		.clickSignUp();
	
	}	
}
