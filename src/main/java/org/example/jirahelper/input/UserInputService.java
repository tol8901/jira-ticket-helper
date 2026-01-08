package org.example.jirahelper.input;

import org.example.jirahelper.model.Environment;
import org.example.jirahelper.model.Ticket;

import java.util.Scanner;

public class UserInputService {

    private final Scanner scanner = new Scanner(System.in);

    public Ticket collectTicketData() {
        Ticket ticket = new Ticket();

        System.out.print("Enter summary: ");
        ticket.setSummary(scanner.nextLine());

        ticket.setEnvironment(askEnvironment());

        System.out.print("Describe observed behavior: ");
        ticket.setObservedBehavior(scanner.nextLine());

        System.out.print("Enter expected behavior: ");
        ticket.setExpectedBehavior(scanner.nextLine());

        return ticket;
    }

    private Environment askEnvironment() {
        while (true) {
            System.out.print("Enter environment name (DEV/STAGING/PROD): ");
            String input = scanner.nextLine().toUpperCase();

            try {
                return Environment.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid environment name. Try again.");
            }
        }
    }

}
