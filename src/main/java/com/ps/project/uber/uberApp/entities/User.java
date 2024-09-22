package com.ps.project.uber.uberApp.entities;

import java.util.Set;

import org.locationtech.jts.geom.Point;

import com.ps.project.uber.uberApp.entities.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "app_user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	@Column(unique = true)
	private String email;
	private String password;
	@ElementCollection(fetch = FetchType.LAZY)
	@Enumerated(EnumType.STRING)
	private Set<Role> roles;
}
