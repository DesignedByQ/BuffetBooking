package com.mock.buffetbooking.service;

import java.util.List;

import com.mock.buffetbooking.dto.BookingDTO;


public interface ServiceDAO {
	
	public BookingDTO bookBuffetService(BookingDTO bookingDTO);
	
	public List<BookingDTO> getBuffetService();

}
