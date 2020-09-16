package com.tanmay.TanDrugPharma.exception;

import java.util.Date;

public class ExceptionDetails {
	
	private Date data;
	private String message;
	private String detail;
	public ExceptionDetails(Date data, String message, String detail) {
		super();
		this.data = data;
		this.message = message;
		this.detail = detail;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
}