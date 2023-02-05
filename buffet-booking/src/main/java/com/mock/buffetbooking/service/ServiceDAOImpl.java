package com.mock.buffetbooking.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mock.buffetbooking.dto.BookingDTO;
import com.mock.buffetbooking.entity.Booking;
import com.mock.buffetbooking.repo.BookingRepo;

@Service(value="serviceDAO")
public class ServiceDAOImpl implements ServiceDAO {
	
	@Autowired
	private BookingRepo repo;
	
	@Autowired
	private ModelMapper model;
	
	@Override
	public BookingDTO bookBuffetService(BookingDTO bookingDTO) {
		
		Booking B = repo.save(model.map(bookingDTO, Booking.class));

		return model.map(B, BookingDTO.class);
	}

	
	
	
}
