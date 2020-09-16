package com.tanmay.TanDrugPharma.service;

import java.util.List;
import java.util.Map;

import com.tanmay.TanDrugPharma.model.Medicine;

public interface MedicineService {
	
	// Add Medicine
	public int addMedicine(Medicine m);
	
	// Delete Medicine
	public int deleteMedicine(int medId);
	
	// Updates Medicine
	public int updateMedicine(Medicine m);
	
	// Displays Medicines Details
	public List<Medicine> getMedicines();
	
	// Gets Medicine ById
	public Medicine getMedicine(int medId);
	
	// Lists Expired Medicines
	public List<Medicine> getExpired();
	
	// Sorts ByName
	public List<Medicine> sortMedicines();
	
	// Shows Total Stock of Medicine
	public int sumStock();
	
	// Shows Total Price of Medicine
	public double sumPrice();
	
	// Shows Summary of Medicine
	public List<Map<String, Object>> medDet();

	// Shows Total Manufactured Cost
	public double totManfac();
	

}
