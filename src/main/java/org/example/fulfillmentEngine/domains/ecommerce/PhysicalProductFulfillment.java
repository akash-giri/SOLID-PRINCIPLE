package org.example.fulfillmentEngine.domains.ecommerce;


import org.example.fulfillmentEngine.core.FulfillmentStrategy;
import org.springframework.stereotype.Component;

/**
 * [SRP] Responsible ONLY for E-commerce fulfillment logic.
 */
@Component
public class PhysicalProductFulfillment implements FulfillmentStrategy {
    @Override
    public void execute(String referenceId) {
        // Logic: Check warehouse, allocate SKU, generate shipping label
        System.out.println("E-COMMERCE: Packing items for Order ID: " + referenceId);
    }

    @Override
    public boolean canHandle(String type) {
        return "RETAIL".equalsIgnoreCase(type);
    }
}