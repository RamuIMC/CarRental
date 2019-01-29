package com.sample.carrental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.carrental.dao.CarRentalDao;
import com.sample.carrental.dto.CarRentalRequestDto;
import com.sample.carrental.dto.CarRentalResponseDto;

@Service
public class CarRentalServiceImpl implements CarRentalService {

	@Autowired
	private CarRentalDao carRentalDao;
	
	@Override
	public List<CarRentalResponseDto> getCarsByColor(List<CarRentalRequestDto> cars, String color) {
		return carRentalDao.getCarsByColor(cars, color);
	}

}
