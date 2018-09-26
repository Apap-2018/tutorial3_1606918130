package com.apap.tutorial3.service;

//PilotService

import java.util.List;

import com.apap.tutorial3.model.PilotModel;

public interface PilotService {
	void addPilot (PilotModel pilot);
	PilotModel removePilot (String licenseNumber);
	List<PilotModel> getPilotList();
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
}