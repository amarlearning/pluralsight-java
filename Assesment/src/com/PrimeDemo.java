package com;

public class PrimeDemo {

	public static boolean isPrime(int Number) {
		
		
		if(Number < 0 || Number == 1)
			return false;
		else {
			for(int itr = 2; itr < Number; itr++) {
				if(Number%itr == 0)
					return false;
			}
			
			return true;
		}
	}
	
	public static double addPrimeNumbers(int[] array) {
		
		if(array == null)
			return 0.0;
		else {
			
			double sum = 0.0;
			
			for(int itr = 0; itr < array.length; itr++) {
				if(isPrime(array[itr]))
					sum += array[itr];
			}
			
			return sum;
		}
		
	}
	
	public static void main(String[] args) {
		int a[] = {1,2};
		System.out.println(addPrimeNumbers(a));
	}

}
