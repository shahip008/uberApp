package com.ps.project.uber.uberApp.entities;

import java.time.LocalDateTime;

import org.hibernate.annotations.CurrentTimestamp;
import org.locationtech.jts.geom.Point;

import com.ps.project.uber.uberApp.entities.enums.PaymentMethod;
import com.ps.project.uber.uberApp.entities.enums.RideRequestStatus;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Ride {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@ManyToOne(fetch = FetchType.LAZY)
	private Rider rider;
	@Column(columnDefinition = "Geometry(Point, 4326)")
	private Point pickUpLocation;
	@Column(columnDefinition = "Geometry(Point, 4326)")
	private Point dropOffLocation;
	@CurrentTimestamp
	private LocalDateTime createdTime;
	@ManyToOne(fetch = FetchType.LAZY)
	private Driver driver;
	@Enumerated(EnumType.STRING)
	private PaymentMethod paymentMethod;
	@Enumerated(EnumType.STRING)
	private RideRequestStatus rideStatus;
	
	private Double fare;
	private LocalDateTime startedAt;
	private LocalDateTime endedAt;
}
