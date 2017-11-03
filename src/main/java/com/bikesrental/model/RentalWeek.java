package com.bikesrental.model;

import java.math.BigDecimal;
import java.util.Date;

public class RentalWeek extends Rental {
	
	private Integer weeks;
	private BigDecimal price;
	
	
	public RentalWeek(Integer weeks, BigDecimal price) {
		this.weeks = weeks;
		this.price = price;
		this.setDate(new Date());
	}
	
	public Integer getWeeks() {
		return weeks;
	}

	public void setWeeks(Integer weeks) {
		this.weeks = weeks;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public BigDecimal calculate() {
		return new BigDecimal(this.getWeeks()).multiply(this.getPrice());
	}

}
