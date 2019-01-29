package com.sample.carrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.carrental.dto.CarRentalRequestDto;
import com.sample.carrental.dto.CarRentalResponseDto;
import com.sample.carrental.service.CarRentalService;

@RestController
@RequestMapping("/car/rental")
public class CarRentalController {
	
	@Autowired
	private CarRentalService carRentalService;
	
	@PostMapping(value="/color/{color}")
	public List<CarRentalResponseDto> getCarsByColor(@PathVariable("color") String color, @RequestBody List<CarRentalRequestDto> cars){
		return carRentalService.getCarsByColor(cars,color);
		
	}

}
