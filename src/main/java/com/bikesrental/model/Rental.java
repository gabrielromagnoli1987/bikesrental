package com.bikesrental.model;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Rental {
	
	private Date date;
	
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public abstract BigDecimal calculate();

}
