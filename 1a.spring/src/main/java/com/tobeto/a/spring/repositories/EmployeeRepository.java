package com.tobeto.a.spring.repositories;

import com.tobeto.a.spring.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
