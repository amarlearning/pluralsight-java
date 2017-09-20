package com;

public class Doctor {
	
	private int regNo;
	private String doctorName;
	private String specialization;
	private double consultingFee;
	
	public Doctor(int regNo, String doctorName, String specialization, double consultingFee) {
		this.regNo = regNo;
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.consultingFee = consultingFee;
	}
	
	public int getRegNo() {
		return this.regNo;
	}
	
	public String getDoctorName() {
		return this.doctorName;
	}
	
	public String getSpecilization() {
		return this.specialization;
	}
	
	public double getConsultingFee() {
		return this.consultingFee;
	}
	
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	
	public void setConsultingFee(double consultingFee) {
		this.consultingFee = consultingFee;
	}
	
	public String displayDoctorDetail() {
		return "Doctor Name :" + this.doctorName + " Specialization :" + this.specialization;
	}
	
}
