package org.example.jirahelper.formatter;

import org.example.jirahelper.model.Environment;
import org.example.jirahelper.model.Ticket;

public class TicketFormatter {
    public String format(Ticket ticket) {
        StringBuilder sb = new StringBuilder();

        sb.append("=== Incident Report ===\n\n");
        sb.append("Summary:\n");
        sb.append(ticket.getSummary()).append("\n\n");

        sb.append("Envrionment:\n");
        sb.append(ticket.getEnvironment()).append("\n\n");

        sb.append("Observed behavior:\n");
        sb.append(ticket.getObservedBehavior()).append("\n\n");

        sb.append("Expected behavior:\n");
        sb.append(ticket.getExpectedBehavior()).append("\n");

        return sb.toString();
    }
}