package org.example.jirahelper.app;

import org.example.jirahelper.formatter.TicketFormatter;
import org.example.jirahelper.input.UserInputService;
import org.example.jirahelper.model.Ticket;
import org.example.jirahelper.output.ClipboardOutput;

public class JiraHelperApp {
    public static void main(String[] args) {
        UserInputService inputService = new UserInputService();
        TicketFormatter formatter = new TicketFormatter();
        ClipboardOutput clipboardOutput = new ClipboardOutput();

        Ticket ticket = inputService.collectTicketData();
        String report = formatter.format(ticket);

        System.out.println();
        System.out.println(report);

        clipboardOutput.copyToClipboard(report);
        System.out.println("Report copied to clipboard.");
    }
}
