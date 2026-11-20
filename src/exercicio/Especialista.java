package exercicio;

public class Especialista extends SupportHandler {

    @Override
    public String handle(Ticket ticket) {
        if (ticket.severity() == Severity.HIGH) {
            return "Especialista resolveu: " + ticket.description();
        }
        return super.handle(ticket);
    }
}
