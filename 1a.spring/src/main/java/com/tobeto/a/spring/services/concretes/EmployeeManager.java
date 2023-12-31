package com.tobeto.a.spring.services.concretes;

import com.tobeto.a.spring.entities.Employee;
import com.tobeto.a.spring.repositories.EmployeeRepository;
import com.tobeto.a.spring.services.abstracts.EmployeeService;
import com.tobeto.a.spring.services.dtos.employee.requests.AddEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.requests.DeleteEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.requests.UpdateEmployeeRequest;
import org.springframework.stereotype.Service;

@Service
public class EmployeeManager implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    public EmployeeManager(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void add(AddEmployeeRequest request) {
        Employee employee = new Employee();
        employee.setName(request.getName());
        employee.setSurname(request.getSurname());
        employee.setAge(request.getAge());
        employee.setAdress(request.getAdress());
        employee.setPhone(request.getPhone());
        employeeRepository.save(employee);
    }

    @Override
    public void update(UpdateEmployeeRequest request) {
        Employee employeeToUpdate = employeeRepository.findById(request.getId()).orElseThrow();
        employeeToUpdate.setName(request.getName());
        employeeToUpdate.setSurname(request.getSurname());
        employeeToUpdate.setAge(request.getAge());
        employeeToUpdate.setAdress(request.getAdress());
        employeeToUpdate.setPhone(request.getPhone());
        employeeRepository.save(employeeToUpdate);
    }

    @Override
    public void delete(DeleteEmployeeRequest request) {
        Employee employeeToDelete = employeeRepository.findById(request.getId()).orElseThrow();
        employeeRepository.delete(employeeToDelete);
    }









}
