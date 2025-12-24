package org.example.fulfillmentEngine.core;

/**
 * [SRP] Abstraction for Notifications.
 */
public interface NotificationProvider {
    void send(String message);
}