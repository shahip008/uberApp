package com.ps.project.uber.uberApp.services;

import java.util.List;

import com.ps.project.uber.uberApp.dto.DriverDto;
import com.ps.project.uber.uberApp.dto.RideDto;

public interface DriverService {
 RideDto acceptRide(Long rideId);
 RideDto cancelRide(Long rideId);
 RideDto startRide(Long rideId);
 RideDto endRide(Long rideId);
 RideDto rateRider(Long rideId, Integer raiting);
 DriverDto getMyProfile();
 List<RideDto> getAllMyRides();
}
