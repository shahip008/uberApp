package com.ps.project.uber.uberApp.dto;

import java.time.LocalDateTime;

import org.hibernate.annotations.CurrentTimestamp;
import org.locationtech.jts.geom.Point;

import com.ps.project.uber.uberApp.entities.Rider;
import com.ps.project.uber.uberApp.entities.enums.PaymentMethod;
import com.ps.project.uber.uberApp.entities.enums.RideRequestStatus;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {
	private long id;
	private RiderDto rider;
	private Point pickUpLocation;
	private Point dropOffLocation;
	private LocalDateTime requestedTime;
	private PaymentMethod paymentMethod;
	private RideRequestStatus rideRequestStatus;
}
