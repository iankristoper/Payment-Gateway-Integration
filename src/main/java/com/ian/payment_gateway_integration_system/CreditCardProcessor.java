package com.ian.payment_gateway_integration_system;

/**
 *
 * @author Ian Tagano
 */

public class CreditCardProcessor implements PaymentProcessor
{
    @Override
    public void processPayment(double amount)
    {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment for amount: $" + amount);
    }
}
