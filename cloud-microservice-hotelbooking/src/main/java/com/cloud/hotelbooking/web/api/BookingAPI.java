package com.cloud.hotelbooking.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.hotelbooking.domain.Booking;
import com.cloud.hotelbooking.repository.BookingRepository;

@RestController
public class BookingAPI {

	@Autowired
	private BookingRepository bookingRepository;

	@RequestMapping(value = "/booking", method = RequestMethod.GET)
	public List<Booking> findAll() {
		return bookingRepository.findAll();
	}

	@RequestMapping(value = "/booking/{bookingId}", method=RequestMethod.GET)
	public List<Booking> findByBookingId(@PathVariable("bookingId") String bookingId) {
		return bookingRepository.findByBookingId(bookingId);

	}

	@RequestMapping(value = "/booking", method = RequestMethod.POST)
	public ResponseEntity<Booking> saveNewBooking(@RequestBody Booking booking) {
		booking = bookingRepository.save(booking);

		return new ResponseEntity<Booking>(booking, HttpStatus.CREATED);
	}

}
