package com;

public class PointDemo {
	
	/*public static double findDistance(Point one, Point two) {
		
		if(one == null || two == null) {
			return 0.0;
		} else {
			double XDistance = Math.pow((one.getxCoordinate() - two.getxCoordinate()), 2);
			double YDistance = Math.pow((one.getyCoordinate() - two.getyCoordinate()), 2);
			
			return Math.sqrt(XDistance + YDistance);
		}
	}*/
	
	public static Point addPoints(Point one, Point two) {
		
		if(one == null || two == null) {
			return null;
		} else {
			Point C = new Point(0.0, 0.0);
			C.setxCoordinate(one.getxCoordinate() + two.getxCoordinate());
			C.setyCoordinate(one.getyCoordinate() + two.getyCoordinate());
			
			return C;
		}
	}
	
	public static Point subtractPoints(Point one, Point two) {
		
		if(one == null || two == null) {
			return null;
		} else {
			Point C = new Point(0.0, 0.0);
			C.setxCoordinate(one.getxCoordinate() - two.getxCoordinate());
			C.setyCoordinate(one.getyCoordinate() - two.getyCoordinate());
			
			return C;
		}
	}
	
	public static void main(String[] args) {
				
	}
	
}
