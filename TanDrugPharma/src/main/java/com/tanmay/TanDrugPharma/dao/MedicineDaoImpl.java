package com.tanmay.TanDrugPharma.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.tanmay.TanDrugPharma.model.Medicine;
import com.tanmay.TanDrugPharma.model.MedicineMapper;

@Component
public class MedicineDaoImpl implements MedicineDao{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addMedicine(Medicine m) {
		// TODO Auto-generated method stub
		String sql = "insert into medicine(medName,medType,medPrice,medStock,medManDate,medExpDate) values(?,?,?,?,?,?)";
		return jdbcTemplate.update(sql,new Object[] {m.getMedName(),m.getMedType(),m.getMedPrice(),m.getMedStock(),m.getMedManDate(),m.getMedExpDate()});
	}

	@Override
	public List<Medicine> getMedicines() {
		// TODO Auto-generated method stub
		String sql = "select * from medicine";
		List<Medicine> medicine = jdbcTemplate.query(sql, new MedicineMapper());
		return medicine;
	}

	@Override
	public List<Medicine> getExpired() {
		// TODO Auto-generated method stub
		String sql = "select * from medicine where medExpDate < ?";
		List<Medicine> medicine = jdbcTemplate.query(sql,new Object[] {java.time.LocalDate.now()},new MedicineMapper());
		return medicine;
	}

	@Override
	public int updateMedicine(Medicine m) {
		// TODO Auto-generated method stub
		String sql = "update medicine set medName=?,medType=?,medPrice=?,medStock=?,medManDate=?,medExpDate=? where medId=?";
		return jdbcTemplate.update(sql,m.getMedName(),m.getMedType(),m.getMedPrice(),m.getMedStock(),m.getMedManDate(),m.getMedExpDate(),m.getMedId());
	}

	@Override
	public int deleteMedicine(int medId) {
		// TODO Auto-generated method stub
		String sql = "delete from medicine where medId = ?";
		return jdbcTemplate.update(sql,medId);
	}

	@Override
	public Medicine getMedicine(int medId) {
		// TODO Auto-generated method stub
		String sql = "select * from medicine where medId=?";
		return jdbcTemplate.queryForObject(sql, new Object[] {medId},new MedicineMapper());
	}

	@Override
	public List<Medicine> sortMedicines() {
		// TODO Auto-generated method stub
		String sql = "select * from medicine order by medName";
		List<Medicine> medicine = jdbcTemplate.query(sql, new MedicineMapper());
		return medicine;
	}

	@Override
	public int sumStock() {
		// TODO Auto-generated method stub
		String sql1 = "select sum(medStock) from medicine";
		int s = jdbcTemplate.queryForObject(sql1, Integer.class);
		return s;
	}
	
	@Override
	public double sumPrice() {
		// TODO Auto-generated method stub
		String sql1 = "select sum(medPrice) from medicine";
		double s = jdbcTemplate.queryForObject(sql1, Double.class);
		return s;
	}

	@Override
	public List<Map<String, Object>> medDet() {
		// TODO Auto-generated method stub
		String sql = "select medId,medName,medPrice,medStock from medicine";
		List<Map<String, Object>> queryForList = jdbcTemplate.queryForList(sql);
		return queryForList;
	}

	@Override
	public double totManfac() {
		// TODO Auto-generated method stub
		String sql1 = "select sum(medPrice*medStock) from medicine";
		double s = jdbcTemplate.queryForObject(sql1, Double.class);
		return s;
	}
}
