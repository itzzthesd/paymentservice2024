package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentservice.dtos.InitiatePaymentDTO;
import com.example.paymentservice.services.PaymentService;

@RestController
@RequestMapping("/payments")
public class PaymentController {
    private PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("/")
    public String initiatePayment(@RequestBody InitiatePaymentDTO request) {
        return paymentService.initiatePayment(request.getOrderId(),
                request.getEmail(),
                request.getPhoneNumber(),
                request.getAmount());
    }
}

