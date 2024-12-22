package com.example.paymentservice.payementgateways;

public interface PaymentGateway {
    String generatePaymentLink(String orderId, String email,
    String phoneNumber, Long amount);

}
