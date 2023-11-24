package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}
