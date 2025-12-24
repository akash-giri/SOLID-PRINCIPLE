package org.example.fulfillmentEngine.web;

import org.example.fulfillmentEngine.service.FulfillmentOrchestrator;

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