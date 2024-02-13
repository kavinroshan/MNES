package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.SignIn_Page1;

public class TC003_Positive_SignIn_Test extends ProjectSpecification{

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
		.signInVerification();
//		.create()
//		.addCustomer()
//		.name(name)
//		.email(mail)
//		.phone(num)
//		.address(address)
//		.save()
//		.selectCustomerFiled()
//		.selectCustomer()
//		.click_datePicker()
//		.dateSelection()
//		.clickOK()
//		.currency()
//		.currencyValue()
//		.saveAndContinue();
	}
	
	
}
