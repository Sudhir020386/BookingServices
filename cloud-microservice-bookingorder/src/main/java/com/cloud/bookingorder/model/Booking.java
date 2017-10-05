package com.cloud.bookingorder.model;

public class Booking {

	private String bookingId;

	private String name;
	private String address;
	private String mobileNumber;

	public Booking() {
		// TODO Auto-generated constructor stub
	}

	public Booking(String bookingId, String name, String address, String mobileNumber) {
		super();
		this.bookingId = bookingId;
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}

	public String getBookingId() {
		return bookingId;
	}

	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

}
