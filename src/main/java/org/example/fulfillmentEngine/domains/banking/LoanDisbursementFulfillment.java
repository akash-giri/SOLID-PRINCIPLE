package org.example.fulfillmentEngine.domains.banking;

import org.example.fulfillmentEngine.core.FulfillmentStrategy;

/**
 * [OCP] We added Banking fulfillment without touching E-commerce code.
 */
@Component
public class LoanDisbursementFulfillment implements FulfillmentStrategy {
    @Override
    public void execute(String referenceId) {
        // Logic: Verify bank account, trigger NEFT/RTGS
        System.out.println("BANKING: Disbursing funds for Loan ID: " + referenceId);
    }

    @Override
    public boolean canHandle(String type) {
        return "BANKING".equalsIgnoreCase(type);
    }
}