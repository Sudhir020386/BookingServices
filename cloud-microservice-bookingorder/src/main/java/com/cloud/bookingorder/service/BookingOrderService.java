package com.cloud.bookingorder.service;

import java.util.List;

import com.cloud.bookingorder.model.Booking;

public interface BookingOrderService {
	List<Booking> getAll();

	void addNewBooking(Booking booking);
}
