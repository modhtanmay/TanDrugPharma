package com.tanmay.TanDrugPharma.model;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.format.annotation.DateTimeFormat;

public class Medicine {

	private Integer medId;
	
	@NotBlank(message="Medicine Name Required")
	private String medName;
	
	@NotBlank(message="Medicine Type Required")
	private String medType;
	
	@NotNull(message="Medicine Price Required")
	private Double medPrice;
	
	@NotNull(message="Medicine Stock is Required")
	@Min(0)
	private Integer medStock;
	
	@Past(message="Date must be less than current date")
	@NotNull(message="Manufactured Date Required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date medManDate;
	
	@NotNull(message="Expiry Date Required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date medExpDate;
	
	public Integer getMedId() {
		return medId;
	}
	public void setMedId(Integer medId) {
		this.medId = medId;
	}
	public String getMedName() {
		return medName;
	}
	public void setMedName(String medName) {
		this.medName = medName;
	}
	public String getMedType() {
		return medType;
	}
	public void setMedType(String medType) {
		this.medType = medType;
	}
	public Double getMedPrice() {
		return medPrice;
	}
	public void setMedPrice(Double medPrice) {
		this.medPrice = medPrice;
	}
	public Date getMedManDate() {
		return medManDate;
	}
	public Integer getMedStock() {
		return medStock;
	}
	public void setMedStock(Integer medStock) {
		this.medStock = medStock;
	}
	public void setMedManDate(Date medManDate) {
		this.medManDate = medManDate;
	}
	public Date getMedExpDate() {
		return medExpDate;
	}
	public void setMedExpDate(Date medExpDate) {
		this.medExpDate = medExpDate;
	}
	public Medicine(Integer medId, @NotBlank(message = "Medicine Name Required") String medName,
			@NotBlank(message = "Medicine Type Required") String medType, @NotNull Double medPrice,
			@NotNull Integer medStock,
			@Past(message = "Date must be less than current date") @NotNull(message = "Date cannot be blank") Date medManDate,
			@NotNull(message = "Date cannot be blank") Date medExpDate) {
		super();
		this.medId = medId;
		this.medName = medName;
		this.medType = medType;
		this.medPrice = medPrice;
		this.medStock = medStock;
		this.medManDate = medManDate;
		this.medExpDate = medExpDate;
	}
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
}