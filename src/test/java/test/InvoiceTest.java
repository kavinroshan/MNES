package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecification;
import page.SignIn_Page1;

public class InvoiceTest extends ProjectSpecification{

	@BeforeTest
	public void setup() {
		excelfile ="CustomerDetails";
	}
	
	@Test (dataProvider = "getData")
	public void SignInTest(String email, String password, String name, String mail, String num, String address, String item, String qty, String price, String discount) throws InterruptedException{
		new SignIn_Page1(driver)
		.email(email)
		.password(password)
		.signInButton()
		.create()
		.addCustomer()
		.name(name)
		.email(mail)
		.phone(num)
		.address(address)
		.save()
		.selectCustomerFiled()
		.selectCustomer()
		.addItem(item)
		.quantity(qty)
		.price(price)
		.discount(discount)
		.click_datePicker()
		.dateSelection()
		.clickOK()
		.currency()
		.currencyValue()
		.saveAndContinue();
	}
}
