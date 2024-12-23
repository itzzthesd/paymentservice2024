package com.example.paymentservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stripe.model.Event;

@RestController
@RequestMapping("/stripeWebhook")
public class StripeWebhookController {
    @PostMapping
    public void receiveWebhookEvents(Event event) {
        System.out.println("Waiting");
        // 1. Read event details
        // if(event.type == payment link created
        // if(event.type == payment.recevied)


    }
}

