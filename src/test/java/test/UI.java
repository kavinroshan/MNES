package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.SignIn_Page1;

public class UI extends ProjectSpecification{
	

	@BeforeTest
	public void setup() {
		excelfile ="Positive_SignIn";
	}
	
	@Test (dataProvider = "getData")
	public void SignInTest(String email, String password) throws InterruptedException{
		new SignIn_Page1(driver)
		.email(email)
		.password(password)
		.signInButton()
		.dashBoard()
		.createButton()
		.invoiceButton()
		.customerButton()
		.settingButton()
		.menuButton()
		.logOut();

}
}
