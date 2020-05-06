package com.rest.controller;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
public class Patient {
	
	private String patientName;	
	private int patientAge;
	
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	
	
	
	
}
