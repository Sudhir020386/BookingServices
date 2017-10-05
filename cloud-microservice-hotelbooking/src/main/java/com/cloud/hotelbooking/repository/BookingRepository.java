package com.cloud.hotelbooking.repository;

import org.springframework.stereotype.Repository;

import com.cloud.hotelbooking.domain.Booking;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface BookingRepository extends MongoRepository<Booking, String> {

	List<Booking> findByBookingId(@Param("bookingId") String bookingId);

}
