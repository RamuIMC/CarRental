package com.sample.carrental.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.sample.carrental.dto.CarRentalRequestDto;
import com.sample.carrental.dto.CarRentalResponseDto;

public interface CarRentalDao {
	
	public List<CarRentalResponseDto> getCarsByColor(@RequestBody List<CarRentalRequestDto> cars, String color);

}
