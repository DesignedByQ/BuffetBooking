package com.mock.buffetbooking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

	@Override
	public List<BookingDTO> getBuffetService() {

		List<Booking> op = repo.findAll();
		
		List<BookingDTO> b = new ArrayList();
		
		for(Booking a: op) {
			
			b.add(model.map(a, BookingDTO.class));
			
		}
		
		return b;
		
	}

	
	
	
}
