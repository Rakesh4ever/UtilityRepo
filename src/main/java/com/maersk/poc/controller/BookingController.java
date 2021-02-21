/**
 * 
 */
package com.maersk.poc.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maersk.poc.model.Booking;
import com.maersk.poc.model.CheckAvailability;
import com.maersk.poc.repo.BookingRepo;

/**
 * @author rkumar
 *
 */

@RestController
@RequestMapping("/api")
public class BookingController {
	
	@Autowired
	private BookingRepo bookingRepo;
	
	@GetMapping("/bookings/status")
	public CheckAvailability getAllRowRecords(CheckAvailability chkAvail) {
		chkAvail.setAvailable(true);
		Long count=(long) 0;
		Iterable<Booking> data=bookingRepo.findAll();
		for(Booking temp:data) {
			count++;
		}
		chkAvail.setAvailableSpace(count);
		if(count==(long)0) {
			chkAvail.setAvailable(false);
		}
		return chkAvail;
	}

}
