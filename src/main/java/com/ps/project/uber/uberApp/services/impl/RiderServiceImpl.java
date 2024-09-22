package com.ps.project.uber.uberApp.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ps.project.uber.uberApp.dto.DriverDto;
import com.ps.project.uber.uberApp.dto.RideDto;
import com.ps.project.uber.uberApp.dto.RideRequestDto;
import com.ps.project.uber.uberApp.dto.RiderDto;
import com.ps.project.uber.uberApp.services.RiderService;

@Service
public class RiderServiceImpl implements RiderService {

	@Override
	public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RideDto cancelRide(Long rideId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DriverDto rateDriver(Long rideId, Integer raiting) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RiderDto getMyProfile() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RideDto> getAllMyRides() {
		// TODO Auto-generated method stub
		return null;
	}

}
