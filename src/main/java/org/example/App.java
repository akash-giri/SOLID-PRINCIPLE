package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * [SRP] This class has one responsibility: Bootstrapping the application.
 */
@SpringBootApplication
public class App
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
        System.out.println("SOLID Fulfillment Engine is running...");
    }
}