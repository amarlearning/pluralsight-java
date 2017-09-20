package com;

public class ArrayDemo {
	
	public static double findAverage(int[] array) {
		
		double Sum = 0;
		
		if(array.length == 0)
			return 0.0;
		
		else {
			
			for(int temp = 0; temp < array.length; temp++) {
				Sum += array[temp];
			}
			
			return (Sum / array.length);
		}
		
	}
	
	public static void main(String[] args) {
		
		int array[] = {33,3,4,5};
		
		System.out.println(findAverage(array));
	}
	
}
