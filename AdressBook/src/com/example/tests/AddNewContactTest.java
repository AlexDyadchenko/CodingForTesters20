package com.example.tests;

import org.testng.annotations.Test;

public class AddNewContactTest extends TestBase {
 
  @Test
  public void testAddNonEmptyContact() throws Exception {
	openMainPage();
    addNewContact();
    ConactData contact = new ConactData();
    contact.firstname = "First Name 1";
    contact.lastname = "Last Name 1";
    contact.address = "Address 1";
    contact.tel_home = "Home Telephone 1";
    contact.tel_mobile = "Mobile Telephone 1";
    contact.tel_work = "Work Telephone 1";
    contact.mail_main = "mail 1";
    contact.mail_secondary = "mail 2";
    contact.bday = "30";
    contact.bmonth = "October";
    contact.byear = "2014";
    contact.address_secondary = "Secondary Address 1";
    contact.tel_home_secondary = "Secondary Home Tel 1";
	fillContactForm(contact);
    submitContact();
  }

  @Test
  public void testAddEmptyContact() throws Exception {
	openMainPage();
    addNewContact();
    ConactData contact = new ConactData();
    contact.firstname = "";
    contact.lastname = "";
    contact.address = "";
    contact.tel_home = "";
    contact.tel_mobile = "";
    contact.tel_work = "";
    contact.mail_main = "";
    contact.mail_secondary = "";
    contact.bday = "-";
    contact.bmonth = "-";
    contact.byear = "";
    contact.address_secondary = "";
    contact.tel_home_secondary = "";
	fillContactForm(contact);
    submitContact();
  }
}

