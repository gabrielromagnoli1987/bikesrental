package com.bikesrental;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.bikesrental.model.Rental;
import com.bikesrental.model.RentalDay;
import com.bikesrental.model.RentalFamily;
import com.bikesrental.model.RentalHour;
import com.bikesrental.model.RentalWeek;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BikesRentalApplicationTests {

	@Test
	public void rentalHourTest() {
		RentalHour rh = new RentalHour(0, new BigDecimal("0"));
		rh.setHours(1);
		rh.setPrice(new BigDecimal("5"));
		Assert.assertEquals(new BigDecimal("5"), rh.calculate());
	}
		
	@Test
	public void rentalDayTest(){
		RentalDay rd = new RentalDay(1, new BigDecimal("20"));
		Assert.assertEquals(new BigDecimal("20"), rd.calculate());
	}
	
	@Test
	public void rentalWeekTest(){
		RentalWeek rw = new RentalWeek(1, new BigDecimal("60"));
		Assert.assertEquals(new BigDecimal("60"), rw.calculate());
	}
	
	@Test
	public void rentalFamilyTest(){
		List<Rental> rentals = new ArrayList<Rental>();
		
		RentalHour rh = new RentalHour(1, new BigDecimal("5"));
		rentals.add(rh);
		RentalHour rh2 = new RentalHour(2, new BigDecimal("5"));
		rentals.add(rh2);
		RentalDay rd = new RentalDay(1, new BigDecimal("20"));
		rentals.add(rd);
		RentalWeek rw = new RentalWeek(1, new BigDecimal("60"));
		rentals.add(rw);
		
		RentalFamily rf = new RentalFamily(rentals);
		Assert.assertEquals(new BigDecimal("95"), rf.calculate());
	}
	
	@Test
	public void rentalsTest(){
		
		RentalHour rh = new RentalHour(1, new BigDecimal("5"));
		RentalDay rd = new RentalDay(1, new BigDecimal("20"));
		RentalWeek rw = new RentalWeek(1, new BigDecimal("60"));
		
		List<Rental> rentals = new ArrayList<Rental>();
		rentals.add(rh);
		rentals.add(rd);
		rentals.add(rw);
		RentalFamily rf = new RentalFamily(rentals);
		
		List<Rental> allRentals = new ArrayList<Rental>();
		allRentals.add(rh);
		allRentals.add(rd);
		allRentals.add(rw);
		allRentals.add(rf);
		
		BigDecimal result = new BigDecimal(0);
		
		for (Rental rental : allRentals) {
			result = result.add(rental.calculate());
		}
		
		Assert.assertEquals(new BigDecimal("170"), result);
		
	}

}
