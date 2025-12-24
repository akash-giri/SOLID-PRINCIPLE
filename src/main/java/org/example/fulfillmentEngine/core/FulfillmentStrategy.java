package org.example.fulfillmentEngine.core;

/**
 * [OCP/DIP] Abstraction for Fulfillment.
 * Problem: Adding a new domain (e.g., Healthcare) shouldn't require changing the main engine.
 * Solution: Each domain implements its own strategy.
 */
public interface FulfillmentStrategy {
    void execute(String referenceId);
    boolean canHandle(String type); // Helps the Orchestrator decide
}