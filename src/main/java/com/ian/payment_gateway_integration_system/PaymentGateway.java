package com.ian.payment_gateway_integration_system;

/**
 *
 * @author Ian Tagano
 */

public class PaymentGateway 
{
    //a reference variable that can hold an object of any class that implements the PaymentProcessor interface.
    private PaymentProcessor paymentProcessor;
    
    
    //constructor of payment gateway 
    public PaymentGateway(PaymentProcessor paymentProcessor)
    {
        this.paymentProcessor = paymentProcessor;
    }
    
    
    // Method to process a payment using the PaymentProcessor associated with this PaymentGateway
    public void processPayment(double amount)
    {
        paymentProcessor.processPayment(amount);
    }
}
