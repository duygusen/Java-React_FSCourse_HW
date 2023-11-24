package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
