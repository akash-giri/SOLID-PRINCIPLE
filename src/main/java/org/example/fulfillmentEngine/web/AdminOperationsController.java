package org.example.fulfillmentEngine.web;

import org.example.fulfillmentEngine.service.FulfillmentOrchestrator;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * [ISP] Segregated interface for Admins.
 * Includes heavy operations like "Process Fulfillment" which customers should not see.
 */
@RestController
@RequestMapping("/api/admin")
public class AdminOperationsController {

    private final FulfillmentOrchestrator orchestrator;

    public AdminOperationsController(FulfillmentOrchestrator orchestrator) {
        this.orchestrator = orchestrator;
    }

    @PostMapping("/fulfill")
    public String triggerFulfillment(@RequestParam String id, @RequestParam String domain) {
        orchestrator.process(id, domain);
        return "Request queued successfully.";
    }
}