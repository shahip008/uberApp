package com.ps.project.uber.uberApp.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.ps.project.uber.uberApp.dto.RideRequestDto;
import com.ps.project.uber.uberApp.entities.Driver;
import com.ps.project.uber.uberApp.entities.Ride;
import com.ps.project.uber.uberApp.entities.enums.RideStatus;

public interface RideService {
	Ride getRideBtId(long rideid);
	void matchwithDriver(RideRequestDto rideRequestDto);
	Ride createNewRide(RideRequestDto rideRequestDto,Driver driver);
	Ride updateRideStatus(long rideid, RideStatus rideStatus);
	Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);
	Page<Ride> getAllRidesOfDriver(Long riderId, PageRequest pageRequest);
}
