package org.example.fulfillmentEngine.service;

import org.example.fulfillmentEngine.core.FulfillmentStrategy;
import org.example.fulfillmentEngine.core.NotificationProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FulfillmentOrchestrator {

    // [DIP] Depending on abstractions (List of interfaces)
    private final List<FulfillmentStrategy> strategies;
    private final NotificationProvider notificationProvider;

    @Autowired
    public FulfillmentOrchestrator(List<FulfillmentStrategy> strategies, NotificationProvider notificationProvider) {
        this.strategies = strategies;
        this.notificationProvider = notificationProvider;
    }

    /**
     * [LSP] This method treats all strategies the same.
     * Problem: If a strategy threw an "UnsupportedOperationException", it would violate LSP.
     * Solution: Every strategy is guaranteed to support execute() safely.
     */
    public void process(String id, String domain) {
        FulfillmentStrategy selectedStrategy = strategies.stream()
                .filter(s -> s.canHandle(domain))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("No strategy found for: " + domain));

        selectedStrategy.execute(id);
        notificationProvider.send("Fulfillment successful for " + domain);
    }
}