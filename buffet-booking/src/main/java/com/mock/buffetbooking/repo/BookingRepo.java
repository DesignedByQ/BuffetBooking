package com.mock.buffetbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mock.buffetbooking.dto.BookingDTO;
import com.mock.buffetbooking.entity.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer>{
	
	//FOR TESTING
	//public BookingDTO findByEmailId();

}
