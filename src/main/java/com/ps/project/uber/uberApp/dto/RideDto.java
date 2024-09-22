package com.ps.project.uber.uberApp.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CurrentTimestamp;
import org.locationtech.jts.geom.Point;

import com.ps.project.uber.uberApp.entities.Driver;
import com.ps.project.uber.uberApp.entities.Rider;
import com.ps.project.uber.uberApp.entities.enums.PaymentMethod;
import com.ps.project.uber.uberApp.entities.enums.RideRequestStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {
	private long id;
	private RiderDto rider;
	private Point pickUpLocation;
	private Point dropOffLocation;
	private LocalDateTime createdTime;
	private DriverDto driver;
	private PaymentMethod paymentMethod;
	private RideRequestStatus rideStatus;
	private Double fare;
	private LocalDateTime startedAt;
	private LocalDateTime endedAt;
}
