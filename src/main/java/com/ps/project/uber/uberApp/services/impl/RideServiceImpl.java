package com.ps.project.uber.uberApp.services.impl;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ps.project.uber.uberApp.dto.RideRequestDto;
import com.ps.project.uber.uberApp.entities.Driver;
import com.ps.project.uber.uberApp.entities.Ride;
import com.ps.project.uber.uberApp.entities.enums.RideStatus;
import com.ps.project.uber.uberApp.services.RideService;

@Service
public class RideServiceImpl implements RideService{

	@Override
	public Ride getRideBtId(long rideid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void matchwithDriver(RideRequestDto rideRequestDto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ride updateRideStatus(long rideid, RideStatus rideStatus) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Ride> getAllRidesOfDriver(Long riderId, PageRequest pageRequest) {
		// TODO Auto-generated method stub
		return null;
	}

}
