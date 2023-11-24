package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.BrandService;
import com.tobeto.a.spring.services.dtos.brand.requests.AddBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.DeleteBrandRequest;
import com.tobeto.a.spring.services.dtos.brand.requests.UpdateBrandRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/brands")
public class BrandsController
{
    private BrandService brandService;
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public void add(@RequestBody AddBrandRequest request){
        brandService.add(request);
    }

    @PutMapping("{id}")
    public void update (@RequestBody UpdateBrandRequest request){
        brandService.update(request);
    }

    @DeleteMapping("{id}")
    public void delete (@RequestBody DeleteBrandRequest request){
        brandService.delete(request);
    }

}
