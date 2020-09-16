package com.tanmay.TanDrugPharma.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.tanmay.TanDrugPharma.dao.MedicineDao;
import com.tanmay.TanDrugPharma.model.Medicine;

@Service
public class MedicineServiceImpl implements MedicineService{

	@Autowired
	MedicineDao medicineDao;
	
	@Override
	public int addMedicine(Medicine m) {
		// TODO Auto-generated method stub
		return medicineDao.addMedicine(m);
	}

	@Override
	public List<Medicine> getMedicines() {
		// TODO Auto-generated method stub
		return medicineDao.getMedicines();
	}

	@Override
	public List<Medicine> getExpired() {
		// TODO Auto-generated method stub
		return medicineDao.getExpired();
	}

	@Override
	public int deleteMedicine(int medId) {
		// TODO Auto-generated method stub
		return medicineDao.deleteMedicine(medId);
	}

	@Override
	public int updateMedicine(Medicine m) {
		// TODO Auto-generated method stub
		return medicineDao.updateMedicine(m);
	}

	@Override
	public Medicine getMedicine(int medId) {
		// TODO Auto-generated method stub
		return medicineDao.getMedicine(medId);
	}

	@Override
	public List<Medicine> sortMedicines() {
		// TODO Auto-generated method stub
		return medicineDao.sortMedicines();
	}

	@Override
	public int sumStock() {
		return medicineDao.sumStock();
	}

	@Override
	public double sumPrice() {
		// TODO Auto-generated method stub
		return medicineDao.sumPrice();
	}

	@Override
	public List<Map<String, Object>> medDet() {
		// TODO Auto-generated method stub
		return medicineDao.medDet();
	}

	@Override
	public double totManfac() {
		// TODO Auto-generated method stub
		return medicineDao.totManfac();
	}

}
