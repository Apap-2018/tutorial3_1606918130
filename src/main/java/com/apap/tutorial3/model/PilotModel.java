package com.apap.tutorial3.model;

//Pilot

public class PilotModel {
	public PilotModel(String id, String licenseNumber, String name, Integer flyHour) {
		super();
		this.id = id;
		LicenseNumber = licenseNumber;
		this.name = name;
		this.flyHour = flyHour;
	}
	
	private String id;
	private String LicenseNumber;
	private String name;
	private Integer flyHour;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLicenseNumber() {
		return LicenseNumber;
	}
	public void setLicenseNumber(String licenseNumber) {
		LicenseNumber = licenseNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getFlyHour() {
		return flyHour;
	}
	public void setFlyHour(Integer flyHour) {
		this.flyHour = flyHour;
	}
}
