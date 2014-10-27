package com.example.fw;

import org.openqa.selenium.By;

import com.example.tests.ContactData;

public class ContactHelper extends HelperBase {

	public ContactHelper(ApplicationManager manager) {
		super(manager);
	}

	public void addNewContact() {
		
		click(By.linkText("add new"));
	}

	public void fillContactForm(ContactData contact) {
		type(By.name("firstname"), contact.firstname);
		type(By.name("lastname"), contact.lastname);
	    type(By.name("address"), contact.address);
	    type(By.name("home"), contact.tel_home);
	    type(By.name("mobile"), contact.tel_mobile);
	    type(By.name("work"), contact.tel_work);
	    type(By.name("email"), contact.mail_main);
	    type(By.name("email2"), contact.mail_secondary);
	    selectByText(By.name("bday"), contact.bday);
	    selectByText(By.name("bmonth"), contact.bmonth);
	    type(By.name("byear"), contact.byear);
	    type(By.name("address2"), contact.address_secondary);
	    type(By.name("phone2"), contact.tel_home_secondary);
	}

	public void submitContact() {
	
		click(By.name("submit"));
	}

}
