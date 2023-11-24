package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
