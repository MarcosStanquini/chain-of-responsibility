package exercicio;

public class Bot extends SupportHandler {

    @Override
    public String handle(Ticket ticket) {
        if (ticket.severity() == Severity.LOW) {
            return "Bot resolveu: " + ticket.description();
        }
        return super.handle(ticket);
    }
}
