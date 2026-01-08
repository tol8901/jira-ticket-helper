package org.example.jirahelper.app;

import org.example.jirahelper.formatter.TicketFormatter;
import org.example.jirahelper.input.UserInputService;
import org.example.jirahelper.model.Ticket;

public class JiraHelperApp {
    public static void main(String[] args) {
        UserInputService inputService = new UserInputService();
        TicketFormatter formatter = new TicketFormatter();

        Ticket ticket = inputService.collectTicketData();
        String report = formatter.format(ticket);

        System.out.println();
        System.out.println(report);
    }
}
