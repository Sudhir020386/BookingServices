package com.cloud.bookingorder.repository;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloud.bookingorder.model.Booking;

@FeignClient("HOTELBOOKING-MS")
public interface BookingOrderClient {

	@RequestMapping("/booking")
	List<Booking> getAll();

	@RequestMapping(value = "/booking", method = RequestMethod.POST)
	ResponseEntity<Booking> addNewBooking(@RequestBody Booking booking);

}
