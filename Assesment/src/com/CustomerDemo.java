package com;

public class CustomerDemo {
	
	public static String findYoungestCustomerName(Customer[] custArray, char gender) {
		
		if(custArray == null)
			return null;
		
		if(custArray.length == 0)
			return null;
		
		double minAge = Double.MAX_VALUE;
		String Name = "";
		
		for(int itr = 0; itr < custArray.length; itr++) {
		
			if(custArray[itr] instanceof Customer) {
				if(minAge > custArray[itr].getAge() && custArray[itr].getGender() == gender) {
					minAge = custArray[itr].getAge();
					Name = custArray[itr].getName();
				}
			}
			
		}
		return Name;
	}

	public static void main(String[] args) {
		
		Customer COne = new Customer(1, 'm', "Amar Pandey", 10.0);
		Customer CTwo = new Customer(2, 'f', "Gullu Pandey", 9.0);
		
		Customer[] custArray = {COne, CTwo};
		
		System.out.println(CustomerDemo.findYoungestCustomerName(custArray, 'f'));
	}
	
}
