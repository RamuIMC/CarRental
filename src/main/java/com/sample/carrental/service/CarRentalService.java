package com.sample.carrental.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.sample.carrental.dto.CarRentalRequestDto;
import com.sample.carrental.dto.CarRentalResponseDto;

public interface CarRentalService {

	public List<CarRentalResponseDto> getCarsByColor(@RequestBody List<CarRentalRequestDto> cars,String color);
}
