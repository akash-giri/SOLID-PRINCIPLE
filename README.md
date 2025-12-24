# SOLID Fulfillment Engine

A Java Spring Boot project demonstrating the **SOLID Principles** across multiple domains (Banking, E-Commerce, Logistics).

## Architecture
- **Single Responsibility (SRP):** Business logic is decoupled from notification and persistence layers.
- **Open/Closed (OCP):** New fulfillment strategies (Banking/Retail) are added by extending interfaces without modifying the core orchestrator.
- **Liskov Substitution (LSP):** All strategies are interchangeable and follow the same execution contract.
- **Interface Segregation (ISP):** Admin and Customer APIs are strictly separated.
- **Dependency Inversion (DIP):** The engine depends on abstractions (Interfaces), not concrete implementations.