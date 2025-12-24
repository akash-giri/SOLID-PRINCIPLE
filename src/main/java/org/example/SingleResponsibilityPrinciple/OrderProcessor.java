package org.example.SingleResponsibilityPrinciple;

// PROBLEM: This class changes if tax rules change OR if email provider changes.
class OrderProcessor {
    public void process(Order order) {
        // 1. Calculate Tax
        // 2. Save to Database
        // 3. Send Email
    }
}

// SOLUTION: Split into specialized classes
class TaxService { public double calculate(Order o) { return o.total() * 0.18; } }
class OrderRepository { public void save(Order o) { /* DB Logic */ } }
class NotificationService { public void notify(Order o) { /* Email Logic */ } }