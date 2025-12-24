package org.example.fulfillmentEngine.web;

/**
 * [ISP] Segregated interface for Customers.
 * They should only have access to "Tracking" or "Status" methods.
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerPortalController {
    
    @GetMapping("/track/{id}")
    public String trackOrder(@PathVariable String id) {
        return "Status for " + id + ": IN_PROGRESS";
    }
}