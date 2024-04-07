package com.ian.payment_gateway_integration_system;

/**
 *
 * @author Ian Tagano
 */

public class GcashProcessor implements PaymentProcessor
{
    @Override
    public void processPayment(double amount)
    {
        // Logic to process cryptocurrency payment
        System.out.println("Processing cryptocurrency payment for amount: $" + amount);
    }
    
}
