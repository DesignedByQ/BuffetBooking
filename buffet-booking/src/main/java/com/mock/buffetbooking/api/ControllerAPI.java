package com.mock.buffetbooking.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mock.buffetbooking.dto.BookingDTO;
import com.mock.buffetbooking.entity.Booking;
import com.mock.buffetbooking.service.ServiceDAO;

@RestController
@RequestMapping("/api")
public class ControllerAPI {
	
	@Autowired
	private ServiceDAO serviceDAO;
	
	@PostMapping(value="/booking", consumes={"application/json", "application/xml"})
	public ResponseEntity<BookingDTO> bookBuffet(@RequestBody BookingDTO bookingDTO){
		
		BookingDTO B = serviceDAO.bookBuffetService(bookingDTO);
		
		if(B.getBookingId() != null) {
			
			B.setMessage("Successfully completed booking: " + B.getBookingId());
			
			return new ResponseEntity<BookingDTO>(B, HttpStatus.CREATED);
			
		} else {
			
			B.setMessage("Booking unsuccessful");
			
			return new ResponseEntity<BookingDTO>(B, HttpStatus.CREATED);
			
		}
		
		//return {ResponseEntity.status(HttpStatus.OK).body(serviceDAO.bookBuffetService(bookingDTO))};
	}
	
	

}
