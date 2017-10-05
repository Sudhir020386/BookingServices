package com.cloud.bookingorder.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.bookingorder.model.Booking;
import com.cloud.bookingorder.service.BookingOrderService;

@RestController
public class BookingOrderWebAPI {

	@Autowired
	private BookingOrderService bookingOrderService;

	@RequestMapping(value = "/bookingorder", method = RequestMethod.GET)
	public List<Booking> getAll() {
		return bookingOrderService.getAll();
	}

	@RequestMapping(value = "/bookingorder", method = RequestMethod.POST)
	public ResponseEntity<Booking> makeNewBooking(@RequestBody Booking booking) {
		bookingOrderService.addNewBooking(booking);

		return new ResponseEntity<Booking>(booking, HttpStatus.CREATED);
	}
}
