package org.example.fulfillmentEngine.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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