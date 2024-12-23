package com.example.paymentservice.payementgateways;

import org.springframework.stereotype.Service;

@Service
public class PaymentGatewayStrategyChooser {
    //private RazorpayPaymentGateway razorpayPaymentGateway;
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGatewayStrategyChooser (StripePaymentGateway stripePaymentGateway) { //StripePaymentGateway stripePaymentGateway
        //this.razorpayPaymentGateway = razorpayPaymentGateway;
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public PaymentGateway getBestPaymentGateway() {
//        int randomInt = new Random().nextInt();
//
//        if (randomInt % 2 == 0) {
//            return razorpayPaymentGateway;
//        }
//
//        return stripePaymentGateway;
        return stripePaymentGateway;
    }
}
