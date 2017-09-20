package com;

public class Point {
	
	private double xCoordinate;
	private double yCoordinate;
	
	public Point(double xCoordinate, double yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public double getxCoordinate() {
		return this.xCoordinate;
	}
	
	public double getyCoordinate() {
		return this.yCoordinate;
	}
	
	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}
	
	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
}
