package com.mock.buffetbooking;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BuffetBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuffetBookingApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return modelMapper();
	}

}
