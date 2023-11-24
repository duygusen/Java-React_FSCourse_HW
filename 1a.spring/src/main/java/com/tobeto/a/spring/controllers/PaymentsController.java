package com.tobeto.a.spring.controllers;

import com.tobeto.a.spring.services.abstracts.PaymentService;
import com.tobeto.a.spring.services.dtos.payment.requests.AddPaymentRequest;
import com.tobeto.a.spring.services.dtos.payment.requests.DeletePaymentRequest;
import com.tobeto.a.spring.services.dtos.payment.requests.UpdatePaymentRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/payments")
public class PaymentsController {

    private final PaymentService paymentService;

    public PaymentsController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public void add(@RequestBody AddPaymentRequest request){
        paymentService.add(request);
    }

    @PutMapping("{id}")
    public void update (@RequestBody UpdatePaymentRequest request){
        paymentService.update(request);
    }

    @DeleteMapping("{id}")
    public void delete (@RequestBody DeletePaymentRequest request){
        paymentService.delete(request);
    }
}
