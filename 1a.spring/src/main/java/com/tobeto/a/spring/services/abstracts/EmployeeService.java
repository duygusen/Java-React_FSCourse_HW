package com.tobeto.a.spring.services.abstracts;

import com.tobeto.a.spring.services.dtos.employee.requests.AddEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.requests.DeleteEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.requests.UpdateEmployeeRequest;

public interface EmployeeService {
    void add(AddEmployeeRequest request);
    void update(UpdateEmployeeRequest request);
    void delete(DeleteEmployeeRequest request);
}
