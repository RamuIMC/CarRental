package com.sample.carrental.dao;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.sample.carrental.dto.CarRentalRequestDto;
import com.sample.carrental.dto.CarRentalResponseDto;

@Component
public class CarRentalDaoImpl implements CarRentalDao {

	@Override
	public List<CarRentalResponseDto> getCarsByColor(List<CarRentalRequestDto> cars, String color) {
		
		ModelMapper modelMapper = new ModelMapper();
		List<CarRentalResponseDto> specificColorCars = new ArrayList<>();
		CarRentalResponseDto carRentalResponse = null;
		for(CarRentalRequestDto car:cars) {
			if(car.getCar().getMetadata().getColor().equalsIgnoreCase(color)) {
				carRentalResponse = modelMapper.map(car, CarRentalResponseDto.class);
				specificColorCars.add(carRentalResponse);			
			}
		}
		return specificColorCars;
	}

}
