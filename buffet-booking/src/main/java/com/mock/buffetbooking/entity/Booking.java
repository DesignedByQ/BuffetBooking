package com.mock.buffetbooking.entity;

import java.time.LocalDate;

import jakarta.persistence.*;


import jakarta.annotation.Generated;

@Entity
@Table(name="booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer bookingId;
	private String buffetName;
	private String emailId;
	private Integer plateCount;
	private LocalDate bookedOn;
	
	public Booking() {
		super();
	}

	public Booking(String buffetName, String emailId, Integer plateCount, LocalDate bookedOn) {
		super();
		this.buffetName = buffetName;
		this.emailId = emailId;
		this.plateCount = plateCount;
		this.bookedOn = bookedOn;
	}

	public String getBuffetName() {
		return buffetName;
	}

	public void setBuffetName(String buffetName) {
		this.buffetName = buffetName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Integer getPlateCount() {
		return plateCount;
	}

	public void setPlateCount(Integer plateCount) {
		this.plateCount = plateCount;
	}

	public LocalDate getBookedOn() {
		return bookedOn;
	}

	public void setBookedOn(LocalDate bookedOn) {
		this.bookedOn = bookedOn;
	}

	@Override
	public String toString() {
		return "BookingDTO [buffetName=" + buffetName + ", emailId=" + emailId + ", plateCount=" + plateCount
				+ ", bookedOn=" + bookedOn + "]";
	}

}
