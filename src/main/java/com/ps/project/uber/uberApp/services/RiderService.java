package com.ps.project.uber.uberApp.services;

import java.util.List;

import com.ps.project.uber.uberApp.dto.DriverDto;
import com.ps.project.uber.uberApp.dto.RideDto;
import com.ps.project.uber.uberApp.dto.RideRequestDto;
import com.ps.project.uber.uberApp.dto.RiderDto;

public interface RiderService {
	 RideRequestDto requestRide(RideRequestDto rideRequestDto);
	 RideDto cancelRide(Long rideId);
	 DriverDto rateDriver(Long rideId, Integer raiting);
	 RiderDto getMyProfile();
	 List<RideDto> getAllMyRides();
}
