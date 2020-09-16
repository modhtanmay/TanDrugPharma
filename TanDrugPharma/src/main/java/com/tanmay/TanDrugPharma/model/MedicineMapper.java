package com.tanmay.TanDrugPharma.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MedicineMapper implements RowMapper<Medicine> {

	public Medicine mapRow(ResultSet rs,int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Medicine medicine = new Medicine();
		medicine.setMedId(rs.getInt(1));
		medicine.setMedName(rs.getString(2));
		medicine.setMedType(rs.getString(3));
		medicine.setMedPrice(rs.getDouble(4));
		medicine.setMedStock(rs.getInt(5));
		medicine.setMedManDate(rs.getDate(6));
		medicine.setMedExpDate(rs.getDate(7));
		
		return medicine;

	}

}
