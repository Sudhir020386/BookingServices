package com.cloud.bookingorder.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.bookingorder.model.Booking;
import com.cloud.bookingorder.repository.BookingOrderClient;

@Service
public class BookingOrderServiceImpl implements BookingOrderService {

	@Autowired
	private BookingOrderClient bookingOrderClient;

	@Override
	public List<Booking> getAll() {
		return bookingOrderClient.getAll();
	}

	@Override
	public void addNewBooking(Booking booking) {
		bookingOrderClient.addNewBooking(booking);
	}

}
