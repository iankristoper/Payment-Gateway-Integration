package com.ian.payment_gateway_integration_system;

/**
 *
 * @author Ian Tagano
 */

public class Payment_Gateway_Integration_System 
{

    public static void main(String[] args) 
    {
        
        // Creating payment processors
        PaymentProcessor creditCardProcessor = new CreditCardProcessor();
        PaymentProcessor paypalProcessor = new PaypalProcessor();
        PaymentProcessor gcashProcessor = new GcashProcessor();
        
        
        // Payment Gateway Integration System
        PaymentGateway paymentGateway1 = new PaymentGateway(creditCardProcessor);
        PaymentGateway paymentGateway2 = new PaymentGateway(paypalProcessor);
        PaymentGateway paymentGateway3 = new PaymentGateway(gcashProcessor);
        
        
        // Processing payments
        paymentGateway1.processPayment(100.0);
        paymentGateway2.processPayment(50.0);
        paymentGateway3.processPayment(200.0);
    }
}
