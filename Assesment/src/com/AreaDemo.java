package com;

public class AreaDemo {
	
	final static double pie = (22.0/7);
	
	public static double findArea(double Radius) {
	
		if(Radius < 0) {
			return -1;
		} else {
			double circlearea = pie * Radius * Radius;
			return circlearea;
		}
	}
	
	public static double findArea(double Length, double Width) {
		
		if(Length < 0 || Width < 0) {
			return -1;
		} else {
			double rectangleArea = Length * Width;
			return rectangleArea;
		}
	}
	
	public static double findVolume(double Radius) {
		
		if(Radius < 0) {
			return -1;
		} else {
			double spherevolume = (4 * pie * (Radius * Radius * Radius)) / 3;
			return spherevolume;
		}
	}
	
	public static double findVolume(double Radius, double Height) {

		if(Radius < 0 || Height < 0) {
			return -1;
		} else {
			double cylindervolume = pie * Radius * Radius * Height;
			return cylindervolume;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(findArea(5));
		System.out.println(findArea(5,6));
		System.out.println(findVolume(5));
		System.out.println(findVolume(5,6));
	}
	
}
