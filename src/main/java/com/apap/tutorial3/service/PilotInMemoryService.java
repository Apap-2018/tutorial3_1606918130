package com.apap.tutorial3.service;

//PilotInMemoryService

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tutorial3.model.PilotModel;

@Service
public class PilotInMemoryService implements PilotService {
	private ArrayList<PilotModel> archivePilot;

	public PilotInMemoryService() {
		archivePilot = new ArrayList<>();
	}

	@Override
	public void addPilot(PilotModel pilot) {
		archivePilot.add(pilot);
	}

	@Override
	public List<PilotModel> getPilotList() {
		return archivePilot;
	}

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		for (PilotModel pilot : archivePilot) {
			if (pilot.getLicenseNumber().equals(licenseNumber)) {
				return pilot;
			}
		}
		return null;
	}

	@Override
	public PilotModel removePilot(String licenseNumber) {
		PilotModel pilotDelete = null;
		pilotDelete = getPilotDetailByLicenseNumber(licenseNumber);
		if (pilotDelete!=null) {
			archivePilot.remove(pilotDelete);
		}
		return pilotDelete;
	}
}