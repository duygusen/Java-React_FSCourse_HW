package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.BrandService;
import com.tobeto.a.spring.services.abstracts.CarService;
import com.tobeto.a.spring.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.UpdateBrandRequest;
import com.tobeto.a.spring.services.dtos.car.requests.AddCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.DeleteCarRequest;
import com.tobeto.a.spring.services.dtos.car.requests.UpdateCarRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/cars")
public class CarsController {

    private final CarService carService;
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping
    public void add(@RequestBody AddCarRequest request){
        carService.add(request);
    }

    @PutMapping("{id}")
    public void update (@RequestBody UpdateCarRequest request){
        carService.update(request);
    }

    @DeleteMapping("{id}")
    public void delete (@RequestBody DeleteCarRequest request){
        carService.delete(request);
    }
}
