# Jira Ticket Helper

Jira Ticket Helper is a lightweight Java-based CLI tool designed to help DevOps, SRE, and Technical Support engineers quickly create well-structured Jira tickets for incidents and bugs.

The tool focuses on **human-friendly workflows** rather than direct Jira API integration. It standardizes incident descriptions, ensures important diagnostic details are not missed, and speeds up ticket creation during operational incidents.

---

## Key Goals

- Standardize Jira ticket content for incidents and bugs
- Reduce time spent on repetitive ticket writing
- Improve clarity and consistency of incident handovers
- Keep the solution simple, safe, and extensible

---

## Features (Current Stage)

- Interactive CLI input
- Environment-aware ticket creation (DEV / STAGING / PROD)
- Structured incident report formatting
- Automatic copy of the generated report to the system clipboard
- Clean, layered architecture with separated responsibilities

---

## Example Output

=== Incident Report ===

Summary:
Service X returns 500 error on /api/orders

Environment:
STAGING

Observed behavior:
HTTP 500 error when calling /api/orders endpoint.

Expected behavior:
Service should return HTTP 200 with valid response.


After generation, the report is:
- printed to the console
- automatically copied to the clipboard (ready to paste into Jira or Slack)

---

## Project Structure
```text
src/main/java/org/example/jirahelper
├── app
│ └── JiraHelperApp.java # Application entry point
├── input
│ └── UserInputService.java # CLI input handling and validation
├── model
│ ├── Ticket.java # Domain model
│ └── Environment.java # Environment enum
├── formatter
│ └── TicketFormatter.java # Report formatting logic
└── output
  └── ClipboardOutput.java # Clipboard integration
```

The architecture intentionally separates:
- input collection
- domain modeling
- formatting
- output side effects

This keeps the tool easy to extend and maintain.

---

## Requirements

- Java 11 or higher
- Maven
- Operating system with GUI support (for clipboard functionality)

---

## Build and Run

### Build the project
```bash
mvn clean package
````
Run the application
```
java -jar target/jira-ticket-helper.jar
```

Usage Flow

1. Run the CLI application
2. Answer the prompted questions
3. Review the generated report in the console
4. Paste the report directly into Jira, Slack, or Confluence

Design Decisions

1. No Jira API integration at this stage (human-first workflow)
2. No GUI or frameworks
3. No external libraries
4. Focus on readability, simplicity, and extensibility

Planned Enhancements

- Multi-line input for logs and reproduction steps
- File output with timestamped filenames
- Ticket templates (incident / bug / task)
- Command-line flags (e.g. output target, ticket type)
- Interface-based output targets

Author Notes

This project was created as a practical engineering exercise to demonstrate:
- Java fundamentals
- CLI tool design
- DevOps-oriented thinking
- Clean and maintainable architecture

The goal is not to build a complex system, but a useful operational tool that could realistically exist in an engineering team.