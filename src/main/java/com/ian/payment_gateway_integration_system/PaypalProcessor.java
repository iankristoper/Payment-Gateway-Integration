package com.ian.payment_gateway_integration_system;

/**
 *
 * @author Ian Tagano
 */

public class PaypalProcessor implements PaymentProcessor
{
    @Override
    public void processPayment(double amount)
    {
        // Logic to process PayPal payment
        System.out.println("Processing PayPal payment for amount: $" + amount);
    }
    
}
