package com.example.tests;

public class ContactData {
	public String firstname;
	public String lastname;
	public String address;
	public String tel_home;
	public String tel_mobile;
	public String tel_work;
	public String mail_main;
	public String mail_secondary;
	public String bday;
	public String bmonth;
	public String byear;
	public String address_secondary;
	public String tel_home_secondary;
	
	public ContactData() {
		
	}

	public ContactData(String firstname, String lastname, String address,
			String tel_home, String tel_mobile, String tel_work,
			String mail_main, String mail_secondary, String bday,
			String bmonth, String byear, String address_secondary,
			String tel_home_secondary) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.tel_home = tel_home;
		this.tel_mobile = tel_mobile;
		this.tel_work = tel_work;
		this.mail_main = mail_main;
		this.mail_secondary = mail_secondary;
		this.bday = bday;
		this.bmonth = bmonth;
		this.byear = byear;
		this.address_secondary = address_secondary;
		this.tel_home_secondary = tel_home_secondary;
	}
}