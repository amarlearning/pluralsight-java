package com;

public class CarDemo {
	
	public static Car findCarWithHighestMilage(Car[] carArray) {
		
		int carIndex = 0;
		
		if(carArray == null)
			return null;
		
		if(carArray.length == 0)
			return null;
		
		double maxMilage = Double.MIN_VALUE;
		
		for(int itr = 0; itr < carArray.length; itr++) {
			if(carArray[itr] instanceof Car) {
				if(maxMilage < carArray[itr].getMilage()) {
					maxMilage = carArray[itr].getMilage();
					carIndex = itr;
				}
			}
		}
		return carArray[carIndex];
	}
	
	public static void main(String[] args) {
		
	}
}
