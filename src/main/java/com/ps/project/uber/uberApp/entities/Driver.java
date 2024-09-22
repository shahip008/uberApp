package com.ps.project.uber.uberApp.entities;

import org.locationtech.jts.geom.Point;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	private double rating;
	private Boolean available;
	@Column(columnDefinition = "Geometry(Point, 4326)")
	Point currentLocation;
}
