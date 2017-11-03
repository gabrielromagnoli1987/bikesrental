package com.bikesrental.model;

import java.math.BigDecimal;
import java.util.Date;

public class RentalDay extends Rental {
	
	private Integer days;
	private BigDecimal price;
	
	
	public RentalDay(Integer days, BigDecimal price) {
		this.days = days;
		this.price = price;
		this.setDate(new Date());
	}
	
	public Integer getDays() {
		return days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	@Override
	public BigDecimal calculate() {
		return new BigDecimal(this.getDays()).multiply(this.getPrice());
	}

}
