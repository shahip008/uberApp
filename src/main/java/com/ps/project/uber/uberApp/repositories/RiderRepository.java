package com.ps.project.uber.uberApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ps.project.uber.uberApp.entities.Rider;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {

}
