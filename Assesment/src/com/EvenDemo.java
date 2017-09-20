package com;

public class EvenDemo {
	
	public static int[] findEvenValues(int[] array) {
		
		if(array == null)
			return null;
		else {
			int cnt = 0, temp = 0;
			for(int itr = 0; itr < array.length; itr++) {
				if(array[itr]%2 == 0)
					cnt++;
			}
			
			int[] result = new int[cnt];
			for(int itr = 0; itr < array.length; itr++) {
				if(array[itr]%2 == 0)
					result[temp++] = array[itr];
			}
			return result;
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
