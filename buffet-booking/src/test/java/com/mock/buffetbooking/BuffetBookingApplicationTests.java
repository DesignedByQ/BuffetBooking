package com.mock.buffetbooking;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import com.mock.buffetbooking.api.ControllerAPI;
import com.mock.buffetbooking.dto.BookingDTO;
import com.mock.buffetbooking.entity.Booking;
import com.mock.buffetbooking.repo.BookingRepo;
import com.mock.buffetbooking.service.ServiceDAO;

@SpringBootTest
class BuffetBookingApplicationTests {

	@Autowired
	private BookingRepo repo;
	
	@Autowired
	private ControllerAPI controllerAPI;
	
	@Autowired
	private ServiceDAO serviceDAO;
	
	List<BookingDTO> testBookingList = new ArrayList();
	

	//Objects for testing
	//Booking b1 = new Booking();
	public BookingDTO createBDTO1() {
		
		BookingDTO b = new BookingDTO();
		b.setBookingId(5);
		b.setBuffetName("jamaican");
		b.setEmailId("a@mail.com");
		b.setPlateCount(10);
		b.setBookedOn(LocalDate.now());
		b.setMessage("testing");
		
		return b;
		
	}
	
	public BookingDTO createBDTO2() {
		
		BookingDTO b = new BookingDTO();
		b.setBookingId(6);
		b.setBuffetName("italian");
		b.setEmailId("g@mail.com");
		b.setPlateCount(100);
		b.setBookedOn(null);
		b.setMessage("testing");
		
		return b;
		
	}
	
	@BeforeEach
	public void setup() {
		
		testBookingList.clear(); //clear the arraylist 
		
		repo.deleteAll(); //clears db
		
		controllerAPI.bookBuffet(createBDTO1());
		
		controllerAPI.bookBuffet(createBDTO2());
		
	}
	
	@Test
	public void bookBuffetTest() {
		
		BookingDTO b = new BookingDTO();
		//b.setBookingId(1);
		b.setBuffetName("jamaican");
		b.setEmailId("a@mail.com");
		b.setPlateCount(10);
		b.setBookedOn(LocalDate.now());
		b.setMessage("testing");
		
		controllerAPI.bookBuffet(b);
		//repo.save(b);
		
		assertNotNull(repo.findById(7).get());
		
	}
	
	@Test
	public void getBuffetTest() {
		
		//testBookingList.add(createBDTO1());
		//testBookingList.add(createBDTO2());
		
		//List<BookingDTO> tempL = serviceDAO.getBuffetService();
		//repo.save(b);
		
		Assertions.assertNotNull(serviceDAO.getBuffetService());
		
	}

}
