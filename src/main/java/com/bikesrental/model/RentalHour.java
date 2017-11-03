package com.bikesrental.model;

import java.math.BigDecimal;
import java.util.Date;

public class RentalHour extends Rental {
	
	private Integer hours;
	private BigDecimal price;
	
	public RentalHour(Integer hours, BigDecimal price) {
		this.hours = hours;
		this.price = price;
		this.setDate(new Date()); 
	}

	public Integer getHours() {
		return hours;
	}
	
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	@Override
	public BigDecimal calculate() {
		return new BigDecimal(this.getHours()).multiply(this.getPrice());
	}

}
