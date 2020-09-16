package com.tanmay.TanDrugPharma;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;
import java.util.List;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.junit4.SpringRunner;

import com.tanmay.TanDrugPharma.dao.MedicineDao;
import com.tanmay.TanDrugPharma.dao.MedicineDaoImpl;
import com.tanmay.TanDrugPharma.model.Medicine;
import com.tanmay.TanDrugPharma.service.MedicineService;
import com.tanmay.TanDrugPharma.service.MedicineServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
class MedicineTest extends TanDrugPharmaApplicationTests {
	
	Medicine medicine = new Medicine(7,"Paracetamol","Cold",150.21,100,new Date(2020-01-01),new Date(2020-01-12));

	@Autowired
	MedicineService medicineService;
	
	@Test
	public void testAdd() {
		assertEquals(1,medicineService.addMedicine(medicine));
	}
	
	@Test
	public void testEdit() {
		assertEquals(1, medicineService.updateMedicine(medicine));
	}
	
	@Test
	public void testDelete() {
		assertEquals(1, medicineService.deleteMedicine(medicine.getMedId()));
	}

}
