package org.example.fulfillmentEngine.core;

/**
 * [DIP] Abstraction for Payment. 
 * Problem: Without this, the service would be tightly coupled to PayPal or Stripe.
 * Solution: By depending on this interface, we can swap payment providers easily.
 */
public interface PaymentGateway {
    void process(double amount);
}



