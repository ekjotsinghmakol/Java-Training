package com.AshaFoodSoftware;

public class Tester {

	public static void main(String[] args) {
		
		//OBJECT OF USERACCOUNTS CLASS TO GET THE USER TO REGISTER AND LOGIN ON THE PAGE
		UserAccounts u1= new UserAccounts();
		u1.userRegistration();
		u1.userLogin();
		
		//OBJECT OF RESTAURANT CLASS TO SEARCH AND DISPLAY ON THE BASIS OF LATTITUDE AND LONGITUDE
		Restaurant rest = new Restaurant();
		rest.searchLatlong();	
	}

}
