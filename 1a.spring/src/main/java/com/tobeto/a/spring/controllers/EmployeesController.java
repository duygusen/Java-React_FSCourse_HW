package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.EmployeeService;
import com.tobeto.a.spring.services.dtos.employee.requests.AddEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.requests.DeleteEmployeeRequest;
import com.tobeto.a.spring.services.dtos.employee.requests.UpdateEmployeeRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/employees")
public class EmployeesController {

    private final EmployeeService employeeService;
    public EmployeesController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public void add(@RequestBody AddEmployeeRequest request){
        employeeService.add(request);
    }

    @PutMapping("{id}")
    public void update (@RequestBody UpdateEmployeeRequest request){
        employeeService.update(request);
    }

    @DeleteMapping("{id}")
    public void delete (@RequestBody DeleteEmployeeRequest request){
        employeeService.delete(request);
    }

}
