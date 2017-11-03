package com.bikesrental.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class RentalFamily extends Rental {
	
	private List<Rental> rentals;
	
	public RentalFamily(List<Rental> rentals) {
		this.rentals = rentals;
		this.setDate(new Date());
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}

	@Override
	public BigDecimal calculate() {
		BigDecimal result = new BigDecimal(0);
		for (Rental rental : rentals) {
			result = result.add(rental.calculate());
		}
		return result;
			
	}

}
